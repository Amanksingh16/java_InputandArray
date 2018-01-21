
public class Search_InputAndArrays {

	public static void main(String[] args) {
		
		int N=Integer.parseInt(args[0]);
		boolean flag=false;
		int A[]= {2,4,6,7,8};
		
		for(int i=0;i<A.length;i++)
		{
			if(N==A[i])
			{
				flag=true;
				break;				
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
		System.out.println("The Number is found");
		}
		else
		{
			System.out.println("The Number is not found");
		}
	}

}
