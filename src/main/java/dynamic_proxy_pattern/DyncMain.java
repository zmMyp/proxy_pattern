package dynamic_proxy_pattern;

import static_proxy_pattern.ILawSuit;

/**
 * @author myp
 * 2019.05.05
 * 动态代理本质上仍然是代理，情况与上面介绍的完全一样，只是代理与被代理人的关系是动态确定的，
 * 例如王二狗的同事牛翠花开庭前没有确定她的代理律师，
 * 而是在开庭当天当庭选择了一个律师，映射到编程领域为这个关系是在运行时确定的。
 *
 * 注意：
 * JDK只能针对实现了接口的类做动态代理，而不能对没有实现接口的类做动态代理
 *
 * https://blog.csdn.net/ShuSheng0007/article/details/80864854
 */
public class DyncMain {

    public static void main(String[] args) {

        ILawSuit proxy= (ILawSuit)DyncProxyFactory.getDynProxy(new CuiHuaNiu());

        proxy.submit("工资流水在此");
        proxy.defend();

    }

}
