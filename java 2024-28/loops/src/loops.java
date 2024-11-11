
class loops
{
    public static void main(String args[])
    {
        //for loop
        for (int i = 1; i<=10; i = i +1)
        {
            System.out.println(i);
        }
        System.out.println("-------------------------");

        //while loop
        int j = 0;
        while (j<=10)
        {
            System.out.println(j);
            j = j + 1;
        }

        System.out.println("-------------------------");

        //do... while loop
        int k = 0;
        do 
        {
            System.out.println(k);
            k = k + 1;
        }

        while(k<10);

        System.out.println("-------------------------");

        //sum of first 10 natural numbers
        int sum = 0;
        for(int x = 1; x <=10; x = x+1)
        {
            sum = sum + x;
        }

        System.out.println("Sum of first 10 natural numbers" + sum);

        System.out.println("-------------------------");



    }
}