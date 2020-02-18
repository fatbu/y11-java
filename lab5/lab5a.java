import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //This object Random helps you get randomn numbers

    System.out.println("Welcome to the Magic 8 Ball!");
    System.out.println("Enter your question and I will answer it: ");

    Scanner sc = new Scanner(System.in);
    sc.nextLine();

    Random rand = new Random();

    String[] answers = {
      "Yes",
      "Probably",
      "Ask again",
      "Ask again later",
      "Maybe",
      "Unlikely",
      "No",
      "Probably not"
    };
    //you can ask for a random string from 0 to 7
    //Everytime you run this program, a randNum will have a random value
    int randNum = rand.nextInt(8);



    //use if statements to recreate the 8 ball toy


    System.out.println("The answer is: "+answers[randNum]);

  }
}
