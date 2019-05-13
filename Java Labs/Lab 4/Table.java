import java.util.*;
class Table{
	public static void main(String arsgs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number whose table you want to print");
		int a =  sc.nextInt();
		System.out.println("Enter a Number You want to start table from");
		int b = sc.nextInt();
        System.out.println("Enter a Number you want to end table at");
        int c =  sc.nextInt();
        for(; b<=c; b++)
        {
        	System.out.println(a+"*"+b+"="+a*b);


        }








	}

}