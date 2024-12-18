import java.util.Scanner;
class Book{
 private String name;
 private String author;
 private double price;
 private int num_pages;

 public Book(String name,String author,double price,int num_pages){
  this.name=name;
  this.author=author;
  this.price=price;
  this.num_pages=num_pages;}
 public String getName(){
  return name;}
 public void setName(String name){
  this.name=name;}
 public String getauthor(){
  return author;}
 public void setauthor(String author){
  this.author=author;}
 public double getprice(){
  return price;}
 public void setprice(){
  this.price=price;}
 public int getnumpages(){
  return num_pages;}
 public void setnumpages(){
  this.num_pages=num_pages;}
 
 public String toString(){
  return("Book[name:"+name+" author:"+author+" price:"+price+" pages:"+num_pages);}
}
public class Bookmain{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of books");
  int n=sc.nextInt();
  sc.nextLine();
  Book[] books=new Book[n];
  for(int i=0;i<n;i++){
   System.out.println("enter the details of book"+(i+1)+":");
   System.out.print("enter name:");
   String name=sc.nextLine();
   System.out.print("enter author:");
   String author=sc.nextLine();
   System.out.print("enter price:");
   int price=sc.nextInt();
   System.out.print("enter the no of pages:");
   int num_pages=sc.nextInt();
   books[i]=new Book(name,author,price,num_pages);}
  System.out.print("\ndetails of books");
  for(int i=0;i<n;i++){
   System.out.println(books[i].toString());
  }
}
}
