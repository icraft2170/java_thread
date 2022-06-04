package javaOfGod;

public class RunSync {

    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int loop = 0; loop < 5; loop++) {
            runSync.runCommonCalculate();
        }
    }

    private void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, false);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final Value : " + calc.getAmount());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
