class fib{
    public static void main(String[]args){
        int n=5;
        recursion(n);
    }
    static int recursion(int n){
        if(n<=1){
            return n;
        }
        int sum=recursion(n-1)+recursion(n-2);
        System.out.print(sum);
        return sum;
    }
}