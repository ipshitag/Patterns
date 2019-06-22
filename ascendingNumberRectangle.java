/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
Pattern Problem - 3 (100 Marks)
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

Input Format
You will take an integer input  n from stdin.

Constraints
1 < = n < = 1000

Output Format
Your output should be the pattern according to the input which you had entered. 

Sample TestCase 1
Input
5
Output
1 2 3 4 5 

1 2 3 4 5 

1 2 3 4 5 

1 2 3 4 5 

1 2 3 4 5
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
                for(j=1;j<=5;j++)
                {
                    System.out.print(j);

                    if(j!=5)
                    System.out.print(" ");
                }

                if(i!=n)
                System.out.println();
            }
        }           

   }
}

