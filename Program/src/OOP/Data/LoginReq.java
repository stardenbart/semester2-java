package OOP.Data;

public record LoginReq(String username, String password) {

    public LoginReq{
        System.out.println("Membuat objek LoginRequest");
    }

    public LoginReq(String username){
        this(username, "");
    }

    public  LoginReq(){
        this("", "");
    }

//    public void setUsername(String username){
//        this.username = username;
//    }
}
