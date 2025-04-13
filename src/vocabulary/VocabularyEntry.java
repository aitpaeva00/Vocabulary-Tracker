package vocabulary;

public class VocabularyEntry {
    private String word;
    private String definition;
    private String example;

    public VocabularyEntry(String word, String definition, String example) {
        this.word = word;
        this.definition = definition;
        this.example = example;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    public String getExample() {
        return example;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
