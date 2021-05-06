package org.example.pigeon.test.interceptor;

import com.dianping.pigeon.remoting.invoker.domain.InvokerContext;
import com.dianping.pigeon.remoting.invoker.process.InvokerInterceptor;

public class MyInvokerInterceptor implements InvokerInterceptor {

    @Override
    public void preInvoke(InvokerContext invokerContext) {
        System.out.println("preInvoke: " + invokerContext.getRequest());
    }

    @Override
    public void postInvoke(InvokerContext invokerContext) {
        System.out.println("postInvoke: " + invokerContext.getResponse());
    }

    @Override
    public void afterThrowing(InvokerContext invokerContext, Throwable throwable) {
        System.out.println("afterThrowing:\n" +
                                "request: " + invokerContext.getRequest() + "\n" +
                                "response: " + invokerContext.getResponse() + "\n" +
                                "e: " + throwable.getMessage() + "\n" + throwable);
    }
}
