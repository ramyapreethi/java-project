package pack1;
import java.util.*;
public class nestedif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 4 values:");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		if(a>b && a>c && a>d)
			System.out.println("biggest number = "+a);
		else if(b>c && b>d)
			System.out.println("biggest number = "+b);
		else if(c>d)
			System.out.println("biggest number = "+c);
		else
			System.out.println("biggest number = "+d);	
		}
	}

