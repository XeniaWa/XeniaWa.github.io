import java.util.Scanner;

public class RunnApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose an operation\n"+
        "1:Addition\n"+
        "2:Subtraction\n"+
        "3:Multiplication\n");
        int operation = userInput.nextInt();

        String calVersion="Version1";

        //can be used as opposed to an if operation
        switch (operation) {
            case 1:
                {
                    System.out.println("Enter first number to add: ");
                    int num1 = userInput.nextInt();
                    System.out.println("Enter second number to add: ");
                    int num2 = userInput.nextInt();
                    int result = calc.add(num1,num2);
                    System.err.println(result+"Calculated using Magic Calculator version"+calVersion);
                    break;
                }
            case 2:
                {
                    System.out.println("Enter first number to subtract: ");
                    int num1 = userInput.nextInt();
                    System.out.println("Enter second number to subtract: ");
                    int num2 = userInput.nextInt();
                    //call method
                    int result = calc.sub(num1,num2);
                    System.err.println(result);
                    break;
                }
            case 3:
                {
                    System.out.println("Enter first number to multiply: ");
                    int num1 = userInput.nextInt();
                    System.out.println("Enter second number to multiply: ");
                    int num2 = userInput.nextInt();
                    int result = calc.times(num1,num2);
                    System.err.println(result);
                    break;
                }
            default:
                break;
        }

    }

}
