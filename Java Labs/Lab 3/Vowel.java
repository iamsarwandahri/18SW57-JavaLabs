import java.util.*;
class Vowel{
	public static void main(String args[]){
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a Character");
		char c = sr.next().charAt(0);
		if (c >= (char)65 && c<=(char)90 || c >= (char)97 && c <=(char)122 )
        {
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
        System.out.println("Vowel");
        else
        System.out.println("Consonent");

        }
        else
        System.out.println("Input is not a alphabetic Character");


 


	}





}