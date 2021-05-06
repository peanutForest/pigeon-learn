package org.example.pigeon.test.api;

import org.example.pigeon.test.EchoService;

public class EchoServiceApiImpl implements EchoService {

    @Override
    public String echo(String name) {
        return "api echo service: Hello " + name;
    }
}
