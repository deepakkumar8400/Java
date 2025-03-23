class cs{
    static void prnt(String s){
        if(s.length()==0){
            return;
        }
        System.out.println(s.charAt(s.length()-1));
        prnt(s.substring(0,s.length()-1));
    }
    public static void main(String []args){
        prnt("accb");
    }
}