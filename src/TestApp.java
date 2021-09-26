import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1st num: ");
        double a = Double.valueOf(in.nextLine());

        System.out.println("2nd num: ");
        double b = Double.valueOf(in.nextLine());

        System.out.println("a+b="+(a+b));
        System.out.println("Git Test Application!");
    }
}
