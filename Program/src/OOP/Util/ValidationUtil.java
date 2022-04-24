package OOP.Util;

import OOP.Data.LoginReq;
import OOP.Error.BlankException;
import OOP.Error.ValidationException;

public class ValidationUtil {

    public static void validating(LoginReq loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }

    public static void validateRuntime(LoginReq loginRequest) {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password is blank");
        }
    }
}
