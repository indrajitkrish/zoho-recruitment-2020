import java.util.Scanner;

public class Example {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		char[] ar=s.toCharArray();
		char[] a=new char[100];
		int mean=l/2;
		int k=0;
		int ful=l;
		//System.out.println(mean);
		
		for(int i=mean;i<ful;i++)
		a[k++]=ar[i];	
		
		for(int i=0;i<ful;i++)
			a[k++]=ar[i];
		
		for(int i=0;i<ful;i++)
		{
			k=0;
		for(int j=0;j<ful;j++)
		{
			if(j<l-1)
				System.out.print(" ");
			if(j>=l-1)
			System.out.print(a[k++]);
		}
		l--;
		System.out.println("");
		}
		
		// TODO Auto-generated method stub

	}

}
