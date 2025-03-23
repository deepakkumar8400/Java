class dtob {
    static String s = "";
    static void fn(int n) {
        if (n == 0) {
            return;
        }
        s = s + (n % 2);  // Add remainder (0 or 1)

        fn(n / 2);   // Divide by 2 for binary conversion
        //s = s + (n % 2);  // Add remainder (0 or 1)
    }
    public static void main(String args[]) {
        fn(100);
        System.out.println(s);  // Output: 1100100
    }
}
