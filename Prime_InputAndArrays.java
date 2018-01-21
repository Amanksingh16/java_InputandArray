
public class Prime_InputAndArrays {

	public static void main(String[] args) {
		int i,p; 
		int N=Integer.parseInt(args[0]);
		System.out.println("The Prime numbers upto N is : ");
		for(i=2;i<N;i++)
		{
		p=0;
		for(int j=2;j<i;j++)
		{
		if(i%j==0)
		p=1;
		}
		if(p==0){
		System.out.println(i);
		}
		}
	}

}
