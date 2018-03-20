
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;

@Tag("test")
public class Test1 {

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    void myFirstTest() throws InterruptedException {
        Store.value.set("1");
        Store.ivalue.set("a");

        Executors.newSingleThreadExecutor().execute(() -> System.out.println(Store.value.get()));
        Executors.newSingleThreadExecutor().execute(() -> {
            System.out.println(Store.ivalue.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("########");
            System.out.println(Store.ivalue.get());
        });
        Store.ivalue.set("b");
        Thread.sleep(500);
        System.out.println(Store.ivalue.get());
    }
}
