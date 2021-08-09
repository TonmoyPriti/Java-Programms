import java.io.*;

public class Assignment_7{
	public static void main(String args[]){
		BufferedReader InFile1,InFile2,InFile3;
		BufferedWriter OutFile;
		int i=1;
		File NewFile=new File("Country.txt");
		try{
			InFile1=new BufferedReader(new FileReader("Country.txt"));
			InFile2=new BufferedReader(new FileReader("Capitals.txt"));
			NewFile.createNewFile();
			String Line,temp;
			while((temp=InFile1.readLine())!=null){
				OutFile=new BufferedWriter(new FileWriter("CountryCapitals.txt",true));
				Line="The capital of ";
				Line+=temp;
				Line+=" is ";
				Line+=InFile2.readLine();
				OutFile.write(Line+="\n");
				OutFile.close();
			}
			InFile1.close();
			InFile2.close();
			InFile3=new BufferedReader(new FileReader("CountryCapitals.txt"));
			while((temp=InFile3.readLine())!=null){
				System.out.println(i+"."+temp);
				i++;
			}
			InFile3.close();
		}
		catch(Exception e){
			System.out.println("NotFound");
		}
	}
}
