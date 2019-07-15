/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this- 
            A 
          C B A 
        E D C B A 
      G F E D C B A 
    I H G F E D C B A 

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
        A 

      C B A 

    E D C B A 

  G F E D C B A 

I H G F E D C B A
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
         Scanner sc = new Scanner(System.in);
        int i,n,j,t=1;
        int k = 65;
        int m;

        n = sc.nextInt();
        m = n*2 - 2;

        for(i=1;i<=n;i++)
        {
            k=t+64;
            for(j=1;j<=m;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<=t;j++)
            {
                System.out.print((char)k);
                if(j!=t)
                System.out.print(" ");
                k--;
            }

            t = t+2;
            k = k+2;
            m = m-2;

            if(i!=n)
            System.out.println();
        }

   }
}

   

