class chocolate {
    public static void main(String[] args) {
        int n=3;
        int []arr={1,2,5,81,2,5,8,4,5,8,};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                    if(arr[j-1]>arr[j]){
                        int t=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=t;
                    }
            }
        }
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<=arr.length-n){
            int mn=1000000000;
            int mx=-1000000000;
            for(int k=i;k<=j;k++){
              mx=Math.max(mx,arr[k]);
              mn=Math.min(mn,arr[k]);
            }
           ans=Math.min(ans,mx-mn);
        }
        System.out.print("Answer will be :"+ans);
    }
}