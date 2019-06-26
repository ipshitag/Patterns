/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int i,j,t=0;
        i = sc.nextInt();

        for(j=1;j<=i;j++)
        {
            for(t=1;t<=(i-j);t++)
            System.out.print(" ");

            for(t=1;t<=j;t++)
            {
                System.out.print("*");
            }    

            if(j!=i)
            System.out.println();
        }

   }
}
