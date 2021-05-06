package org.example.pigeon.test.annotation;

import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import org.example.pigeon.test.EchoService;

// 服务提供方使用注解
@Service
public class EchoServiceAnnotationImpl implements EchoService {

    @Override
    public String echo(String input) {
        return "annotation echo service: Hello " + input;
    }
}
