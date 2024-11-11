import java.util.*;
class App 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the choice of addition, subtraction, multiplication, division or remainder by entering 1,2,3,4 or 5 respect9ively");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1: 
            {
                System.out.println("The sum of the two numbers is " + (a+b));
                System.out.println("Lmao");
            }
            break;
            case 2: System.out.println("The difference of the two numbers is " + (a-b));
            break;
            case 3: System.out.println("the product of the two numbers is " + (a*b));
            break;
            case 4: System.out.println("the division of the two numbers is " + (a/b));
            break;
            case 5: System.out.println("The remainder of the two numbers is "+  (a%b));
            break;
            default: System.out.println("Invalid choice");
        
        }

        
        }


       
        }

