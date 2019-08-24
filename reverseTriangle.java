/*You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 

            1 
          2 2 
        3 3 3 
      4 4 4 4 
    5 5 5 5 5  

Input Format
You will take an integer input n from stdin.

Constraints
1 <= n <= 1000

Output Format
Your output should be the pattern according to the input which you had entered. 

Sample TestCase 1
Input
5
Output
        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5   */

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
    	//Write code here
        Scanner sc = new Scanner(System.in);
        int i,j,t=0;
        i = sc.nextInt();
        if(i>=1 && i<=1000)
        {
         for(j=1;j<=i;j++)
            {
                for(t=1 ; t < (2*i-2*j + 1) ; t++)
                System.out.print(" ");
                for(t=1;t<=j;t++)
                {
                    System.out.print(j);
                    if(t!=j)
                    System.out.print(" ");
                }    
                if(j!=i)
                System.out.println();
            }
        }    
   }
}
