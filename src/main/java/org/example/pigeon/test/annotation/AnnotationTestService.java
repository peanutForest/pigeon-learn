package org.example.pigeon.test.annotation;

import com.dianping.pigeon.remoting.invoker.config.annotation.Reference;
import org.example.pigeon.test.EchoService;

public class AnnotationTestService {

    // 服务调用方使用注解
    @Reference(timeout = 1000)
    private EchoService annoEchoService;

    public String testAnnoEcho(String input) {
        return annoEchoService.echo(input);
    }
}
