class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Reetika", 20);

        s1.display();
    }
}

//encapsulation---
class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Reetika");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}




//inheritence
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();   // inherited from Animal
        d1.bark();  // Dog's own method
    }
}

// public class Abstraction{
//     public static void main(string[] args){
//         Payment
//     }
// }



// interface Payment{
//     void makePayment();
//     void makePayment();
//     static void display(){
//         system.out.println(x:"payment successful");

//     }
// }
// class UPI implements Payment{
//     @override 
//     public void makePayment(){
//         System.out.println(x:"Payment using UPI");
//     }
// }


// class CreditCard implements Payment{
//     @Override 
//     public void makePayment(){
//      System.out.println(x:"payment using UPI");
//     }
// }

package lab1;

public class abstraction {
    public static void main(String[] args) {
        Payment.display();
        Payment obj1=new UPI();
        obj1.makePayment();
        Payment obj2=new CreditCard();
        obj2.makePayment();
    
    Payment obj3=new CreditCard();
          obj3.makePayment();
    
}
}
interface Payment{
    int a=10;//this is static and final by default and public
    void  makePayment();//this method is abstract and public
    static void display(){
        System.out.println("Payment method");
    }
}
class UPI implements Payment{
    @Override 
    public void makePayment(){
        System.out.println("Payment made via UPI");
    }
}
class CreditCard implements Payment{
    @Override
    public void makePayment(){
        System.out.println("Payment made via credit card");
    }
}