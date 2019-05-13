class Matrix{
public static void main(String args[]){
 int A[][] =  {{1,2,3},{4,5,6}};
 int B[][] =  {{4,5,3},{7,8,2}};
 int sum[][] = new int[2][3];

    for (int i = 0; i<A.length; i++)
    {
 	   for(int j = 0; j<B[0].length;j++)
 	   {
 		
        sum[i][j] = A[i][j]+B[i][j];


 	   }
    }
 
    for (int i = 0; i<A.length; i++)
    {
 	    for(int j = 0; j<B[0].length;j++)
 	    {
    
         System.out.print(sum[i][j]+" ");

     	}
     	System.out.println();
    }





}
}