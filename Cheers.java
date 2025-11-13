//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String inputWord = args[0];
            int x = 0;
            int e =0;
            char[] le = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R' ,'S', 'X'};
            while (x < inputWord.length()) {
                if (e<12) {
                if (inputWord.charAt(x) == le[e]){
                System.out.println("Give me an " + inputWord.charAt(x));
                x = x+1;
                e = 0;
        } else {
                e++;
            } 
            } else {
                System.out.println("Give me a " + inputWord.charAt(x));
                x++;
                e = 0;

            }}
           
        System.out.println("What does that spell?");
        int y = 0; 

        while (y<(Integer.parseInt(args[1]))) {
                System.out.println(inputWord + " !!!");
                y++;
        }
        }
        
}
