package org.example.pigeon.learning.schema;

import org.example.pigeon.learning.EchoService;

public class EchoServiceSchemaImpl implements EchoService {

    @Override
    public String echo(String name) {
        return "schema echo service: Hello " + name;
    }
}
