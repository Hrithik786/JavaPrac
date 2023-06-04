public class Recursion {
    static int first = 0;
    static int second = 1;

    //static int sum=0;
    public static int sum(int n){
        if(n==1) return n;
        return n + sum(n-1);
    }
    public static int factorial(int n){
        if(n==1) return n;
        return n * sum(n-1);
    }
    public static void fun(int n){
        if(n==0) return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);//back tracking
    }
    public static int fibo(int n){
        if(n==0) return 0;
        if (n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    public static void printfib(int n){
        if (n>0) {
         int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
            printfib(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(50));
        System.out.print(first+" "+second +" ");
        printfib(8);
    }
}
