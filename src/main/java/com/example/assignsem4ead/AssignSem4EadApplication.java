package com.example.assignsem4ead;

import com.example.assignsem4ead.Utils.Migrate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignSem4EadApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AssignSem4EadApplication.class, args);
        Migrate migrate = ctx.getBean(Migrate.class);
        migrate.dataSeeding();
    }

}
