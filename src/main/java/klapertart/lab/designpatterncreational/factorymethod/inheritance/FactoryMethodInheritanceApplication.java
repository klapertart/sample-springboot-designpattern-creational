package klapertart.lab.designpatterncreational.factorymethod.inheritance;

import klapertart.lab.designpatterncreational.factorymethod.FacebookV2;
import klapertart.lab.designpatterncreational.factorymethod.SocialMedia;
import klapertart.lab.designpatterncreational.factorymethod.Tiktok;
import klapertart.lab.designpatterncreational.factorymethod.Twitter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@SpringBootApplication
public class FactoryMethodInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia facebookSocialMedia(){
        return new FacebookV2();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia twitterSocialMedia(){
        return new Twitter();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia tiktokSocialMedia(){
        return new Tiktok();
    }

}
