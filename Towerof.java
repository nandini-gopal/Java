public class Toweroft {
    static void tower(int n,char source,char helper,char destination){
        if(n==1) {
            System.out.println("move disk 1 from" + source + "to" + destination);
            return;
        }
        //source   to helper
        tower(n-1,source,destination,helper);
        System.out.println("move disk" +n+ "from" +source+ "to" +destination);
        //helper to destination
        tower(n-1,helper,source,destination);
    }
    public static void main(String[] args){
        int n=3;
         tower(n,'s','h','d');
    }
}
