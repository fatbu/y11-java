class PuzzleSolver
{
  //no instance variables

  PuzzleSolver()
  {
    //empty constructor
  }

  //puzzle methods

  // Puzzle 1
  public String reverse(String str)
  {
    String s="";
    for(int i=str.length();i-->0;){
      s+=str.charAt(i);
    }
    return s;
  }

  //Puzzle 2
  public int countVowels(String str)
  {
    int t=0;
    for(int i=0;++i<str.length();){
      t+="aeiouAEIOU".contains(""+str.charAt(i))?1:0;
    }
    return t;
  }

  //Puzzle 3
  public String multString(String str, int num)
  {
    String r="";
    for(int i=0;i<num;i++){
      r+=str;
    }
    return r;
  }

  //Puzzle 4
  public String multFront(String str, int num)
  {
    str=str.substring(0,Math.min(str.length(),3));
    String r="";
    for(int i=0;i<num;i++){
      r+=str;
    }
    return r;
  }

  //Puzzle 5
  public String everyOther(String str)
  {
    String r="";
    for(int i=0;i<str.length();i+=2){
      r+=str.charAt(i);
    }
    return r;
  }

  //Puzzle 6
  public String explosion(String str)
  {
    String r="";
    for(int i=0;i++<str.length();){
      r+=str.substring(0,i);
    }
    return r;
  }

  //Puzzle 7
  public String altPairs(String str)
  {
    String r="";
    for(int i=0;i<str.length();i++){
      r+=i%4<2?str.charAt(i):r.endsWith(" ")?"":" ";
    }
    return r;
  }

}
