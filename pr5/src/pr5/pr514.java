package pr5;

public class pr514 {
    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion(n / 10) + "\n" + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(514)); // вызов рекурсивной функции
    }
}

