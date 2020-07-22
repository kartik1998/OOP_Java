package Abstraction;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed){
        this.breed = breed;
        super.setName("Romy");
    }

    @Override
    public void eat() {
        System.out.println("Dogs Eat");
    }

    @Override
    public void breathe() {
        System.out.println("Dogs Breathe");
    }
}
