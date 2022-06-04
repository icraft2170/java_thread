package javaOfGod;

public class EndlessThread extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
