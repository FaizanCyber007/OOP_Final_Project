import java.util.ArrayList;

public class Person {
    private String ID;
    private String name;
    private String contatNo;
    private ArrayList<Transcation> history;



    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", contatNo='" + contatNo + '\'' +
                '}';
    }












    public Person(String id, String name,String contatNo){
        setID(id);
        setName(name);
        setContatNo(contatNo);
    }



    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getContatNo() {
        return contatNo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContatNo(String contatNo) {
        this.contatNo = contatNo;
    }


}
