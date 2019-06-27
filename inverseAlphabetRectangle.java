/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Pattern Problem - 23 (100 Marks)
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 

E D C B A 
E D C B 
E D C 
E D 
E 

Input Format
You will take an integer input n from stdin.

Constraints
1 <= n <= 26

Output Format
Your output should be the pattern according to the input which you had entered. 

Sample TestCase 1
Input
5
Output
E D C B A 

E D C B 

E D C 

E D 

E
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        int i,j,m=65,n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if(n>=1 && n<=26)
        {
            for(i=n;i>=1;i--)
            {
                m = 65+n-1;
                for(j=1;j<=i;j++)
                {
                    System.out.print((char)m);
                    m--;
                    if(j!=i)
                    System.out.print(" ");
                }

                if(i!=1)
                System.out.println();
            }
        }

   }
}
