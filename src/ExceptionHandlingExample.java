public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw exception
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing fourth element: " + numbers[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e);
        } finally {
            // Code that will always execute
            System.out.println("Finally block executed.");
        }

        // Code after try-catch-finally block
        System.out.println("Rest of the code.");
    }
}
