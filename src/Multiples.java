public class Multiples {
    public static int multiples(int n, int a, int b) {
    int count = 0;
    int i = 1;
    while(i < n){
        if(i % a == 0){
            count = count + 1;
        } else if (i % b == 0) {
            count = count + 1;
        }
        i = i + 1;
    }
    return count;
    }
}
