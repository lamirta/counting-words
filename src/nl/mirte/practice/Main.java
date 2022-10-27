package nl.mirte.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String inputText;
        String word;
        Integer frequency;
        Integer highestFreq = null;
        Integer freqForWord = null;

        Map<String,Integer> m = new HashMap<>();
        m.put("word1",1);

        List<WordFrequency> wordFrequencyList = new ArrayList<>();



        for (Map.Entry<String, Integer> newEntry: m.entrySet()) {
            wordFrequencyList.add(new WordFrequencyClass(newEntry.getKey(), newEntry.getValue()));
        }

        for (WordFrequency wf: wordFrequencyList) {
            System.out.println(wf);
        }



        WordFrequencyAnalyzerClass wfAnalyzer = new WordFrequencyAnalyzerClass(highestFreq, freqForWord){

        };

    }



}


// [] 1. Create a class which implements the following interface:
// interface WordFrequency { }
// [] 2. Create a class which implements the following interface:
// interface WordFrequencyAnalyzer { }

// [] 3. Implement the three methods defined in this interface.
// - CalculateHighestFrequency should return the highest frequency in the text (several words might actually have this frequency)
// - CalculateFrequencyForWord should return the frequency of the specified word
// - CalculateMostFrequentNWords should return a list of the most frequent „n" words in the input text, all the words returned in lower case.
// If several words have the same frequency, this method should return them in ascendant alphabetical order
// (for input text "The sun shines over the lake" and n = 3, it should return the list {("the", 2), ("lake", 1), ("over", 1) }

// REST Implementation
// [] 4. Create the same WordFrequency class, but now implement the three methods as a REST interface.

// [] 5. Implement test cases for this class. You may use 3rd party frameworks to support your tests.

