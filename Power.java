import java.util.*;
import java.io.*;
public class Power {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
}
