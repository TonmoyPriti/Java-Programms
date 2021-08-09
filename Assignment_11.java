import java.lang.Thread;

class CreateThread extends Thread {
	CreateThread(String S){
		super(S);
	}
	
	public void run(){
		System.out.println(getName()+"ID #"+getId()+" is running");
	}
}

public class Assignment_11{
	public static void main(String args[]){
		CreateThread T1=new CreateThread(" Thread #1 ");
		CreateThread T2=new CreateThread(" Thread #2 ");
		CreateThread T3=new CreateThread(" Thread #3 ");
		T1.start();
		T2.start();
		T3.start();
	}
}
