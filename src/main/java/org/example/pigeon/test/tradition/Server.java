package org.example.pigeon.test.tradition;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/tradition/provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
