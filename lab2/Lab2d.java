import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //This Scanner object will let you read input from the console
    Scanner myScanner = new Scanner(System.in);

    System.out.println("1. Choose 4 digits\n2. Make two four-digit numbers with these digits\n3. Subtract the smaller from the larger.\n4. Secretly pick a non-zero digit from the difference.\n5. Enter the remaining three digits, one per line");

    //Use the Scanner object's method nextLine() to read the next line from input;
    int a=myScanner.nextInt();
    int b=myScanner.nextInt();
    int c=myScanner.nextInt();


    //use the read string as needed
    System.out.println("Your secret digit is "+(9-(a+b+c)%9));
  }
}
