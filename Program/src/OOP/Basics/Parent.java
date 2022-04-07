package OOP.Basics;

class Parent {
    String name;

    void doIt(){
        System.out.println("Do it from parent");
    }
}

//variable hiding
//gunakan nama baru untuk child class

class Child extends Parent {
    String name;

    void doIt(){
        System.out.println("Do it from child");
        System.out.println("Parent name is " + super.name);
    }
}
