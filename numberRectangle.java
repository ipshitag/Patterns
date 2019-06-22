/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Pattern Problem - 2 
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
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
1 1 1 1 1 

2 2 2 2 2 

3 3 3 3 3 

4 4 4 4 4 

5 5 5 5 5
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        
        n = sc.nextInt();
        if(n>=1 && n<=1000)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    System.out.print(i);

                    if(j!=n)
                    System.out.print(" ");
                }

                if(i!=n)
                System.out.println();
            }
        }           

   }
}
