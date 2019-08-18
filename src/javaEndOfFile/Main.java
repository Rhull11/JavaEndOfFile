package javaEndOfFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 List<String> listOfStrings = new ArrayList<>();
		 
		 while(sc.hasNext()) {
			 if(sc.hasNext("exit")) {
				 break;
			 }else{
				 listOfStrings.add(sc.nextLine());
			 }
			 
		 }
		 
		 int count = 0;
		 for (String element : listOfStrings) {
			 count ++;
			 System.out.println(count + " " + element);
		 }
		 
		 sc.close();
	}
}
