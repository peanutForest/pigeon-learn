package org.example.pigeon.learning;

import com.dianping.pigeon.remoting.invoker.concurrent.InvocationCallback;

public class EchoServiceCallback implements InvocationCallback {

    @Override
    public void onSuccess(Object result) {
        System.out.println("call back: " + result);
    }

    @Override
    public void onFailure(Throwable exception) {
        System.out.println("invoke failure: " + exception.getMessage());
    }
}
