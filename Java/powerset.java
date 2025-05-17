import java.util.*;
class powerset{
    static void power(int[] arr,int i,String s,List<String> all){
        if(i==arr.length){
            all.add(s);
            return;
        }
        power(arr,i+1,s+arr[i],all);
        power(arr,i+1,s,all);
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        List<String> al=new ArrayList<>();
        power(arr,0,"",al);
        System.out.println(al);
    }
}