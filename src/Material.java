public class Material {
    private String name;
    private String type;
    private double minRate;
    private double weight;

    Material(String name,String type,double rate,double weight){
        setName(name);
        setType(type);
        setMinRate(rate);
        setWeight(weight);
    }

//Methods
    public void addWeight(double weight){this.weight+=weight;}
    public void removeWeigh(double weight){this.weight-=weight;}



    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setMinRate(double rate) {
        this.minRate = rate;
    }

    public double getMinRate() {
        return minRate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\tType: %s\tRate: %f\tWeight: %f",getName(),getType(),getMinRate(),getWeight());
    }

}
