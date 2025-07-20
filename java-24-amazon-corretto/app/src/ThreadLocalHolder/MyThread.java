package ThreadLocalHolder;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            // 現在のスレッドに固有のMapオブジェクトを取得して、nameキーに"Alice"を設定する
            // ThreadLocalを使うと、同一のスレッド内であればどこからでもアクセス可能なデータ領域を作成できる
            ThreadLocalHolder.get().put("name", "Alice");
            // Fooインスタンスを生成して、processメソッドを呼び出す
            Foo foo = new Foo();
            foo.process();
        }finally{
            // 終了時にThreadLocalをクリーンアップする(メモリリーク対策)
            ThreadLocalHolder.remove();
        }
    }
}
