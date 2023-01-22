package klapertart.lab.designpatterncreational.singleton;

import org.springframework.stereotype.Component;

/**
 * @author kurakuraninja
 * @since 20/01/23
 */

@Component
public class Counter {
    private long value = 0L;

    public long getValue(){
        return value;
    }

    public synchronized void increment() {
        this.value = value+1;
    }
}
