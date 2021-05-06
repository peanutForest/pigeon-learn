package org.example.pigeon.test.schema;

import org.example.pigeon.test.EchoService;
import org.example.pigeon.test.annotation.AnnotationTestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/schema/invoker.xml"});
        context.start();
        EchoService echoService = (EchoService)context.getBean("echoService"); // 获取远程服务代理
        String hello = echoService.echo("world");
        System.out.println( hello );
	}
}
