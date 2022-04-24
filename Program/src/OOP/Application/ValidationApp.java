package OOP.Application;

import OOP.Data.LoginReq;
import OOP.Error.ValidationException;
import OOP.Util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginReq loginReq = new LoginReq("", null);
        LoginReq loginReq1 = new LoginReq("Joko", null);


        try{
            ValidationUtil.validating(loginReq);
            System.out.println("Data valid.");
        }catch (ValidationException e){
            System.out.println("Data tidak valid: " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Data null: " + e.getMessage());
        }finally {
            System.out.println("\nAkhir validasi program login request.");
        }

        try{
            ValidationUtil.validating(loginReq1);
            System.out.println("Data valid.");
        }catch (ValidationException | NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("\nAkhir validasi program login request.");
        }

        //Jika error otomatis keluar dari program
        LoginReq loginReq2 = new LoginReq("Joko", "");
        ValidationUtil.validateRuntime(loginReq2);



    }
}
