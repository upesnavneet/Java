class App
{
    public static void main(String args[])
    {
        //for pattern 1 in copy
        
        for(int i1 = 1; i1<=4; i1=i1+1)
        {
            for(int j1 = 1; j1<=5; j1=j1+1)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 2 in copy

        int n = 4;
        int m = 5;



        for(int i2 = 1; i2<=n ; i2=i2+1)
        {
            for(int j2 = 1; j2<=m; j2= j2+1)
            {
                if(i2==1||j2==1||i2==n||j2==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");


        //for pattern 3 in copy
        for(int i3= 1; i3<=5; i3=i3+1)
        {
           for(int j3=1;j3<=i3;j3=j3+1)
           {
               System.out.print('*');
           }
           System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 4 in copy
        for (int i4=5; i4>=1; i4 =i4-1)
        {
            for(int j4=1; j4<=i4; j4=j4+1)
            {
                System.out.print("*");
            }
        System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 5 in copy
        for(int i5= 1; i5<=5; i5=i5+1)
        {
            for(int j5= 1; j5<=5-i5; j5=j5+1)
            {
                System.out.print(" ");
            }
            for(int j5=1; j5<=i5; j5=j5+1)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 6 in copy
        for(int i6 = 1; i6<=5; i6=i6+1)
        {
            for(int j6=1; j6<=i6; j6=j6+1)
            {
                System.out.print(j6);
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------");

        //for pattern 7 in copy
        for(int i7=1; i7<=5; i7=i7+1)
        {
            for(int j7=1 ; j7<=5-i7+1; j7=j7+1)
            {
                System.out.print(j7);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

         //for pattern 7 in copy(best one)

        for (int i = 5; i>=1; i=i-1)
        {
            for(int j = 1; j<=i; j=j+1)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 8 in copy
        int number=1;

        for(int i8 = 1; i8<=5; i8=i8+1)
        {
            for(int j8 = 1; j8<=i8; j8=j8+1)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        //for pattern 9 in copy

        for(int i9=1; i9<=5;i9=i9+1)
        {
            for(int j9=1; j9<=i9;j9=j9+1)
            {
                int n5 = i9+j9;
                if(n5%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
                n5=n5+1;
            }
            System.out.println();
        }



    }
} 