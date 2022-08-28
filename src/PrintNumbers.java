import java.util.Scanner;

class PrintNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Pierwsza liczba");
            int start = input.nextInt();
            System.out.println("Druga liczba");
            int end = input.nextInt();

            for (int i = start; i <= end; i++) {
                System.out.println(i + " ");
            }
            System.out.println();
            System.out.println("koniec programu, wpowadz 0");
        } while (input.nextInt() !=0);

        input.close();

    }
}
