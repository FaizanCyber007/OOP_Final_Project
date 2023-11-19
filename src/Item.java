public class Item {
    private String ID;
    private String type;
    private double weight;
    private double rate;

    public Item(String ID,String type,double weight,double rate){
        setID(ID);
        setType(type);
        setWeight(weight);
        setRate(rate);

    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }


    public double getRate() {
        return rate;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Item ID: %s\tItem Type: %s\tWeight: %f\tRate: %f",getID(),getType(),getWeight(),getRate());
    }


}
