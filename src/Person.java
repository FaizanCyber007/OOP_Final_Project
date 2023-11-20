import java.util.ArrayList;

public class Person {
    private String ID;
    private String name;
    private String contactNo;
    private ArrayList<Transcation> history;

    public Person(String id, String name,String contactNo){
        setID(id);
        setName(name);
        setContactNo(contactNo);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(String contatNo) {
        this.contactNo = contatNo;
    }

    @Override
    public String toString() {
        return String.format("Person ID: %s\tPerson Name: %s\tContact Number: %s",getID(),getName(),getContactNo());
    }
}
