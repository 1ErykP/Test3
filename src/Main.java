import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc Silni:");

        int l1 = scanner.nextInt();
        int l2 = 1;

        for(int i=1; i<=l1; i++) {
            l2 = l1 * i;
        }
        System.out.println(l2);
    }
}