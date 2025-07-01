public class printOnetoN {
    public static void main(String[] args) {
        int num = 33;
        // int result = printN(num);
        System.out.println(num);
    }

    public static void printN(int n ){
        if( n == 0 ) return;

         printN(n-1);
         System.out.println(n);
    }
}
