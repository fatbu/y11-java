class Glass
{
  private String color ;
  private int volume;

  //class variables are shared amongst all objects of a particular class such as numJars below.
  private static int numJars = 0;

  public Glass()
  {
    this.color = "";
    this.volume = 10;
    numJars++;
  }

//1.Create an initialization constructor that initializes the value of instance variable volume.

  public Glass (String col)
  {
    color = col;
    volume = 10; // default
    numJars++;
  }

//2.Create an initialization constructor that initializes the value of instance variables volume and color
  public Glass (String col, int vol){
    color = col;
    volume = vol;
    numJars++;
  }

  public int getVolume()
  {
    return volume;
  }

  public void setVolume(int vol)
  {
    this.volume = vol;
  }

  //3.Create an accessor/getter method to access the color of an object
  public String getColor(){
    return color;
  }
  //4.Create a modifier/setter method to set the color of an object
  public void setColor(String newColor){
    color = newColor;
  }

  public String toString()
  {
    return "This Glass is: " + color + " and " + "has a volume of: " + volume;
  }
}
