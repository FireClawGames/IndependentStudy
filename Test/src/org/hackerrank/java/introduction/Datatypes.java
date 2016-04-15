package org.hackerrank.java.introduction;

import java.util.Scanner;

class Datatypes
{
	public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++)
        {
            try
            {
                long x = sc.nextLong();
                
                System.out.printf("%d can be fitted in:%n", x);
                
                if (x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                	System.out.println("* byte");
                
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                	System.out.println("* short");
                
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                	System.out.println("* int");
                
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                	System.out.println("* long");
            }
            
            catch(Exception e)
            {
                System.out.printf("%s can't be fitted anywhere.%n", sc.next());
            }
        }
        
        sc.close();
    }
}