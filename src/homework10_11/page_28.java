package homework10_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class page_28 
{
	public static void main(String[] args)throws IOException
	  {
		  System.out.println("請輸入一個整數");
		  
		  BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		  
		  String str1 = br1.readLine();
		  
		  int num = Integer.parseInt(str1);
		  
		  System.out.println("您輸入的數是"+num);
		  
		  System.out.println("請輸入字串");
		  
		  BufferedReader br2 =
			new BufferedReader(new InputStreamReader(System.in));	
		  
		  String str2 = br2.readLine();
		  
		  System.out.println("剛剛輸入的數是:"+str2);
	  }
}
