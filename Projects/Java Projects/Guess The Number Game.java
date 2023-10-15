package ak;

import java.util.Random;
import java.util.Scanner;

class game{
        public int number;
        public int inputNumber;
        public int noOfGuesses = 0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
         game(){
            Random rand = new Random();
            this.number=rand.nextInt(100);
        }
    
    void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner sc= new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you gussed it right, it was %d\nYou gussed it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low...");
        } else if (inputNumber > number) {
            System.out.println("Too High...");
        }
            return false;
        }
    }
public class Exercise1BasedOnOops {
    public static void main(String[] args) {
        /*
        Create a class game, which allows a user to play "Guess the number"
        game once. Game should have following methods:
        1: Constructor to generate random number
        2: takeUserInput() to take user input of number
        3:isCorrectNumber() to detect the number entered by the user is true
        4: getter and setter for noOfGuesses
        use properties such as noOfGuesses(int), etc to get this task done!
         */
//pachatis
        game g= new game();
        boolean b= false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
