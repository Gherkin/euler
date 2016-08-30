package projecteuler;

public class Seven {

    public static void main(String[] args) {
        long prime = 1;
        for (int i = 1; i < 10002; i++) {
            prime = nextPrime(prime);
        }
        System.out.println(prime);
    }

    private static Long nextPrime(Long previous) {
        for (Long i = previous + 1; i < Long.MAX_VALUE; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1L;
    }

    private static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
