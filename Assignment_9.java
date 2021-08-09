import java.io.*;
import java.util.Scanner;

class InvalidRollNumberFormatException extends Exception{
	InvalidRollNumberFormatException(String s){
		super(s);
	}
}

class Assignment_9{
	static void IsValid(String Roll) throws InvalidRollNumberFormatException{
		String Str="90/MCA/190000",temp;
		if(Str.length()==Roll.length()){
			temp=Roll.substring(9,13);
			temp=Str.replace("0000",temp);
			if(temp.equals(Roll)){
				System.out.println("Roll number format is valid");	
			}
			else
				throw new InvalidRollNumberFormatException("Invaild Roll number format");
		}
		else
			throw new InvalidRollNumberFormatException("Invaild Roll number format");
	}
	public static void main(String args[]){
		String RollNo;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Roll Number : ");
		RollNo=S.nextLine();
		try{
			IsValid(RollNo);
		}
		catch(InvalidRollNumberFormatException e){
			System.out.println("Exception occured: "+e);
		}
	}
}

