package org.example.pigeon.test.schema;

import org.example.pigeon.test.EchoService;

public class EchoServiceSchemaImpl implements EchoService {

    @Override
    public String echo(String name) {
        return "schema echo service: Hello " + name;
    }
}
