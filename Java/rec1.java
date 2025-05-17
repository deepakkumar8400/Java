class rec1{
    public static void main(String[]args){
        fn(10);
    }
    static void fn(int n){
        
        if(n==0){
            return;
        }
        fn(n-1);
        System.out.println(n); 
    }
}