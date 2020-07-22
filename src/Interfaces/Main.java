package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone iTelephone = new Deskphone(49050951,true);
        iTelephone.answer();

    }
}
