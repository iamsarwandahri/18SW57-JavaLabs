import java.util.*;
class Oprt{
	public static void main(String args[]){
		double a,b;
		char c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = input.nextInt();
		System.out.println("Enter  Operator");
        c = input.next().charAt(0); 
		System.out.println("Enter Second Number");
        b = input.nextInt();
        
        	switch(c){
            case '*':
            System.out.println("Answer = "+(a*b));
            break;
            case '+':
            System.out.println("Answer = "+(a+b));
            break;
            case '-':
            System.out.println("Answer = "+(a-b));
            break;
            case '/':
            System.out.println("Answer = "+(a/b));
            break;
            case '%':
            System.out.println("Answer = "+(a%b));
            break;
            default:
            System.out.println("Invalid Operator");
       }//end of switch


	}//end of main







}//end of class