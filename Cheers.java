// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String inputWord = args[0];
            int numCheers = Integer.parseInt(args[1]);
            
            // Letters that require "an" instead of "a"
            String anLetters = "AEFHILMNORSX";
            
            // Print "Give me a/an X: X!" for each letter
            for (int i = 0; i < inputWord.length(); i++) {
                char currentChar = inputWord.charAt(i);
                char upperChar = Character.toUpperCase(currentChar);
                
                // Check if this letter needs "an" or "a"
                if (anLetters.indexOf(upperChar) != -1) {
                    System.out.println("Give me an " + upperChar + ": " + upperChar + "!");
                } else {
                    System.out.println("Give me a  " + upperChar + ": " + upperChar + "!");
                }
            }
           
            System.out.println("What does that spell?");
            
            // Print the word in uppercase, repeated numCheers times
            for (int i = 0; i < numCheers; i++) {
                System.out.println(inputWord.toUpperCase() + "!!!");
            }
        }
}
