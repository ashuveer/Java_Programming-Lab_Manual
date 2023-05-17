package packagetest; 
 public class Book 
 { 
 int book_no,book_id,book_pages; 
 public Book(int a,int b, int c) 
{ 
book_no=a;
book_id=b;
book_pages=c; 
} 
 public void book_info() 
{ 
System.out.println("The Book No"+book_no); 
System.out.println("The Book Id "+book_id); 
System.out.println("The Book Pages"+book_pages); 
} 
 }