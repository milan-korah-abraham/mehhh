public class digitsCount {
    public static void main(String[] args) {
        int num = 12112;
        int result = count(num);
        System.out.println(result);
    }

    public static int count(int n){
        if( n == 0) return 0;
        return 1 +  count(n / 10);
    }
}
