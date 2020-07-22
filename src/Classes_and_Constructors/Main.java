package Classes_and_Constructors;

import Classes_and_Constructors.Car;

public class Main {
    public static void main(String[] args) {
        Car porshe = new Car();
        Car maruti = new Car();
        porshe.setColour("Green");
        System.out.println(porshe.getColour());
        porshe.setModel("Porshe");
        System.out.println(porshe.getModel());
        System.out.println(porshe.getDoors());
    }
}
