package static_proxy_pattern;

/**
 * @author myp
 * 2019.05.05
 *
 * 静态代理是指预先确定了代理与被代理者的关系，
 * 例如王二狗的代理律师方文镜是在开庭前就确定的了。
 * 那映射到编程领域的话，就是指代理类与被代理类的依赖关系在编译期间就确定了。
 * 下面就是王二狗劳动仲裁的代码实现：
 */
public class StaticMain {

    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水在此");
        ProxyFactory.getProxy().defend();
    }
}
