package cglib_proxy_pattern;

/**
 * @author myp
 * 2019.05.05
 */
public class Frank {

    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下：%s", proof));
    }

    public void defend() {
        System.out.println(String.format("铁证如山，%s还Frank血汗钱", "马旭"));
    }
}
