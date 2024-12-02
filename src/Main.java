
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("puzzle1.txt");
		String[] fullList = null;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> sortedList = new ArrayList<Integer>();
		int sum = 0;
	
		// reads in the file, opens a scanner to read through the given coordinates, and then delimits on the appropriate gaps. 
		try {
			Scanner fileScnr = new Scanner(file);
			while(fileScnr.hasNext()) {

				// because it cycles through the loop on each line, elements of the fullList will always be 0 or 1 (left and right)
				String line = fileScnr.nextLine();
				fullList = line.split("   ");
				list1.add(Integer.parseInt(fullList[0]));
				list2.add(Integer.parseInt(fullList[1]));
			

			}
			
			// naturally, sorts the two lists. it's left to default so the lists will go from smallest > largest
			
			list1.sort(null);
			list2.sort(null);
			
			// for loop that cycles through the lists to find the sum by subtracting the distance of pair2 from pair1.
			// absolute value added to deal with incidental negative numbers (if pair2 > pair1)
			for(int i = 0; (i < Math.min(list1.size(), list2.size())); i++) {
				sum = sum + Math.abs(list1.get(i) - list2.get(i));
			}
			
			System.out.println(sum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
