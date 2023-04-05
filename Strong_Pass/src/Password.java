import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Password {
    //initializing Random
    Random rand = new Random();
    //Atributes 
    //Name
    private String name;
    //PassWord
    private String passwordlist="";
    //Letters
    private char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
     //Numbers
    private char [] numbers = {'1','2','3','4','5','6','7','8','9','0'};
     //Symbols
    private char [] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};
    
    
    
    // Default Constructor
    Password(){}
    //Overload constructor
    Password(String name){
        this.name = name;
        createPassword();
        try{
        File myfile = new File("src/password.txt");
        FileOutputStream fos = new FileOutputStream(myfile,true);
        PrintWriter pw = new PrintWriter(fos);
       
        pw.println(name+" {\nPassword: "+passwordlist+"\n}");
        pw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    
    // get name
    public String getName(){
        return name;
    }
    //get Password
    public String getPassword(){
        return passwordlist;
    }
    //creating the password
    private void createPassword(){
        for(int i = 0; i<rand.nextInt(8,11);i++){
            passwordlist += letters[rand.nextInt(0,letters.length)];
            }
            //for symbolsg
            for (int i =0; i<rand.nextInt(2,6);i++){
                passwordlist += numbers[rand.nextInt(0,numbers.length)];
            }
            for (int i =0; i<rand.nextInt(2,5);i++){
                passwordlist += symbols[rand.nextInt(0,symbols.length)];
            }
        
    }
    
     
    

    
    
}
