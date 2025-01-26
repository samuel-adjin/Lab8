package prob4;

import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static int countWords(List<String> words, char c, char d, int len){
       return (int) words.stream().filter(word -> word.length() ==len)
                .filter(word -> word.contains(""+c)).filter(word -> !word.contains(""+d)).count();


    }
    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        List<String> words = Arrays.asList("Leo", "Lad", "CR7", "Dog", "Goat", "Lid");
        System.out.println(countWords.countWords(words, 'L', 'C', 3));
    }
}
