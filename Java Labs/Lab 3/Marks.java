import java.util.*;

class Marks{
	public static void main(String args[]){
   int a,b,c;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Marks ");
   System.out.println("CP Marks");
   a =  sc.nextInt();
   System.out.println("Oop Marks");
   b =  sc.nextInt(); 
   System.out.println("Data Structure Marks");
   c =  sc.nextInt(); 
   int t = a+b+c;
   double avg = (t/300.0)*100.0;
   System.out.println("You Have Got "+t+" Marks out of 300");
   System.out.println("Average = "+avg);
   
   if ( avg >= 90.0 && avg <= 100.0)
   { System.out.println("");
   	
   }
   if (avg >= 90.0 && avg <= 100.0)
   { 
	   System.out.println("Grade: A");
   }
   if (avg >= 80.0 && avg < 90.0)
   { 
	   System.out.println("Grade: B");
   	
   }
   if (avg >= 70.0 && avg < 80.0)
   { 
	   System.out.println("Grade: C");
   	
   }
   if (avg >= 60.0 && avg < 70.0)
   { 
	   System.out.println("Grade: D");
   }

   	if (avg >= 0 && avg < 60.0)
   {
    System.out.println("Fail");
   	
   }



   }
   }