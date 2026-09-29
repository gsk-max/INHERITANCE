package INHERITANCE;

//Parent class
class Animal {

 void eat() {
     System.out.println("Animal is eating");
 }
}

//Child class inherits Animal
class Dog extends Animal {

 void bark() {
     System.out.println("Dog is barking");
 }
}

//Main class
public class INHERITANCE {

 public static void main(String[] args) {

     Dog d = new Dog();

     d.eat();   // Method inherited from Animal
     d.bark();  // Method of Dog
 }
}