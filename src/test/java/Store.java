public class Store {

    public static ThreadLocal<String> value = new ThreadLocal<>();
    public static InheritableThreadLocal<String> ivalue = new InheritableThreadLocal<>();
}
