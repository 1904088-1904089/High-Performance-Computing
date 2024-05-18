public class Multithread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from the other side!");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
