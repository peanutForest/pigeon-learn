package org.example.pigeon.test.interceptor;

import com.dianping.pigeon.remoting.invoker.domain.InvokerContext;
import com.dianping.pigeon.remoting.provider.domain.ProviderContext;
import com.dianping.pigeon.remoting.provider.process.ProviderInterceptor;

public class MyProviderInterceptor implements ProviderInterceptor {
    @Override
    public void preInvoke(ProviderContext providerContext) {
        System.out.println("preInvoke: " + providerContext);
    }

    @Override
    public void postInvoke(ProviderContext providerContext) {
        System.out.println("postInvoke: " + providerContext);
    }
}
