package ThreadLocalHolder;

import java.util.Map;

public class ThreadLocalHolder {
    private static ThreadLocal<Map<String,String>> threadLocal = new ThreadLocal<>();
}
