package OOP;

public class PersonApp {
    public static void main(String[] args){
        System.out.println("Java OOP Person\n");
        Person person1 = new Person();
        Person person2;
        person2 = new Person();
        Person person3 = new Person();

        person1.name = "Jokowi";
        person1.sayHello("Ahmed");

        person2.name = "Farauk";
        person2.sayHello("Khabib");

        person3.name = "Hasbullah";
        person3.sayHello("Putin");
        //System.out.println(person1);
        /* person1.firstName = "Joko";
        person1.lastName = null;
        person1.address = "Jakarta";
        person1.cetakNama(person1.firstName, person1.lastName);
        person1.setFullName(person1.firstName, person1.lastName);
        System.out.println(person1.getFullName());
        person1.sayHello("Ahmed");

        person2.firstName = null;
        person2.lastName = "Anwar";
        person2.address = "Palembang";
        person2.cetakNama(person2.firstName, person2.lastName);
        person1.setFullName(person2.firstName, person2.lastName);
        System.out.println(person2.getFullName());
        person1.sayHello("Mahmed");

        person3.firstName = "Joko";
        person3.lastName = "Anwar";
        person3.address = "Subang";
        person3.cetakNama(person3.firstName, person3.lastName);
        person1.setFullName(person3.firstName, person3.lastName);
        System.out.println(person3.getFullName());
        person1.sayHello("Ghibran"); */

        System.out.println("\nAkhir Program.");

    }
    
}
