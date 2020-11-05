public class ReverseHello implements Runnable {
    private static volatile int times = 1;

    @Override
    public void run() {
        if (times <= 50) {
            Thread reverse = new Thread(new ReverseHello(), "Thread" + (++times));
            reverse.start();
            try {
                reverse.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ReverseHello(), "Thread" + times).start();
    }
}
