package Interfaces;

public class Deskphone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber,boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone doesn't have a power button!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on the deskphone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber){
            isRinging = true;
            System.out.println("The phone number is ringing!");
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
