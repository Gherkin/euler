package projecteuler;

import java.util.ArrayList;
import java.util.Comparator;

public class Four {


    public static void main(String[] args) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int a = 999; a > 0; a--) {
            for (int b = 999; b > 0; b--) {
                if (isPalindrome(a * b)) {
                    results.add(a * b);
                    break;
                }
            }
        }
        results.sort(Comparator.naturalOrder());
        System.out.println(results.get(results.size() - 1));
    }


    private static boolean isPalindrome(Integer number) {
        char[] digits = number.toString().toCharArray();
        for (int i = 0; i < digits.length / 2 + 1; i++) {
            int digit1 = Integer.parseInt(String.valueOf(digits[i]));
            int digit2 = Integer.parseInt(String.valueOf(digits[digits.length - i - 1]));
            if (digit1 != digit2) {
                return false;
            }
        }

        return true;
    }
}
