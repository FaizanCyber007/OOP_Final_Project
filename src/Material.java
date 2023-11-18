public class Material {
    private String name;
    private String type;
    private double minRate;
    private double weight;

//Methods
    public void addWeight(double weight){this.weight+=weight;}
    public void removeWeigh(double weight){this.weight-=weight;}

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minRate=" + minRate +
                ", weight=" + weight +
                '}';
    }





    Material(String name,String type,double rate,double weight){
        setName(name);
        setType(type);
        setMinRate(rate);
        setWeight(weight);
    }

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

}
