import java.util.*;
class ArrayPosition{
	public static void main(String args[]){
    Scanner ip = new Scanner(System.in);
    

    
    int a = ip.nextInt();
    int array[] = {3,5,6,7,9,3,6,8,8};
    int i;
    int index = 0;
    boolean found = false;
    for ( i = 0; i<array.length; i++)
    {
         if(array[i] == a){
           index = i;
           found = true;
           break;
         }
    }
    if(found){
      System.out.print("Number found at: "+index);
    }
    else
    { System.out.print("Number Not Found ");
      
    }


}
}