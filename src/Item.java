public class Item {
    private String name;
   // private double weight;
    private String value; //char eller int mby

    public Item(String name, String value){
        this.name = name;
       //this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }*/


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return name + " | Value: " + value + " gold";
    }


}
