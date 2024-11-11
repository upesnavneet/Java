import java.util.*;
class App
{
    public static void main(String[] args)
    //advanced patterns
    //for pattern no 1 in copy
    { 
        //upper half
       for(int i = 1; i<=4; i = i+1)
       {
        //for first part(stars)
        for(int j=1; j<=i; j=j+1)
        {
            System.out.print("*");
        }
        //for spaces
        for(int j=1; j<=2*(4-i);j=j+1)
        {
            System.out.print(" ");
        }
        //for second part(stars)
    
        for(int j=1; j<=i; j=j+1)
        {
            System.out.print("*");
        }
        System.out.println();
    }

        for(int i = 4; i>=1; i = i-1) 
        {
         //for first part(stars)
         for(int j=1; j<=i; j=j+1)
         {
             System.out.print("*");
         }
         //for spaces
         for(int j=1; j<=2*(4-i);j=j+1)
         {
             System.out.print(" ");
         }
         //for second part(stars)
     
         for(int j=1; j<=i; j=j+1)
         {
             System.out.print("*");
         }
         System.out.println();
        }

        System.out.println("--------------------------------------");
    
        //for pattern 2 in copy(rhombus)
        for(int i = 1; i<=5; i = i+1)
        {
            for(int j = 1; j<=5-i; j=j+1)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=5; j=j+1)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        //for pattern 3 in copy
        for(int i = 1; i<=5; i = i+1)
        {
            for(int j = 1; j<=5-i; j=j+1)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j=j+1)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        //for pattern 4 in copy
        for(int i = 1; i<=5; i = i+1)
        {
            for(int j = 1; j<=5-i; j=j+1)
            {
                System.out.print(" ");
            }
            for(int j = i; j>=1; j=j-1)
            {
                System.out.print(j);
            }
            for(int j = 2; j<=i; j=j+1)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        //for pattern 5 in copy

        for(int i=1; i<=4; i=i+1)
        {
            for(int j=1; j<=4-i; j=j+1)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j=j+1)
            {
                System.out.print("*");
            }

            for(int j=2; j<=i; j=j+1)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=4; i>=1; i=i-1)
        {
            for(int j=1; j<=4-i; j=j+1)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j=j+1)
            {
                System.out.print("*");
            }

            for(int j=2; j<=i; j=j+1)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
