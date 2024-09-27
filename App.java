public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String creator = "Yan";// Declare variables
        int number1 = 5;
        int number2 = 2;
        int multiplication;
        int addition;
        int subtraction;
        double division;

        
        System.out.println("printer App");// Print “Printer App” to the console

        System.out.println("This app is made by:");// Print “This app is made by:” to the console

        System.out.println(creator);//  Print the value of the creator to the console

        System.out.println("The value of number1 is"+ number1); // Print “The value of number1 is value”

        System.out.println("The value of number2 is"+ number2);// Print “The value of number2 is value”

        multiplication = number1 * number2;// Multiply number1 and number2
        System.out.println(number1 + "*" + number2 + "=" + multiplication);// Print multiplication result

        // Addition, subtraction, and division
        addition = number1 + number2;
        System.out.println(number1 + "+" + number2 + "=" + addition);

        subtraction = number1 - number2;
        System.out.println(number1 + "-" + number2 + "=" + subtraction);

        division = (double) number1 / number2;
        System.out.println(number1 + "/" + number2 + "=" + division);




    }
}
