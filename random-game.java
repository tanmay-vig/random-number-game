
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        int randomNumber = (int) (Math.random() * 100);
        
        
        int userInput;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the random game \n"+
                           "A random is generated and you have to guess it\n" + 
                           "You will be given infinite chances to guess but if you want to leave type negative number\n"+
                           "The number will be between 0 to 100\n"+
                           "Happy Guessing !!!!!");
        
        do{
            System.out.print("Enter the number: ");
            userInput = sc.nextInt();
            
            if (userInput == randomNumber )
            {
                System.out.println("You guessed it !!!!!");
                break;
            }
            else if (userInput < randomNumber){
                System.out.println("Random Number is larger");
            }
            else{
                System.out.println("Random Number is smaller");
            }
        } while(userInput >= 0);
        
        System.out.println("The random number is : "+randomNumber);
    }
}
