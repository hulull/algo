public class ArrayStack {
    private int curIndex = 0;
    private String array[];
    public ArrayStack(int size) {
        this.array = new String[size];
    }

    public boolean push(String val) {
        if (curIndex == array.length) {
            return false;
        }
        array[curIndex++] = val;
        return true;
    }

    public String pop() {
        if (curIndex == 0) {
            return null;
        }
        return array[--curIndex];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        stack.push("4");
        stack.push("5");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
