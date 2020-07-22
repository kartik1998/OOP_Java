package Polymorphism;

public class Hamburger {
    private String breadRollType;
    private String meatType;
    private int lettuceAmount;
    private int tomatoAmount;
    private int basePrice;
    private String hamburgerName;

    public Hamburger(String breadRollType, String meatType, int lettuceAmount, int tomatoAmount, int basePrice,String hamburgerName) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.lettuceAmount = lettuceAmount;
        this.tomatoAmount = tomatoAmount;
        this.basePrice = basePrice;
    }

    public int getPrice(int breadRollTypePrice,int meatTypePrice,int lettucePrice,int tomatoPrice){
        return this.basePrice+breadRollTypePrice+meatTypePrice+lettucePrice*this.lettuceAmount+this.tomatoAmount*tomatoPrice;
    }

    public void setHamburgerName(String hamburgerName) {
        this.hamburgerName = hamburgerName;
    }

    public String getHamburgerName() {
        return this.hamburgerName;
    }
}

class HealthyHamburger extends Hamburger{
    private int proteinAmount;
    private int vitaminAmount;

    public HealthyHamburger(String meatType, int lettuceAmount, int tomatoAmount, int basePrice, String hamburgerName, int proteinAmount, int vitaminAmount) {
        super("breadRyeBreadRoll", meatType, lettuceAmount, tomatoAmount, basePrice, hamburgerName);
        this.proteinAmount = proteinAmount;
        this.vitaminAmount = vitaminAmount;
    }

    public int getPrice(int breadRollTypePrice,int meatPrice,int lettucePrice,int tomatoPrice,int proteinPrice,int vitaminPrice){
        return super.getPrice(breadRollTypePrice,meatPrice,lettucePrice,tomatoPrice)+proteinPrice*this.proteinAmount+vitaminPrice*this.vitaminAmount;
    }

    public String getHamburgerName(){
        return "Healthy Hamburger";
    }
}

class DeluxeHamburger extends Hamburger{
    private int chips;
    private int drinks;

    public DeluxeHamburger(String meatType, int lettuceAmount, int tomatoAmount, int basePrice, String hamburgerName, int chips, int drinks) {
        super("Deluxe BreadRoll", meatType, lettuceAmount, tomatoAmount, basePrice, hamburgerName);
        this.chips = chips;
        this.drinks = drinks;
    }

    public int getPrice(int breadRollTypePrice, int meatPrice,int lettucePrice,int tomatoPrice,int chipsPrice,int drinksPrice){
        return super.getPrice(breadRollTypePrice,meatPrice,lettucePrice,tomatoPrice)+chipsPrice*chips+drinksPrice*drinks;
    }

    public String getHamburgerName(){
        return "Deluxe Burger";
    }
}
