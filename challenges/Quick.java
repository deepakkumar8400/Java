
import java.util.Arrays;

class Quick{
    public static void main(String[] args) {
        int[]arr=new int[]{1,46,4,4,4,64,84,1,489,79,4,4,49,7,6,46};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[]arr,int s,int e){
        if(s<e){
            int pi=partion(arr,s,e);
            if(arr.length%2==0&&pi==arr.length/2){
                System.out.println("This is Ans:"+(arr[pi]+arr[pi-1])/2);
            }if(arr.length%2==1&&pi==arr.length/2){
                System.out.println("This is Ans:"+arr[pi]);
            }
            quick(arr,s,pi-1);
            quick(arr,pi+1,e);
        }
    }
    static int partion(int[]arr,int s,int e){
        int piv=arr[s];
        int i=s;
        int j=e;
        while(i<=j){
            while(i<=j&&arr[i]<=piv)i++;
            while(i<=j&&arr[j]>piv)j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else{
                break;
            }
        }
        int temp=arr[s];
        arr[s]=arr[j];
        arr[j]=temp;
        return j;
    }
}