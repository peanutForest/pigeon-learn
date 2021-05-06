package org.example.pigeon.test.tradition;

import org.example.pigeon.test.EchoService;

public class EchoServiceImpl implements EchoService {

    public String echo(String name) {
        return "Hello " + name;
    }
}
