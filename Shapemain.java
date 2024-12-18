import java.util.Scanner;

abstract class Shape{
 int d1,d2;
 abstract void printarea();}

class Rectangle extends Shape{
 Rectangle(int d1,int d2){
  this.d1=d1;
  this.d2=d2;}
 void printarea(){
  System.out.println("area of recatangle is"+(d1*d2));}
}

class Triangle extends Shape{
 Triangle(int d1,int d2){
  this.d1=d1;
  this.d2=d2;}
 void printarea(){
  System.out.println("area of triangle is"+(0.5*d1*d2));}
}

class Circle extends Shape{
 Circle(int d1,int d2){
  this.d1=d1;
  this.d2=1;}
 void printarea(){
  System.out.println("area of cricle is"+(3.14*d1*d1));}}

class Shapemain{
 public static void main(String[] args){
  Rectangle rectangle=new Rectangle(3,4);
  rectangle.printarea();
  Triangle triangle=new Triangle(3,4);
  triangle.printarea();
  Circle circle=new Circle(3,4);
  circle.printarea(); }}
