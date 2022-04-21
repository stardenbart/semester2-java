package OOP.Application;

import OOP.Data.Company;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Toko Salam");

        Company.Employee employee = company.new Employee();
        employee.setName("Abdullah Farauk");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company1 = new Company();
        company1.setName("Toko Jaya Selalu");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Mohammad Farhan");

        System.out.println(employee1.getCompany());
        System.out.println(employee1.getName());

    }
}
