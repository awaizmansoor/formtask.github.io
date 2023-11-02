import java.util.Scanner;

public class panagram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine().toLowerCase(); 
            scanner.close();
    
            boolean isPangram = checkPangram(sentence);
    
            if (isPangram) {
                System.out.println("The sentence is a pangram!");
            } else {
                System.out.println("The sentence is not a pangram.");
            }
        }
    
        public static boolean checkPangram(String sentence) {
            
            boolean[] alphabetPresent = new boolean[26];
    
            for (int i = 0; i < sentence.length(); i++) {
                char currentChar = sentence.charAt(i);
    
                if (currentChar >= 'a' && currentChar <= 'z') {
                    int index = currentChar - 'a';
                    alphabetPresent[index] = true;
                }
            }
    
            
            for (boolean letterPresent : alphabetPresent) {
                if (!letterPresent) {
                    return false;
                }
            }
    
            return true;
        }
    }
     
