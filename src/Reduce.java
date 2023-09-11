public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int number = 100;
        while(number != 0){
            if(number % 2 == 0){
                number = number / 2;
            }
            else{
                number = number - 1;
            }
            step = step + 1;
        }
        System.out.println(step);
    }
}
