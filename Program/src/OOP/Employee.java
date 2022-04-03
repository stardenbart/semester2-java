package OOP;

class Employee {

    String name;
    
    Employee(String name){
        this.name = name;
    }

    void sayHello (String paramName){
        System.out.println("Hello " + paramName + ", employee name is " + name);
    }
}
