import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //This Scanner object will let you read input from the console
    Scanner myScanner = new Scanner(System.in);

    //Use the Scanner object's method nextLine() to read the next line from input;
    System.out.print("Enter faucet drips per minute: ");

    double drips = myScanner.nextDouble();
    System.out.print("Enter number of days: ");

    int days = myScanner.nextInt();

    //use the read string as needed
    System.out.println("A faucet with "+drips+" drips per minute over "+days+" days will waste "+(1440*drips*days/(15140))+ " gallons of water");
  }
}
