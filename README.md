
# Vocabulary Tracker

**Student Name**:  Aizhan Aitpaeva

## Description

The Vocabulary Tracker is a Java-based console application that helps users build and manage their English vocabulary. Users can add new words, view the complete list, update or delete existing words, and generate reports. All data is stored in a file so the vocabulary list is saved between sessions.

## Objectives

- To provide an easy-to-use vocabulary tracking system.
- To implement file input/output operations in Java.
- To demonstrate the use of basic Java collections (ArrayList).
- To build user interaction using console-based menu-driven interface.
- To reinforce object-oriented programming with custom classes.

---

## Documentation

### Data Structures Used

- **ArrayList**: Stores the list of vocabulary words as `VocabularyEntry` objects.
- **VocabularyEntry (Class)**: Represents a word, its definition, and an example sentence.

### Algorithms and Methods

- **Main Menu Loop**: Continuously displays options to the user until they choose to exit.
- **saveVocabularyToFile(List)**: Saves all entries to a text file `vocabulary.txt`.
- **loadVocabularyFromFile(List)**: Loads entries from `vocabulary.txt` into memory.
- **Add, View, Update, Delete**: Core functions allowing manipulation of vocabulary items.

### Challenges Faced

- Handling file read/write errors (IOException).
- Ensuring robust user input (e.g., handling empty strings or incorrect options).
- Making the app intuitive with a text interface.

---

## Test Cases and Outputs

### Test Case 1: Add Word

**Input:**
```
1
happy
Feeling or showing pleasure.
She was happy with her exam results.
```

**Expected Output:**
```
Word added successfully!
```

### Test Case 2: View All Words

**Input:**
```
2
```

**Expected Output:**
```
Your Vocabulary:
- happy: Feeling or showing pleasure.
  Example: She was happy with her exam results.
```

### Test Case 3: Update Word

**Input:**
```
3
happy
Joyful and content.
She smiled because she was joyful.
```

**Expected Output:**
```
Word updated successfully!
```

### Test Case 4: Delete Word

**Input:**
```
4
happy
```

**Expected Output:**
```
Word deleted successfully!
```

### Test Case 5: Report

**Input:**
```
5
```

**Expected Output:**
```
Total words: 0
```

---

## Screenshots

### 1. Add a new word 

<img width="1163" alt="Снимок экрана 2025-05-11 в 23 02 17" src="https://github.com/user-attachments/assets/862522bc-b4bb-42d5-b13a-7ade15aed8d0" />

### 2. View all words

<img width="1278" alt="Снимок экрана 2025-05-11 в 23 02 36" src="https://github.com/user-attachments/assets/5fa39a18-edaa-4ece-9514-2f7fce5c02af" />

### 3. Update word
<img width="740" alt="Снимок экрана 2025-05-12 в 08 37 14" src="https://github.com/user-attachments/assets/f94a22a4-630c-4500-8690-300c5886c51e" />

### 4. Delete word

<img width="1295" alt="Снимок экрана 2025-05-11 в 23 04 25" src="https://github.com/user-attachments/assets/4010b1a7-3ddb-48b1-b369-6a0bc3958f75" />

### 5. Generate report
<img width="1268" alt="Снимок экрана 2025-05-11 в 23 05 17" src="https://github.com/user-attachments/assets/85252383-4b3d-43ca-8eab-ac51d941bbdb" />

---
