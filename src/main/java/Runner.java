import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbę: ");
        int number = scanner.nextInt();
        System.out.println();


        for (int i=2; i <= number; i++) {
            double y = Math.sqrt(number);

            if ( number%y == 0 ) {
                System.out.println("NIE");
                break;
            } else {
                System.out.println("TAK");
                break;
            }

        }
    }
}
