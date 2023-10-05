package BT;

public class BT3 {
    public static String reverseUsingStringBuffer(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseUsingStringBuffer(input);
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversed);
    }
}
