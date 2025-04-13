package vocabulary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<VocabularyEntry> vocabularyList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Загрузка слов при запуске программы
        loadVocabularyFromFile(vocabularyList);

        while (true) {
            System.out.println("\n=== Vocabulary Tracker ===");
            System.out.println("1. Add new word");
            System.out.println("2. View all words");
            System.out.println("3. Update a word");
            System.out.println("4. Delete a word");
            System.out.println("5. Generate report");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter new word: ");
                    String word = scanner.nextLine().trim();

                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine().trim();

                    System.out.print("Enter example: ");
                    String example = scanner.nextLine().trim();

                    vocabularyList.add(new VocabularyEntry(word, definition, example));
                    saveVocabularyToFile(vocabularyList);
                    System.out.println("Word added successfully!");
                    break;

                case "2":
                    if (vocabularyList.isEmpty()) {
                        System.out.println("No words to display.");
                    } else {
                        System.out.println("\nYour Vocabulary:");
                        for (VocabularyEntry vocabEntry : vocabularyList) {
                            System.out.println("- " + vocabEntry.getWord() + ": " + vocabEntry.getDefinition());
                            System.out.println("  Example: " + vocabEntry.getExample());
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter the word you want to update: ");
                    String updateWord = scanner.nextLine().trim();
                    boolean found = false;

                    for (VocabularyEntry vocabEntry : vocabularyList) {
                        if (vocabEntry.getWord().equalsIgnoreCase(updateWord)) {
                            System.out.print("Enter new definition: ");
                            vocabEntry.setDefinition(scanner.nextLine().trim());

                            System.out.print("Enter new example: ");
                            vocabEntry.setExample(scanner.nextLine().trim());

                            saveVocabularyToFile(vocabularyList);
                            System.out.println("Word updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Word not found.");
                    }
                    break;

                case "4":
                    System.out.print("Enter the word you want to delete: ");
                    String deleteWord = scanner.nextLine().trim();
                    boolean deleted = vocabularyList.removeIf(vocabEntry -> vocabEntry.getWord().equalsIgnoreCase(deleteWord));
                    if (deleted) {
                        saveVocabularyToFile(vocabularyList);
                        System.out.println("Word deleted successfully!");
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;

                case "5":
                    System.out.println("\n=== Report ===");
                    System.out.println("Total words: " + vocabularyList.size());
                    break;

                case "6":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 6.");
                    break;
            }
        }
    }

    public static void saveVocabularyToFile(List<VocabularyEntry> vocabularyList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vocabulary.txt"))) {
            for (VocabularyEntry entry : vocabularyList) {
                writer.write(entry.getWord() + ";" + entry.getDefinition() + ";" + entry.getExample());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving vocabulary: " + e.getMessage());
        }
    }

    public static void loadVocabularyFromFile(List<VocabularyEntry> vocabularyList) {
        File file = new File("vocabulary.txt");
        if (!file.exists()) {
            return; // Нет файла — нечего загружать
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    VocabularyEntry entry = new VocabularyEntry(parts[0], parts[1], parts[2]);
                    vocabularyList.add(entry);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading vocabulary: " + e.getMessage());
        }
    }
}
