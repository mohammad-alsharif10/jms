package com.jms.first.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jms.first.model.Employee;
import com.jms.first.util.Constants;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {

    public final Constants constants;
    private final JmsTemplate jmsTemplate;

    @SneakyThrows
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public Employee sendEmployee(@RequestBody Employee employee) {
        String employeeJson = new ObjectMapper().writeValueAsString(employee);
        this.jmsTemplate.convertAndSend(
                constants.DEVQUEUE1,
                employeeJson,
                message -> message
        );
        return employee;
    }

}
