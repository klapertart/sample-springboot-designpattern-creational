package klapertart.lab.designpatterncreational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author kurakuraninja
 * @since 20/01/23
 */

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff(){
        return Employee.builder()
                .position(Position.STAFF)
                .salary(10_000_000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager(){
        return Employee.builder()
                .position(Position.MANAGER)
                .salary(20_000_000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident(){
        return Employee.builder()
                .position(Position.VICE_PRESIDENT)
                .salary(30_000_000L)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLevel(){
        return Employee.builder()
                .position(Position.C_LEVEL)
                .salary(40_000_000L)
                .build();
    }

}
