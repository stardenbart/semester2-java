package OOP.Application;

import OOP.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Farauk", null);
        System.out.println("Akhir program.");
    }

    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak dapat konek ke database");
        }
    }
}
