import java.util.Scanner;
public class exercises{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("""
        Choose the program you want to run: 
        1. Find factorial of a number n
        2. Print a fibonacci sequence upto nth term
        3. Check if a number is a prime number
        4. Reverse a number \n""");

        System.out.print("Enter your preferred choice: ");
        int choice = input.nextInt();

        switch (choice){
            case 1 -> System.out.print(findFactorial());
            case 2 -> printFibonacci();
            case 3 -> System.out.print(isPrime());
            case 4 -> System.out.print(reverseNumber());
            default -> System.out.println("Invalid input");

        }


    }

    static int findFactorial(){
        // this function prints the factorial of a number
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        int answer = 1;
        if (number < 0){
            for (int i = number; i < 0;i++){
                answer *=i;}
            return -Math.abs(answer);
        }
        else {
            for (int i = 1; i <= number;i++){
            answer *=i;
            }
        }
        return answer;}
    static void printFibonacci(){
        // This method prints the fibonanci sequence upto the nth term
        System.out.print("Enter your n: ");
        int n = input.nextInt();
        int previous = 0;
        int current = 1;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(answer);
            answer = previous + current;
            previous = current;
            current = answer;}

    }

    static boolean isPrime(){
        // This shows whether a number is a prime number or not
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i < number;i++){
            if (number%i == 0){
                count++;
            }
            if (count >=2){
                return false;

            }}
        return true;}



    static int reverseNumber(){
        // This method reverses a number
        System.out.print("Enter the you want to reverse: ");
        int number = input.nextInt();
        int reversed = 0;
        while (number > 10){
            reversed = 10*(reversed + (number%10));
            number/=10;
        }
        return reversed + number;


    }









}
