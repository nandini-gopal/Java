import java.util.Arrays;
import java.lang.String;
public class Marks {
    public static void main(String[] args){
        String a[]={"nani","anil","siri","teddy"};
        int b[]={45,89,65,23,};
        int n=b.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    String tempName = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tempName;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + ": " + b[i]);
        }
    }
}
