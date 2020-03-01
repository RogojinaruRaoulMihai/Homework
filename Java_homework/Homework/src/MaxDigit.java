import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int x = numar.nextInt();
        int a = 0;

        while (x != 0) {
            int b = x%10;
            if (a < b) {
                a = b;

        System.out.println("Cea mai mare cifra a numarului este" + a);
            }
        }
    }
}
