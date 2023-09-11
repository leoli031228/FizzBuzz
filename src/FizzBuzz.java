/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int w = 1;
        while (w < 100){
            w = getW(w);
        }
    }

    private static int getW(int w) {
        boolean divisibleBy3 = w % 3 == 0;
        boolean divisibleBy5 = w % 5 == 0;
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(w);

        }
        w = w + 1;
        return w;
    }

}
