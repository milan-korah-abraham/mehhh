public class NaturalNumbersSum {
    public static void main(String[] args) {
        int num = 5;
        int result = naturalNumbers(num);
        System.out.println(result);
    }

    public static int naturalNumbers(int n){
        if(n == 1 ) return 1;
         return n + naturalNumbers(n - 1);
    }
}
