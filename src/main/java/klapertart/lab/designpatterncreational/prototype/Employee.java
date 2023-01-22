package klapertart.lab.designpatterncreational.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kurakuraninja
 * @since 20/01/23
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String id;
    private String name;
    private Position position;
    private long salary;
}
