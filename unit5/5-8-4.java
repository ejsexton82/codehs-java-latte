import java.util.*;

public class WordCounts extends ConsoleProgram
{
    public void run()
    {
        String input = readLine("Enter a string: ");
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        
        // Iterate over the words in the list
        for(String word: input.toLowerCase().split(" "))
        {
            int count = 0;
            
            // Get count for existing word
            if(counts.containsKey(word)) {
                
                count = counts.get(word);
            }
            
            // Update the word count
            counts.put(word, count + 1);
        }
        
        // Output word counts alphabetically
        ArrayList<String> words = new ArrayList<String>(counts.keySet());
        Collections.sort(words);
        for(String word: words)
        {
            System.out.println(word + ": " + counts.get(word));
        }
    }
}
