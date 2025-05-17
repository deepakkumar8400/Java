import java.util.*;
class sort{
    public static void main(String[] args) {
        String s="awawawawazzzssss";
        Map<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        Pair[]arr=new Pair[hm.size()];
        int i=0;
        for(char c:hm.keySet()){
            Pair p=new Pair(c,hm.get(c));
            arr[i++]=p;
        }
        Arrays.sort(arr,(a,b)->a.o-b.o);
        for(Pair p:arr){
            System.out.print(p.c+" "+p.o+" ");
        }
    }
}
class Pair{
    char c;
    int o;
    Pair(char c,int o){
        this.o=o;
        this.c=c;
    }
}