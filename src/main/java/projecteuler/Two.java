package projecteuler;

public class Two {
    public static void main(String[] args){

        int n = 0;
        int k = 1;
        int z = 1;
        int sum = 0;

        while(z < 4000000){
             System.out.println(z);
            z = n + k;
            n = k;
            k = z;

            if (z % 2 == 0){
                sum += z;
            }
        }
        System.out.println(sum);
    }
}
