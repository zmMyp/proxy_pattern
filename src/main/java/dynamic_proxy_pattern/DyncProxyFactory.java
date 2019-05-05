package dynamic_proxy_pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author myp
 * 2019.05.05
 */
public class DyncProxyFactory {

    public static Object getDynProxy(Object target) {

        InvocationHandler handler = new DynProxyLawyer(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);

    }
}
