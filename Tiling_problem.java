package Recursion;
import java.util.*;
public class Tiling_problem {
    public static int ways ( int n){
        if(n==0 || n==1){
            return 1;
        }
        // vertical
        int verticaltiles = ways(n-1);
        // horizental
        int horizentaltiles = ways(n-2);
        // total ways
        int totalways = verticaltiles+horizentaltiles;
        return totalways;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println(ways(4));

    }
}
