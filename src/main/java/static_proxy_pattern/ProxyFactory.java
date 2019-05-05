package static_proxy_pattern;

/**
 * @author myp
 * 2019.05.05
 */
public class ProxyFactory {

    public static ILawSuit getProxy(){
        return new ProxyLawyer(new SecondDogWang());
    }
}
