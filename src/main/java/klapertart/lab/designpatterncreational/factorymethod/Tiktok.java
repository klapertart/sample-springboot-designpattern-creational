package klapertart.lab.designpatterncreational.factorymethod;

import lombok.Data;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Data
public class Tiktok implements SocialMedia{
    private String name = "TIKTOK";
    private String url = "http://titok.com";
    private SocialMediaType type = SocialMediaType.TIKTOK;

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
