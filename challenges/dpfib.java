class dpfib{
    static int[][]memo=new int[10][10];
    public static void main(String[] args) {
        int n=2;
        int m=2;
        int ways=find(n,m);
        System.out.println("No of total ways:"+ways);
        System.out.println(ways);
    }
    static int find(int n,int m){
        if(n==0&&m==0)return 0;
        if(n==0){
            memo[n][m]=m;
            return m;
        }
        if(m==0){
            memo[n][m]=n;
            return n;
        }
        if(memo[n][m]!=0)return memo[n][m];
        int top=find(n-1,m);
        int left=find(n,m-1);
        memo[n][m]=top+left;
        return top+left;
    }
}