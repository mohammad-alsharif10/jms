package com.jms.first;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jms.first.model.Employee;
import com.jms.first.util.Constants;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import java.util.stream.IntStream;

@SpringBootApplication
@EnableJms
public class JmsFirstApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JmsFirstApplication.class, args);
    }


}
