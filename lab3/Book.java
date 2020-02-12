class Book {
  String bookName;
  int bookISBN;
  public Book(){
    bookName = "default";
    bookISBN = 0;
  }
  public Book(String newName, int newISBN){
    bookName = newName;
    bookISBN = newISBN;
  }
  public void setBookISBN(int newISBN){
    bookISBN = newISBN;
  }
  public int getBookISBN(){
    return bookISBN;
  }
  public void setBookName(String newName){
    bookName = newName;
  }
  public String getBookName(){
    return bookName;
  }
}