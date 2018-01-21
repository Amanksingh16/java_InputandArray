
public class Reverse_InputAndArrays {

	public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        int reverse=0;
        while(N>0)
        {
        	int r=N%10;
        	reverse=reverse*10;
        	reverse = reverse + r;
        	N=N/10;
        }
        System.out.println("The reverse of the number is : "+reverse);
	}

}
