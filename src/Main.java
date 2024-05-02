import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();

        if (number <= 49) {
            System.out.println("grade F" + number);
        }
        else if (number > 49 && number <= 60){
            System.out.println("grade D" + number);
        }
        else if (number > 60 && number <= 70) {
            System.out.println("grade C" + number);
        }
        else if (number > 70 && number <= 80) {
            System.out.println("grade B" + number);
        }
        else if (number > 80 && number <= 100) {
            System.out.println("grade A" + number);
        }
    }
}