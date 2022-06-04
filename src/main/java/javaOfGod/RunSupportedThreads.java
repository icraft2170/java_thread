package javaOfGod;

public class RunSupportedThreads {

    public static void main(String[] args) {
        RunSupportedThreads sample = new RunSupportedThreads();
        sample.checkJoin();
    }

    private void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1 sec) = " + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(500);
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
