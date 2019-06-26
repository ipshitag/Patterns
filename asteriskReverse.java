/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Pattern Problem - 24 (100 Marks)
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 

            * 
          * * 
        * * * 
      * * * * 
    * * * * * 

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
        * 

      * * 

    * * * 

  * * * * 

* * * * *

*/

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
                    System.out.print("*");
                    if(t!=j)
                    System.out.print(" ");
                }    

                if(j!=i)
                System.out.println();
            }
        }    

   }
}
