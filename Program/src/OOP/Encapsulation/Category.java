package OOP.Encapsulation;

public class Category {
    //agar field tidak diubah null atau sebagainya semau user.
    private String id;
    private boolean expensive;

    public String getId(){
        return id;
    }

    public void setId(String id){
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive(){
        return expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
}
