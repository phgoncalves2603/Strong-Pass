import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();        

        Password myPass = new Password(name); 
       
        System.out.println("Your Strong Pass is: "+myPass.getPassword());


        


       
        
    }
}
