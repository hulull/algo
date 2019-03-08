public class BrowserUtil {
    private Stack<String> forwardStack = new Stack<>();
    private Stack<String> backStack = new Stack<>();
    // 前进
    public boolean forward(String url) {
        if (!backStack.empty()) {
            backStack.clear();
        }
        forwardStack.push(url);
        return true;
    }
    // 后退
    public String back() {
        // 只有一个页面在forwardStack里禁止后退
        if (forwardStack.size() <= 1) {
            return null;
        }
        backStack.push(forwardStack.pop());
        return forwardStack.peek(); // forwardStack的peek是当前浏览页面
    }

    public static void main(String[] args) {
        BrowserUtil browserUtil = new BrowserUtil();
        browserUtil.forward("a1");
        browserUtil.forward("b1");
        browserUtil.forward("c1");
        System.out.println(browserUtil.back());
        System.out.println(browserUtil.back());
        browserUtil.forward("d1");
        System.out.println(browserUtil.back());
        System.out.println(browserUtil.back());
        System.out.println(browserUtil.back());
    }
}
