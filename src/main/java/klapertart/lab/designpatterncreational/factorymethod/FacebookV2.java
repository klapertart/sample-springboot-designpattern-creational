package klapertart.lab.designpatterncreational.factorymethod;

import lombok.Data;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Data
public class FacebookV2 implements SocialMedia{
    private String name = "FACEBOOK Versi 2";
    private String url = "http://facebook.com";
    private SocialMediaType type = SocialMediaType.FACEBOOK;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public SocialMediaType getType() {
        return this.type;
    }
}
