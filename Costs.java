import java.util.Scanner;

public class Costs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven today: ");
        int no1 = input.nextInt();

        System.out.print("Enter cost per gallon of petrol: ");
        int no2 = input.nextInt();

        System.out.print("Enter average miles per gallon: ");
        int no3 = input.nextInt();

        System.out.print("Enter todays parking fees: ");
        int no4 = input.nextInt();

        System.out.print("Enter todays toll fees: ");
        int no5 = input.nextInt();

        int sum = ((no1 / no3)* no2) + no4 + no5;
        System.out.printf("Sum is %d%n", sum);

    }
}
