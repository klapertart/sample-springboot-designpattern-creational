package klapertart.lab.designpatterncreational.factorymethod;

import lombok.Data;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Data
@Deprecated
public class Facebook implements SocialMedia{
    private String name = "FACEBOOK";
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
