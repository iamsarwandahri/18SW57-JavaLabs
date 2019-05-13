class Matrices{
	public static void main(String args[]){
		int a[] = {3,5,6,7,6,8};
		int max = a[0];
		for (int i = 1; i <a.length; i++)
		{
        if ( a[i]> max)
        {
        	max = a[i];
        }
        }
        System.out.println(" Largest Element is : "+max);


}
}