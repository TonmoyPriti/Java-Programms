import java.util.Scanner;

class PrimeNumbers{
	private int start,end;
	public PrimeNumbers(){
		start=0;
		end=0;
	}
	public void SetRange(){
		Scanner s=new Scanner(System.in);
		System.out.println("*Enter the starting range : ");
		start=s.nextInt();
		System.out.println("*Enter the ending range : ");
		end=s.nextInt();
		if(start>end){
			System.out.println("Starting can't be greater than ending range...!!!\nTry again...");
			System.out.println("*Enter the ending range : ");
			end=s.nextInt();
		}
		else
			System.out.println("Start : "+start+"\nEnd : "+end);
	}
	public boolean isPrime(int num){
		int i;
		for(i=2;i<=num/2;i++){
			if(num%i==0)
				return false;
		}
		return true;
	}
	public void printList(){
		int j,count=1;
		for(j=start;j<=end;j++){
			if(isPrime(j))
				System.out.print(count+"."+j+"\n");
		}
	}
}

public class Assignment_1{
	public static void main(String args[]){
		PrimeNumbers p=new PrimeNumbers();
		p.SetRange();	
		p.printList();
	}
}
