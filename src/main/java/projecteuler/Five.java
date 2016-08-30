package projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Five {

    public static void main(String[] args) {
        ArrayList<Long> primes = new ArrayList<>();
        for (long i = 1L; i < 20; i++) {
            List<Long> factors = factor(i);
            for (Long factor : factors) {
                if (Collections.frequency(primes, factor) <
                    Collections.frequency(factors, factor)) {
                    primes.add(factor);
                }
            }
        }
        primes.sort(Comparator.naturalOrder());
        primes.stream().sorted(Comparator.naturalOrder())
              .peek(x -> System.out.print(x + " "))
              .reduce((a, b) -> a * b).ifPresent(System.out::println);
    }


    private static List<Long> factor(long number) {
        List<Long> result = new ArrayList<>();
        for (Long factor = 2L; factor < number; factor = nextPrime(factor)) {
            if (number % factor == 0) {
                result.add(factor);
                number /= factor;
                break;
            }
        }
        if (!isPrime(number)) {
            result.addAll(factor(number));
        } else {
            result.add(number);
        }
        result.sort(Comparator.naturalOrder());

        return result;
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
