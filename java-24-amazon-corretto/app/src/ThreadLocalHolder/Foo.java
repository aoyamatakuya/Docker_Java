package ThreadLocalHolder;

public class Foo {
    public void process() {
        // ThreadLocal上のマップから同じキーで値を取得する
        String value = ThreadLocalHolder.get().get("name");
        System.out.println("[Foo#process] name => " +value);
    }
}
