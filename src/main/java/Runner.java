import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbę: ");
        int number = scanner.nextInt();
        System.out.println();

        if( number%number == 0 ){
            System.out.println("Liczba jest pierwsza.");
        } else {
            System.out.println("Liczba nie jest liczba pierwsza!");
        }


    }
}
