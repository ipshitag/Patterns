/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

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
* * * * * * * * * 

  * * * * * * * 

    * * * * * 

      * * * 

        *
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int n,i,j,t,m;

        n = sc.nextInt();
        t = n*2;
        m = n*2;
        if(n>=1 && n <= 1000)
        {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(m-t);j++)
            System.out.print(" ");

            for(j=1;j<t;j++)
            {
                System.out.print("*");
                if(j!=t-1)
                System.out.print(" ");
            }
            if(i!=n)
            System.out.println();
            t = t-2;
        }
        }

   }
}
