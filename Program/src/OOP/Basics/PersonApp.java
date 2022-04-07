package OOP.Basics;

public class PersonApp {
    public static void main(String[] args){
        System.out.println("Java OOP Person\n");
        Person person1 = new Person("Jokowi", "Jakarta");
        Person person2 = new Person("Ridwan");
        person2.address = "Palembang";
        Person person3 = new Person();
        person3.name = "Hasbullah";
        person3.address = "Turki";

        System.out.println("Person\n");

        //person1.name = "Jokowi"; >>> (Tidak perlu karena sudah ada constructor)
        person1.sayHello("Ahmed");
        person2.sayHello("Khabib");
        person3.sayHello("Putin");

        System.out.println("\nAnother Person\n");

        //class child acces
        AnotherPerson p1 = new AnotherPerson();
        p1.name = "Farauk";
        p1.address = "Kertapati";
        p1.sayHello("Shirin");
        //super keyword
        p1.sayHelloParent("Shirin");

        //super constructor
        AnotherPerson p2 = new AnotherPerson("Elan", "KM 10");
        p2.sayHello("Tiara");
        p2.sayHelloParent("Tiara");

        System.out.println("\nPolymorphism\n");

        //polymorphism code
        Employee employee = new Employee("Eko");
        employee.sayHello("Fadal");

        employee = new Person("Eka");
        employee.sayHello("Fadul");

        employee = new AnotherPerson("Eki");
        employee.sayHello("Fadil");

        sayHello(new Employee("Eka"));
        sayHello(new Person("Meka"));
        sayHello(new AnotherPerson("Megi"));

        System.out.println("\nAkhir Program.");

    }
    //polymorphism acces method
    static void sayHello(Employee employee){
        if(employee instanceof Person){
            Person person = (Person) employee;
            System.out.println("Hello my name is " + person.name);
        }else if(employee instanceof AnotherPerson){
            AnotherPerson anotherPerson = (AnotherPerson) employee;
            System.out.println("Hello my another person name is " + anotherPerson.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
