package Inheritance;

public class Dog extends Animal {
    private String ownerName;
    private String color;
    public Dog(String name,int body,int size,int weight,String ownerName,String color ){
        super(name,body,size,weight);
        // super calls the constructor of the parent class
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printer(){
        System.out.println(this.ownerName+" owns a dog of weight "+getWeight());
    }

}
