
/**
 * Write a description of class TextInspector here.
 *
 * @author (Zuwei Liang)
 * @version (10/5/2026)
 */
import java.util.Scanner;

public class TextInspector{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Text Inspector ===");
        System.out.print("Please enter a word or phrase: ");
        String text = scan.nextLine();
        
        // Dtermine the length of the world/phrase
        System.out.println("Total Length: "+text.length());
        
        // Count the vowels in the word/phrase
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = 0; i<text.length(); i++){
            // Extract a single character using substring
            String ch = text.substring(i, i + 1);
            
            // The indexOf method check if a string is within another string
            if(vowels.indexOf(ch.toLowerCase()) != -1)
                count ++;
        }
        System.out.println("Vowel Count: " + count);
        
        // Search out word/phase for a given search term
        System.out.print("Please enter a search term: ");
        String searchTerm = scan.nextLine();
        
        int foundIndex = text.indexOf(searchTerm);
        
        if (foundIndex != -1){
            // Exract from foundIndex to the end of the string
            String remainingText = searchTerm.substring(foundIndex);
            System.out.println("Substring from match to end: " + remainingText);
            
        }
        
        System.out.print("Please enter a second word/phrase to compare: ");
        String secondWord = scan.nextLine();
        
        // Text if the strings are equal
        if (text.equals(secondWord)) {
            System.out.println("The two words/phrases are equal.");
        }else{
            //Text alphabetical oradering using comparTo
            int cmp = text.compareTo(secondWord);
            if(cmp < 0){
                System.out.println(text +"comes BEFORE " +secondWord);
            }else{
                System.out.println(text +" comes AFTER "+secondWord);
            }
        }
    }
    
    public static void submain(String[] args) {
        String potato = "potatao";
        int count = 0;
        for (int i = 0; i < potato.length(); i++) 
        {
        if (potato.substring(i, i+1).equals(“a”))
	count++;
        }

}
}