package org.example.pigeon.test.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/annotation/provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
