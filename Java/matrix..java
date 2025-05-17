class matrix {
    public static void main(String args[]){
        int n=2;
        int ii=find(n,0,0);
        System.out.println(ii);
    }
    static int find(int n,int r,int b){
        if(r==n&&b==n){
            return 1;
        }
        if(r>n||b>n){
            return 0;
        }
        int right =find(n,r+1,b);
        int bottom =find(n,r,b+1);
        return right+bottom;

    }
}