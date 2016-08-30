package projecteuler;

public class Six {

    public static void main(String[] args) {
        long squareOfSum = 0;
        long sumOfSquares = 0;
        for (int i = 1; i < 101; i++) {
            squareOfSum += i;
            sumOfSquares += Math.pow(i, 2);
        }
        squareOfSum = (long) Math.pow(squareOfSum, 2);
        System.out.println(squareOfSum + " - " + sumOfSquares + " = " + (squareOfSum - sumOfSquares));
    }
}
