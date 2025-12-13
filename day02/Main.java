import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("1)Addition 2)Subtract 3)Divide 4)Multiply");
        int choice=sc.nextInt();
        switch(choice)
        {
                case 1:
                System.out.println("Addition");
                System.out.println(a+b);
                break;
                case 2:
                System.out.println("Substract");
                System.out.println(a-b);
                break;
                case 3:
                System.out.println("Divide");
                System.out.println(a/b);
                break;
                case 4:
                System.out.println("Multiply");    
                System.out.println(a*b);
                break;
                default:
                System.out.println("Wrong choice");
        }
    }
}
