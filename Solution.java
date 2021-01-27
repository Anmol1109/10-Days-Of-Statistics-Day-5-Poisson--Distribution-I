import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int fac(int n){
        int f = 1;
        for(int i = 1;i <= n;i++)
            f *= i;
        return f;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        DecimalFormat df = new DecimalFormat("##0.000");
        double lambda = 2.5;
        int k = 5;
        double res = Math.pow(lambda, k) * Math.pow(Math.E, -lambda) / fac(k);
        System.out.println(df.format(res));
    }
}
