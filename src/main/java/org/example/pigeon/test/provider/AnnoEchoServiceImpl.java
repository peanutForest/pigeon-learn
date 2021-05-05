package org.example.pigeon.test.provider;

import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import org.example.pigeon.test.AnnoEchoService;

@Service
public class AnnoEchoServiceImpl implements AnnoEchoService {

    @Override
    public String echo(String input) {
        return "annotation service echo:" + input;
    }
}
