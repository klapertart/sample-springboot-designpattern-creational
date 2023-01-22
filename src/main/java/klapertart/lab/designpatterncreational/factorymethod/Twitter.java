package klapertart.lab.designpatterncreational.factorymethod;

import lombok.Data;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Data
public class Twitter implements SocialMedia{
    private String name = "TWITTER";
    private String url = "http://twitter.com";
    private SocialMediaType type = SocialMediaType.TWITTER;

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
