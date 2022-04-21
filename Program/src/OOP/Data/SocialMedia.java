package OOP.Data;

class SocialMedia {
    String nama;
}

class Facebook extends SocialMedia{
    final void login(String username, String password){

    }
}

//tidak bisa inherit dari kelas final.
//tidak bisa override final method di child class
//ERROR
//class FakeFacebook extends Facebook{
//    void login(String username, String password){
//
//    }
//}
