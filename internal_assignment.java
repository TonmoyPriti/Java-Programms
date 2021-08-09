import java.util.Scanner;

class Students{
	String name=null;
	int eng,math,com;
	public int total=0;
	public void GetData(int i){
		Scanner sp=new Scanner(System.in);
		System.out.println("\n"+i+".Enter the student details : ");
		System.out.println("Name : ");
		name=sp.nextLine();
		System.out.println("Enter the Marks : ");
		System.out.println("English : ");
		eng=sp.nextInt();
		System.out.println("Mathamatic : ");
		math=sp.nextInt();
		System.out.println("Computer : ");
		com=sp.nextInt();
		total=eng+math+com;
	}
	public void Display(){
		System.out.println("Name : "+name);
		System.out.println("English : "+eng+" Mathamatic : "+math+" Computer : "+com+"\nTotal : "+total);
	}
}

public class internal_assignment{
	public static void main(String args[]){
		Students[] S;
		int i,temp,pos=0;
		S=new Students[10];
		for(i=0;i<3;i++){
			S[i]=new Students();
			S[i].GetData(i+1);
		}
		temp=S[0].total;
		for(i=1;i<3;i++){
			if(temp<S[i].total){
				temp=S[i].total;
				pos=i;
			}
		}
		System.out.println("\nHighest scroe taken by : ");
		S[pos].Display();
	}
}
