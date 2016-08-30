package projecteuler;

public class One {
    public static void main(String[] args){

        int sum = 0;

        for (int i1 = 0; i1 < 1000; i1++){
            if (i1 % 3 == 0 || i1 % 5 == 0){
                sum = sum + i1;
            }

        }
        System.out.println(sum);

    }
}
