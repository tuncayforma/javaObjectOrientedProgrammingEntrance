import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        Stack b1 = new Stack();
        b1.push(8);
        b1.push(15);
        b1.push(18);
        b1.push(23);
        b1.pop();
        b1.pop();
        b1.push(23);
        b1.pop();
        System.out.println(b1.list());
        HttpResponse<String> response = 
    }
}

