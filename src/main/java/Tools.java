import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author roge
 */
public class Tools {

    public static void main(String[] args) {
        Tools tools = new Tools();
        tools.countWord("Voici pour exemple, une simple phrase !");
    }

    private void countWord(String sentence) {

        List<Integer> wordLengths = new ArrayList<>();
        Arrays.stream(sentence.split("\\s+"))
                .forEach(word -> {
                    word = word.replaceAll("[.!?,;\\\\-]", "");
                    word = word.trim();
                    int length = word.length();
                    wordLengths.add(length);
                });

        Collections.sort(wordLengths);
        int max = wordLengths.get(wordLengths.size() - 1);
        int number;
        for (int i = 1; i <= max; i++) {
            number = Collections.frequency(wordLengths, i);
            System.out.println(i + " letters: " + number);
        }

    }

}
