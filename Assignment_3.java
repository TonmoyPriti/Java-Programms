import java.util.*;

public class Assignment_3{
	public static void main(String args[]){
		String STR,word,temp="";
		int i=0,count=0,PreCount=0,StartIndex=0,EndIndex=0;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("*Enter a string : ");
		STR=s.nextLine();
		STR=STR.toLowerCase();
		for(i=0;i<STR.length();i++){
			StartIndex=i;
			while(STR.charAt(i)!=' '){
				ch=STR.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					count++;
				}
				if(i==STR.length()-1){
					i++;
					break;
				}
				i++;
			}
			EndIndex=i;
			word=STR.substring(StartIndex,EndIndex);
			System.out.println("*"+word+" - Number of vowels : "+count);
			if(PreCount<count){
				PreCount=count;
				temp=word;
			}
			count=0;
		}
		System.out.println("\n*Maximum number of vowels present in - "+temp);
	}
}
