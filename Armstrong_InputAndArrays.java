
public class Armstrong_InputAndArrays {

	public static void main(String[] args) {
		boolean armstrong=false;
		int num=0,count=0;
		int n=Integer.parseInt(args[0]);
		while(n>0) // for checking the no. of digits
		{
			n=n/10;
			count++;
		}
			
		while(n>0) // check for Armstrong
		{
			int r=n%10;
			num=(int)(num + Math.pow(r, count));
			n=n/10;
		}
		if(num==n)
		{
			armstrong=true;
		}
		else
		{
			armstrong=false;
		}
		System.out.println(armstrong);
		
	}

}
