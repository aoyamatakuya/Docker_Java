package ThreadLocalHolder;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalHolder {
    // ThreadLocal型のフィールドを作成
    // initialValueで返す値は任意
    private static ThreadLocal<Map<String,String>> context = new ThreadLocal<>(){
        // initialValueメソッドをオーバーライドして、初期値を設定する
        // 結果、各スレッドに固有のMapオブジェクトを提供でき、そのスレッド内であれば、どのクラス・どのメソッドからでも、設定した値にアクセスできる。
        // これはスレッドごとに分離された「隠しグローバル変数」のようなもの。
        @Override
        public Map<String,String> initialValue() {
            return new HashMap<String,String>();
        }
    };

    public static Map<String,String> get() {
        return context.get();
    }
    // スレッドプールと組み合わせた際のメモリリーク対策として必須
    public static void remove() {
        context.remove();
    }
}