package OOP.Basics;

//class parent
class Person extends Employee{
    //field
    String firstName;
    String lastName;
    String address;
    final String country = "Indonesia";

    //constructor
    //this keyword
    Person(String name, String address){
        super(name);
        this.address = address;
    }

    Person(String name){
        super(name);
        this.address = null;
    }

    Person(){
        this(null);
    }

    //method
    void sayHello (String paramName){
        System.out.println("Hello " + paramName + ", my name is " + name);
    }

    String getFullName(){
        return this.name;
    }

    void setFullName(String firstName, String LastName){
        this.name = firstName + " " + lastName;
    }

    static void cetakNama(String firstName, String lastName){
        String info;
        if(firstName == null){
            info = lastName + " (Sementara)";
        }else if(lastName == null){
            info = firstName + " (Sementara)";
        }else{
            info = firstName + " " + lastName;
        }
        System.out.println(info);
    }

    static void cetakAddress(String address){
        System.out.println("Saya berasal dari " + address);
    }

    

}

//inheritance: class child
class AnotherPerson extends Person{
    //super constructor
    AnotherPerson(String name, String address){
        super(name, address);
    }

    AnotherPerson(String name){
        super(name, null);
    }

    AnotherPerson(){
        super(null);
    }

    //method overriding
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", another person name is " + name);
    }

    //super keyword
    void sayHelloParent(String paramName){
        super.sayHello(paramName);
    }
}