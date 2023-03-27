import java.util.Random;
public class App {
    public static void main(String[] args) {
        //initializing stuff
        Random rand = new Random();
        //password
        String passwordlist ="";
        //password generator
        //use letters
        char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
        //numbers
        char [] numbers = {'1','2','3','4','5','6','7','8','9','0'};
        //symbols
        char [] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};
        

        //letters
        for(int i = 0; i<rand.nextInt(8,11);i++){
            passwordlist += letters[rand.nextInt(0,letters.length)];
        }
        //symbolsg
        for (int i =0; i<rand.nextInt(2,6);i++){
            passwordlist += numbers[rand.nextInt(0,numbers.length)];
        }
        for (int i =0; i<rand.nextInt(2,5);i++){
            passwordlist += symbols[rand.nextInt(0,symbols.length)];
        }

        System.out.println("Your Strong Pass is: "+passwordlist);


        


       
        
    }
}
