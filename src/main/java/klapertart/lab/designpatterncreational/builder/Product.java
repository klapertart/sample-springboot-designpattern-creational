package klapertart.lab.designpatterncreational.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author kurakuraninja
 * @since 21/01/23
 */

@Data
@Builder
public class Product {
    private String id;
    private String name;
    private int stock;
    private long price;
}
