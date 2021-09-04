import java.util.Scanner;
class swap
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("No before Swapping : "+x +" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("No after Swapping : "+x +" "+y);

    }
}