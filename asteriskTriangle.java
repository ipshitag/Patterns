/* 
 You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 

            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * *  

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
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *

*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int i,n,j,t=1;
        int m;

        n = sc.nextInt();
        m = n*2 - 2;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<=t;j++)
            {
                System.out.print("*");
                if(j!=t)
                System.out.print(" ");
            }

            t = t+2;
            m = m-2;

            if(i!=n)
            System.out.println();
        }

   }
}

