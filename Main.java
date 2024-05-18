
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Multithread multithread = new Multithread();
        Multithread multithread2 = new Multithread();
        multithread.start();
        multithread2.start();
    }
}