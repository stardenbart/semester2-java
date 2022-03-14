package OOP;


//class
class Person {
    //field
    String firstName;
    String lastName;
    String address;
    String name;
    final String country = "Indonesia";

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