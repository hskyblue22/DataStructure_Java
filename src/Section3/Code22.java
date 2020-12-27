package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {
	
	static String [] words = new String[100000];
	static int [] count = new int [100000];
	static int n=0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while (true) {
			
			System.out.print("$ ");
			String command = kb.next();
			
			if (command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			
			else if (command.equals("find")) {
				String keyword = kb.next();
				int index = findWord(keyword);
				
				if (index != -1) 
					System.out.println("The word "+ keyword + " appears "+ count[index] +"times.");
				else
					System.out.println("The word "+ keyword + " doesn't appear.");
			}
			
			else if (command.equals("saveas")) {
				String fileName = kb.next();
				saveAs(fileName);
			}
			
			else if (command.equals("exit"))
				break;		
		}	
		kb.close();	
	}

	static void makeIndex(String fileName) { 
		 try {
			Scanner inFile = new Scanner(new File(fileName));
			while (inFile.hasNext()) {
				String word = inFile.next();
				
				String trimmed = trimming(word);
				
				if (trimmed != null)  {
					String t = trimmed.toLowerCase();
					addWord(t);			
				}
			}	
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exist!");
			return;
		}	 
	}
	
	static String trimming(String str) {
		
		int i=0, j=str.length()-1;
		while ( i <str.length() && !Character.isLetter( str.charAt(i) ))  // while i-th char is not letter
			i++;
		while ( j >= 0 && !Character.isLetter( str.charAt(j) ))  
			j--;
		
		if (i > j)
			return null;
		return str.substring(i,j+1);
	}

	static void addWord(String word) {
		int index = findWord(word);
		if (index != 1) {   // exist
			count[index]++;
		}
		else {              // not exist
			
			int i = n-1;
			while (i>=0 && words[i].compareTo(word)>0) {
				words[i+1] = words[i];
				count[i+1] = count[i];
				i--;
			}
			words[i] = word;
			count[n] = 1;
			n++;                // increase total number of words in words[] 
		}	
	}
	
	static int findWord(String keyword) {
		for (int i=0; i<n; i++)
			if (words[i].equals(keyword))
				return i;
		return -1;
	}
	
	static void saveAs(String fileName) {
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i<n; i++) {
            	out.println(words[i]+" "+ count[i]);
            }
			out.close();
			
		} catch (IOException e) {
			System.out.println("Save failed. Don't ask me why.");
            return;		
		}
		
	}
}
