package org.example.pigeon.test.api;

import com.dianping.pigeon.remoting.ServiceFactory;
import org.example.pigeon.test.EchoService;

public class Client {

    public static void main(String[] args) throws Exception {
//        EchoService echoService = ServiceFactory.getService(EchoService.class); // 获取远程服务代理
//        String hello = echoService.echo("world");
//        System.out.println( hello );

        // 如果调用的服务定义了特定的url，可以参考如下配置
        EchoService echoService1 = ServiceFactory.getService("http://localhost/api/echoService", EchoService.class, 2000);
        String hello1 = echoService1.echo("world1");
        System.out.println(hello1);
	}
}
