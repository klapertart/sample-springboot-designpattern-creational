package klapertart.lab.designpatterncreational.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@SpringBootTest(classes = FactoryMethodApplication.class)
public class FactoryMethodTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testFactoryMethod() {
        Assertions.assertThrows(BeanCreationException.class, () -> {
            SocialMedia instagram = context.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        });

        SocialMedia facebook = context.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        Assertions.assertEquals("FACEBOOK Versi 2",facebook.getName());
    }
}
