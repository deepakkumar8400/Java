class fib{
    static int[] arr = new int[7];
    static int k = 0;
    public static void main(String[] args){
        int n = 5;
        recursion(n, 0);
    }
    static int recursion(int n, int m){
        if (n <= 1){
            arr[n] = n;
            if (n != 0){
                System.out.println(n);
            }
            return n;
        }
        if (arr[n] != 0){
            return arr[n];
        }
        int sum = recursion(n - 1, m + 1) + recursion(n - 2, m + 1);
        arr[n] = sum;
        System.out.println(sum);
        return sum;
    }
}