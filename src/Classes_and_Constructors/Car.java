package Classes_and_Constructors;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getDoors(){
        return this.doors;
    }
    public int getWheels(){
        return this.wheels;
    }
    public String getModel(){
        return this.model;
    }
    public String getEngine(){
        return this.engine;
    }
    public String getColour(){
        return this.colour;
    }

}
