package org.example.pigeon.learning.api;

import org.example.pigeon.learning.EchoService;

public class EchoServiceApiImpl implements EchoService {

    @Override
    public String echo(String name) {
        return "api echo service: Hello " + name;
    }
}
