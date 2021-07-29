package com.jms.second.jmsListner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jms.second.model.Employee;
import lombok.SneakyThrows;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Service
public class EmployeeListener {

    @SneakyThrows
    @JmsListener(destination = "DEV.QUEUE.1")
    public void receive(Message message) throws JMSException {
        TextMessage textMessage = (TextMessage) message;
        String employeeJson = textMessage.getText();
        Employee employee = new ObjectMapper().readValue(employeeJson, Employee.class);
        String firstName = employee.getFirstName();
    }
}
