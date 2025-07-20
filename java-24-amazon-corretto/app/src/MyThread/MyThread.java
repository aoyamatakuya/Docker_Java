package MyThread;

public class MyThread extends Thread{
    private int data;
    // Thread作成用のクラス
    public MyThread(int data){
        this.data = data;
    }
    @Override
    public void run(){
        long total = 0;
        for(int i = 0; i < 100000; i++){//10万回
            total += data;
        }
        System.out.println("Total: " + total);
    }
}
