public class Demo2 {

    //static int sum=0;
    public static int sum(int n){
        if(n==1) return n;
        return n + sum(n-1);
    }
    public static void fun(int n){
        if(n==0)return;
        fun(n-1);
        System.out.println(n);//back tracking
        System.out.println(n);
    }
    public static void main(String[] args) {
       // fun(5);
        System.out.println(sum(5));
    }
}
