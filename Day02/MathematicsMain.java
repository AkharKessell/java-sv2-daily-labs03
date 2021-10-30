package Day02;

public class MathematicsMain {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();

        System.out.println("1" + math.isPrime(1));
        System.out.println("2" + math.isPrime(2));
        System.out.println("3" + math.isPrime(3));
        System.out.println("4" + math.isPrime(4));
        System.out.println("12" + math.isPrime(12));
        System.out.println("22" + math.isPrime(22));
        System.out.println("45" + math.isPrime(45));
        System.out.println("55" + math.isPrime(55));
        System.out.println("65" + math.isPrime(65));
        System.out.println("290" + math.isPrime(290));
        System.out.println("381" + math.isPrime(381));
    }
}