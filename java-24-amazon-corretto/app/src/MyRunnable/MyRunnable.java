package MyRunnable;

public class MyRunnable implements Runnable {
    private int data;
    // Thread作成用のクラス
    public MyRunnable(int data){
        this.data = data;
    }
    @Override
    public void run() {
        long total = 0;
        for(int i = 0; i < 100000; i++){
            total += data;
        }
        System.out.println("Total: " + total);
    }
}
