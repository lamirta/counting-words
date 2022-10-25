package nl.mirte.practice;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {

    @Override
    public int calculateHighestFrequency(String text) {
        return 0;
    }
    // CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        return 0;
    }

    @Override
    public WordFrequency[] calculateMostFrequentNWords(String text, int n) {
        return new WordFrequency[0];
    }

}
