public class Main {
    public static void main(String[] args) {
        Stack b1 = new Stack();
        b1.push(52);
        b1.push(55);
        b1.push(70);
        b1.push(80);
        b1.search(70);
        b1.pop();
        b1.size();
        b1.pop();
        b1.size();
        System.out.println(b1.list());
    }
}

