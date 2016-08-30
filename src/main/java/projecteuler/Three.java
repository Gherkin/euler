package projecteuler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Three {

    public static void main(String[] args) {
        long number = 600851475143L;

        long l = System.nanoTime();
        List<Long> result = factor(number);
        System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - l));

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }


        System.out.println();
//
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

