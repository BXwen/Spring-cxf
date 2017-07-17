package com.db.cis.client;

import com.db.cis.cxf.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xiaowen
 * @Package com.db.cis.client
 **/
public class HelloWorldClient {
    private HelloWorldClient() {
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"});
        HelloWorld client = (HelloWorld) context.getBean("client");
        String response = client.sayHello();
        System.out.println("Response: test  " + response);
        System.exit(0);
    }
}
