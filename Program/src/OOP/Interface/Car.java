package OOP.Interface;
//interface inheritance more than 1
public interface Car extends HasBrand, Maintenance {
    //field otomatis public dan unchangable
    void drive();
    int getTier();
    default boolean isBig(){
        return false;
    }
    
}

