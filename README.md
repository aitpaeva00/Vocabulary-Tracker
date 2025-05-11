
# Vocabulary Tracker

This is a simple Java console application that allows users to manage their personal vocabulary list. It supports adding, updating, deleting, and viewing vocabulary entries, along with saving and loading the vocabulary from a file.

## Features

- Add new vocabulary words with definitions and examples
- View all saved words
- Update an existing word
- Delete a word from the list
- Generate a simple report (total word count)
- Save and load data from a file (`vocabulary.txt`)

## How It Works

Upon starting the application, it attempts to load the vocabulary list from a file named `vocabulary.txt`. The user is then presented with a menu of options:

1. **Add new word** – Prompt to enter a new word, definition, and example.
2. **View all words** – Displays all saved words in a readable format.
3. **Update a word** – Update the definition and example for a word.
4. **Delete a word** – Remove a word from the list.
5. **Generate report** – Shows total number of words.
6. **Exit** – Saves the data and exits the application.

### Example Data Format

The vocabulary is stored in the following format:

```
word;definition;example
```

Example:
```
hello;A greeting or expression of goodwill;He said "hello" when he entered the room.
```

## Project Structure

- `Main.java` – Contains the main application logic and menu interaction.
- `VocabularyEntry.java` – Class representing a vocabulary entry (word, definition, example).
- `vocabulary.txt` – The file where vocabulary data is saved.

## Requirements

- Java Development Kit (JDK)
- An IDE like IntelliJ IDEA or any Java-supporting editor

## How to Run

1. Open the project in your IDE.
2. Compile and run `Main.java`.
3. Use the console to interact with the vocabulary tracker.

## Future Improvements

- Add search functionality.
- Enhance file handling with error recovery.
- Optionally switch to a database backend.
