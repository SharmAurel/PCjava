package src;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Chaine t1 = new Chaine("Souvent, pour s’amuser, les hommes d’équipage \n");
        Chaine t2 = new Chaine("Prennent des goélands, vastes oiseaux des mers,\n");
        Chaine t3 = new Chaine("Qui suivent, indolents compagnons de voyage,\n");
        Chaine t4 = new Chaine("Le navire glissant sur les gouf f res amers.\n");

        t1.start();
        t2.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();



    }
}
