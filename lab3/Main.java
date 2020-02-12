class Main {
  public static void main(String[] args) {
    //Test that all methods work. 
    
    Book book = new Book();
    book.setBookName("From Mountain to Mountain");
    System.out.println(book.getBookName());
    
    Book book2 = new Book ("Chronicle of a death foretold", 123456);
    System.out.println(book2.getBookName());
    System.out.println(book2.getBookISBN());
    
    System.out.println(book2);
    
    

  }
}