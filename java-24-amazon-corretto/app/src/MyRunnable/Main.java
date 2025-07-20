package MyRunnable;
// スレッドの作成方法2：Runnableインターフェースを実装する
public class Main {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable(3);
        MyRunnable runnable2 = new MyRunnable(2);
        Thread thread1 = new Thread(runnable1);//スレッド生成
        Thread thread2 = new Thread(runnable2);//スレッド生成
        thread1.start();//スレッド開始
        thread2.start();//スレッド開始

        // ラムダ式でも可能
        int data = 1;
        Thread t = new Thread(() -> {
            int total = 0;
            for (int i = 0; i < 100000; i++) {
                total += data;
            }
            System.out.println("Total: " + total);
        });
        t.start();
    }
}
