/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
A B C D E 
A B C D 
A B C 
A B 
A  

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
A B C D E 

A B C D 

A B C 

A B 

A
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
         Scanner sc = new Scanner(System.in);
        int i,j,m=65,n;

        n = sc.nextInt();
        if(n>=1 && n<=1000)
        {
            for(i=1;i<=n;i++)
            {
                for(j=n;j>=i;j--)
                {
                    System.out.print((char)m);
                    if(j!=i)
                    System.out.print(" ");
                    m++;
                }
                if(i!=n)
                System.out.println();

                m=65;
            }
        }

   }
}
