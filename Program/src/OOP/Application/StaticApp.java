package OOP.Application;

import static OOP.Data.Application.PROCESSOR;
import OOP.Data.Country;
import static OOP.Data.Konstant.*;
import OOP.Util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,12,34,56,78,64,54)
        );

        Country.City city = new Country.City();
        city.setName("Palembang");

        System.out.println(city.getName());

        System.out.println(PROCESSOR);

    }
}
