package src;

public class Chaine extends Thread {

    private String s;

    public Chaine(String s) {
        this.s = s;
    }

    public void run(){
        System.out.println(s);
    }
}
