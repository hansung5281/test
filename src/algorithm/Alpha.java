package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Alpha {
	public static void main(String[] args) {
		ArrayList<Character> inList = new ArrayList();
		HashMap<Character, Integer>inMap = new HashMap<Character, Integer>();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag){
			System.out.println("asdf");
			
			
			String input = sc.next();
			
			for(int i=0; i<input.length() ;i++){
				char inChar = String.valueOf(input).charAt(i);
				if(inChar >=65 && inChar<=90){
					if(!(inMap.containsKey(inChar))){
						inMap.put(inChar, 1);
						inList.add(inChar);
					}else{
						int cnt=inMap.get(inChar);
						inMap.put(inChar, ++cnt);
					}
				}else{
					flag = false;
					//System.out.println("asfasdfasdf");
				}
			}
			
			if(!flag){
				for(int i=0; i<inList.size(); i++){
					System.out.print(inList.get(i) +": ");
					System.out.println(inMap.get(inList.get(i)));
				}
				break;
			}		
		}
		
	}
}
