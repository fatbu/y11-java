import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Example
    // Glass mug = new Glass();
    // System.out.println(mug.getVolume());
    // System.out.println(mug.toString());

// 1.Create 2 more objects using the no argument constructors.
    Glass mug = new Glass();
    Glass mug2 = new Glass();



//2. Read, from input, 2 strings and save them as variables. Each will represent a color.
    Scanner input = new Scanner(System.in);
    System.out.print("Color 1: ");
    String color = input.nextLine();
    System.out.print("Color 2: ");
    String color2 = input.nextLine();


//3. Use modifier methods for EACH object to change their color values
//   to the values read from input in step 2. Object 1 should use input 1, Object 2 - Input 2.


    mug.setColor(color);
    mug2.setColor(color2);

//4. Print each of the object"s color in the format shown in the example run.
    System.out.println();
    System.out.println("The first glass is "+mug.getColor()+".");
    System.out.println("The second glass is "+mug2.getColor()+".");




//5. Read, from input again, 2 colors (as strings) and 2 volume measures (as ints).
    System.out.println();

    System.out.print("Next Color 1: ");
    String color3 = input.nextLine();
    System.out.print("Next Color 2: ");
    String color4 = input.nextLine();
    System.out.print("Volume 1: ");
    int volume1 = input.nextInt();
    System.out.print("Volume 2: ");
    int volume2 = input.nextInt();


//6. Create 2 more objects of the Glass class, but this time use the initialization constructor. Do NOT use the modifier methods for this set of objects.
    Glass mug3 = new Glass(color3,volume1);
    Glass mug4 = new Glass(color4,volume2);


//7. Print each of the object"s color and volume. You MUST use accessor methods or toString().
    System.out.println();

        System.out.println("The third glass is "+mug3.getColor()+" and has a volume of "+mug3.getVolume()+".");
    System.out.println("The fourth glass is "+mug4.getColor()+" and has a volume of "+mug4.getVolume()+".");

  }
}
