import java.util.Scanner; 

public class sumaverage {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int numberOfElements;

        
        while (true) {
            System.out.print("Enter the number of elements you want to enter (e.g., 5): ");
            if (scanner.hasNextInt()) { 
                numberOfElements = scanner.nextInt();
                if (numberOfElements > 0) {
                    break; 
                } else {
                    System.out.println("Please enter a positive number of elements.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        
        double[] numbers = new double[numberOfElements];
        double sum = 0; 

        System.out.println("Enter " + numberOfElements + " numbers:");

        
        for (int i = 0; i < numberOfElements; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) { 
                    numbers[i] = scanner.nextDouble();
                    sum += numbers[i]; 
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }
        }

        
        double average = 0;
        if (numberOfElements > 0) { 
            average = sum / numberOfElements;
        }

        System.out.println("\n--- Results ---");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        
        scanner.close();
    }
}

