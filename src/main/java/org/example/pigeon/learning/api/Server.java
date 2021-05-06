package org.example.pigeon.learning.api;

import com.dianping.pigeon.remoting.ServiceFactory;
import com.dianping.pigeon.remoting.provider.config.ProviderConfig;
import org.example.pigeon.learning.EchoService;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException {
//        ServiceFactory.addService(EchoService.class, new EchoServiceApiImpl());

        // 服务的url纪委服务的唯一性标识，在这里默认只能为接口类名
        ProviderConfig providerConfig = new ProviderConfig(EchoService.class, new EchoServiceApiImpl());
        providerConfig.setUrl("http://localhost/api/echoService");
        ServiceFactory.addService(providerConfig);
        System.in.read(); // 按任意键退出
    }
}
