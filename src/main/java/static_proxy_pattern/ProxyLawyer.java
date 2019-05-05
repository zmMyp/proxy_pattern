package static_proxy_pattern;

/**
 * @author myp
 * 2019.05.05
 */
public class ProxyLawyer implements ILawSuit {

    ILawSuit plaintiff;//持有要代理的那个对象
    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff=plaintiff;
    }


    public void submit(String proof) {
        plaintiff.submit(proof);
    }


    public void defend() {
        plaintiff.defend();
    }
}
