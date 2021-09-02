package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DynamicArrayDemo {

	public static final int NUMBER_OF_NAMES = 4;

	public static void main(String[] args) {
		// Declaration & Initialization
		ArrayList <String> nameList = new ArrayList<String>();
		Scanner input = new Scanner (System.in);
		DynamicArrayDemo self = new DynamicArrayDemo();

		System.out.println("**You must enter 4 names**");
		//Repeat the  loop 4 times
		for(int iName = 0; iName < NUMBER_OF_NAMES; iName ++){

			//Prompt the use
			System.out.print("Name " + (iName + 1) + ": ");
			nameList.add(input.nextLine());
		}

		System.out.println("\n**Prior to modification**");
		//Display the nameList
		self.DisplayNameList(nameList);

		//Modfiying the element of the array
		nameList.add("Holly");//Add at the end
		nameList.add("Kevin");//Add at the end
		nameList.remove(1);//Remove the element at postition 2
		nameList.set(1, "New Value");//replace element at position 1 with New Value
		nameList.remove("Holly");// remove Holly where ever it is on the index
		nameList.add(0, "Gabe");// replace element at position 0 with Gabe

		//Reprint after modification
		System.out.println("\n**After modification**");
		//Display the nameList
		self.DisplayNameList(nameList);

		//Reprint after SORT
		System.out.println("\n**After Sorting**");
		self.SortNameList(nameList);//this sorts the list but does not print it
		self.DisplayNameList(nameList);// this prints the list

		input.close();
	}//End of the Main Method




	public void DisplayNameList(ArrayList <String> nameList){

		//Print the element of the list
		for(String name : nameList){
			System.out.println(name);
		}
	}

	public void SortNameList (ArrayList<String> nameList){
		//Sort the elements of an ArrayList
		Collections.sort(nameList);

	}

}//End of DynamicArrayDemo Class
