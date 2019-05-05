package dynamic_proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author myp
 * 2019.05.05
 */
public class DynProxyLawyer implements InvocationHandler {

    private Object target;//被代理的对象

    public DynProxyLawyer(Object obj) {
        this.target = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展：" + method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
}
