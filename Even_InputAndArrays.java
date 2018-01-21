
public class Even_InputAndArrays {

	public static void main(String[] args) {
        int i; 
		int N=Integer.parseInt(args[0]);
		System.out.println("The Even numbers upto N is : ");
      for(i=0;i<=N;i++)
      {
    	  if(i%2!=0)
    	  {
    		  continue;
    	  }
    	  System.out.println(i);
      }
	}

}
