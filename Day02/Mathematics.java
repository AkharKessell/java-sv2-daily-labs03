package Day02;

public class Mathematics {
    public static void main(String[] args) {
        int[] numbers = {
                2,
                15,
                17,
                55,
                63,
                76,
                83,
                91,
                99,
        };

        for(int number : numbers){
            System.out.println( number + ": " + isPrime(number) );
        }
    }
    private static boolean isPrime(int number) {
        if(number < 2)
            return false;
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
