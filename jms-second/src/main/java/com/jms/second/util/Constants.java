package com.jms.second.util;

import com.ibm.mq.jms.MQQueue;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;

@Service
public class Constants {

    public final String QUEUE = "DEV.QUEUE.1";
    public final MQQueue DEVQUEUE1=new MQQueue("DEV.QUEUE.1");

    public Constants() throws JMSException {
    }
}
