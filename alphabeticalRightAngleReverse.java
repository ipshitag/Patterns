/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 attern Problem - 18 (100 Marks)
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
A A A A A 
B B B B 
C C C 
D D 
E  

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
A A A A A 

B B B B 

C C C 

D D 

E
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
                }
                if(i!=n)
                System.out.println();

                m++;
            }
        }
 

   }
}
