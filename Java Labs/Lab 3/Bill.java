import java.util.*;
class Bill{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int t,b;
		System.out.println("Enter Number of Units");
        b = in.nextInt();
    
    if (b > 0 && b <= 50)
    {   t = (b*10);
    	System.out.println("Bill: "+t);
    }
    if (b > 50 && b <= 100)
    {   t = (50*10)+((b-50)*15);
    	System.out.println("Bill: "+t);
    }
    if (b > 100 && b <= 200)
    {   t = (50*10)+(50*15)+((b-100)*20);
    	System.out.println("Bill: "+t);
    }
    if (b > 200 && b <= 300)
    {   t = (50*10)+(50*15)+(100*20)+((b-200)*25);
    	System.out.println("Bill: "+t);
    }
    if (b > 300)
    {   t = (50*10)+(50*15)+(100*20)+(100*25)+((b-300)*30);
    	System.out.println("Bill: "+t);
    }











	} //end Of Main






} // end of class bill