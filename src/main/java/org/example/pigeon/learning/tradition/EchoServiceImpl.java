package org.example.pigeon.learning.tradition;

import org.example.pigeon.learning.EchoService;

public class EchoServiceImpl implements EchoService {

    public String echo(String name) {
        return "Hello " + name;
    }
}
