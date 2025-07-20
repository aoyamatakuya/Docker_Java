package MyThread;
// スレッドの作成方法1：Threadクラスを継承する
public class Main {
    public static void main(String[] args) { // メインスレッド
        MyThread thread1 = new MyThread(3);// スレッド生成
        MyThread thread2 = new MyThread(2);// スレッド生成
        // start() = スレッドを実行可能状態にする
        // CPUが割り当てられた場合、run()が実行される = 実際に処理が実行される
        // sleep()等 = 待機状態にする
        thread1.start();
        thread2.start();
    }
}
