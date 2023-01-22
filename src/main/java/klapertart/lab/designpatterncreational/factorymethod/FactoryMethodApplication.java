package klapertart.lab.designpatterncreational.factorymethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@SpringBootApplication
public class FactoryMethodApplication {
    @Bean
    @Scope("prototype")
    public SocialMedia getSocialMedia(SocialMediaType type) throws IllegalAccessException {
        if (type == SocialMediaType.FACEBOOK){
            return new FacebookV2();
        }else if(type == SocialMediaType.TWITTER){
            return new Twitter();
        }else if(type == SocialMediaType.TIKTOK){
            return new Tiktok();
        }else {
            throw new IllegalAccessException("Unknown social media type");
        }
    }
}
