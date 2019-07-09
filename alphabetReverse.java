/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 Pattern Problem - 24 (100 Marks)
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
        int i,j,n;
        int k=65;
        n = sc.nextInt();

        for(i=n;i>=1;i--)
        {
            for(j=1;j<=(n*2 - i*2);j++)
            System.out.print(" ");

			      k = 65;

            for(j=1;j<=i;j++)
            {
                System.out.print((char)k);
				        k++;

                if(j!=i)
                System.out.print(" ");
            }
            k--;
            if(i!=1)
            System.out.println();
        }
}
}
