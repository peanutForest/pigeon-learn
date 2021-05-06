package org.example.pigeon.learning.tradition;

import org.example.pigeon.learning.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/tradition/invoker.xml"});
        context.start();
        EchoService echoService = (EchoService)context.getBean("echoService"); // 获取远程服务代理
        String hello = echoService.echo("world");
        System.out.println( hello );

        // 客户端采用callback回调模式调用服务，客户端将请求提交给pigeon后立马返回，不等待返回结果
        // pigeon负责接收返回结果并传递给回调对象
        EchoService echoServiceWithCallback = (EchoService) context.getBean("echoServiceWithCallback");
        echoServiceWithCallback.echo("world-1");
	}
}
