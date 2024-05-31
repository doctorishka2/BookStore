package lesson3;

public class Test {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number '" + i + "' is divisible by three");
            } else if (i % 2 == 0) {

//                if (i % 3 == 0) {
//                    System.out.println("The number '" + i + "' is divisible by three");
//                }
                System.out.println("The number '" + i + "' is even");
            } else if (i % 2 == 1 && i % 3 == 0) {
                System.out.println("The number '" + i + "' is divisible by three");
            } else if (i % 2 == 1) {
                System.out.println("The number '" + i + "' is odd");
            }
        }
        }
    }
