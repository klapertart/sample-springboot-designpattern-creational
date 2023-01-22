package klapertart.lab.designpatterncreational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kurakuraninja
 * @since 20/01/23
 */

@SpringBootTest
public class CounterTest {

    @Autowired
    private Counter counter;

    @Test
    void testSingleton() {
        Counter counter1 = counter;
        counter1.increment();
        Counter counter2 = counter;
        counter2.increment();
        Counter counter3 = counter;
        counter3.increment();
        Counter counter4 = counter;

        Assertions.assertEquals(counter1,counter4);
        Assertions.assertEquals(counter2,counter4);
        Assertions.assertEquals(3,counter4.getValue());

    }

    @Test
    void testRaceCondition() throws InterruptedException {
        Counter counter1 = this.counter;
        Counter counter2 = this.counter;

        threadSingleton(counter1,1000000);
        threadSingleton(counter2,1000000);

        Thread.sleep(5000);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
    }

    private void threadSingleton(Counter counter, int loop){
        new Thread(()->{
            for (int i = 0; i < loop; i++) {
                counter.increment();
            }
        }).start();
    }
}
