package Inheritance;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter = false;

    public Printer(int tonerLevel,int numberOfPagesPrinted,boolean duplexPrinter){
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int amount){
        this.tonerLevel = Math.min(100,this.tonerLevel+amount);
    }

    public void printPage(int amount,int pagesRequired){
        this.tonerLevel -= amount;
        if(this.tonerLevel<0){
            System.out.println("Not enough ink!");
            return;
        }
        if(duplexPrinter){
            this.numberOfPagesPrinted += pagesRequired/2;
            if(pagesRequired%2!=0){
                numberOfPagesPrinted++;
            }
        }else{
            this.numberOfPagesPrinted += pagesRequired;
        }
    }
}
