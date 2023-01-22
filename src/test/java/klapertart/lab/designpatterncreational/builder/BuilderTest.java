package klapertart.lab.designpatterncreational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kurakuraninja
 * @since 21/01/23
 */

@SpringBootTest
public class BuilderTest {

    @Test
    void test() {
        Product product = Product.builder()
                .id("001")
                .name("wafer")
                .price(1000L)
                .stock(45)
                .build();

        Assertions.assertNotNull(product);
        Assertions.assertEquals("001",product.getId());
    }
}
