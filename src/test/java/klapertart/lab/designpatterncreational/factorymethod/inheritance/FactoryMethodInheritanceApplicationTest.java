package klapertart.lab.designpatterncreational.factorymethod.inheritance;

import klapertart.lab.designpatterncreational.factorymethod.SocialMedia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethodInheritanceApplication.class)
class FactoryMethodInheritanceApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void test() {
        SocialMedia facebookSocialMedia = context.getBean("facebookSocialMedia", SocialMedia.class);

        Assertions.assertNotNull(facebookSocialMedia);
        Assertions.assertEquals("FACEBOOK Versi 2",facebookSocialMedia.getName());
    }
}