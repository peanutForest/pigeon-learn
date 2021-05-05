package org.example.pigeon.test.invoker;

import com.dianping.pigeon.remoting.invoker.config.annotation.Reference;
import org.example.pigeon.test.AnnoEchoService;

public class AnnotationTestService {

    @Reference(timeout = 1000)
    private AnnoEchoService annoEchoService;

    public String testAnnoEcho(String input) {
        return annoEchoService.echo(input);
    }
}
