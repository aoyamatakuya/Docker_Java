package MyParaThread;

public class SleepThread extends Thread{
    private int timer;
    public SleepThread(String name,int timer){
        // Threadクラスのコンストラクタを呼び出し、スレッド名を設定する
        super(name);
        this.timer = timer;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(timer);
            System.out.println(getName() + " is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
