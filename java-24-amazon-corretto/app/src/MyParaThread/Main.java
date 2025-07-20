package MyParaThread;

public class Main {
    public static void main(String[] args) {
        SleepThread thread1 = new SleepThread("私は遅いスレッドです。", 2000);
        SleepThread thread2 = new SleepThread("私は早いスレッドです。", 1000);
        thread1.start();
        thread2.start();
    }
}
