package klapertart.lab.designpatterncreational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author kurakuraninja
 * @since 20/01/23
 */
@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void test() {
        Employee employeeStaff = context.getBean("employeeStaff", Employee.class);
        employeeStaff.setName("Hamka");

        Employee employeeManager = context.getBean("employeeManager", Employee.class);
        employeeManager.setName("Otong");

        Assertions.assertNotEquals(employeeStaff,employeeManager);

        System.out.println(employeeStaff.toString());
        System.out.println(employeeManager.toString());
    }
}
