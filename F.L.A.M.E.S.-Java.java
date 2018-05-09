import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// This script is the result of me getting bored at 3:00

public class FLAMES {

	private static String flames_meaning(String result) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("F", "Friendship");
		map.put("L", "Love");
		map.put("A", "Affection");
		map.put("M", "Marriage");
		map.put("E", "Enemy");
		map.put("S", "Sweetheart");
		
		return map.get(result);
	}
	
	public static void main(String[] args) {
		
		String flames = "FLAMES";
		Scanner scan = new Scanner(System.in);
		String striked_out_char;
		
		System.out.println("*** WELCOME TO THE FLAMES GAME ***\n");
		System.out.println("Enter name 1 (first name only) >>> ");
		String name1 = scan.nextLine().toUpperCase();
		System.out.println("Enter name 2 (first name only) >>> ");
		String name2 = scan.nextLine().toUpperCase();
		scan.close();
		
		for (String x : name1.split("")) {
			
			if (name2.contains(x)) {
				name2 = name2.replaceFirst(x, "");
			    name1 = name1.replaceFirst(x, "");
			}
			
		}
		
		String flamed_name = name1 + name2;
		System.out.println("Flamed name >>> " + flamed_name);
		
		int flamed_name_length = flamed_name.length();
		System.out.println("\nComputing FLAMES...");
		System.out.println("\nNow " + flames);
		
		while (flames.length() != 1) {
			
			if (flames.length() >= flamed_name_length) {
				striked_out_char = String.valueOf(flames.charAt(flamed_name_length - 1));
				flames = flames.replaceFirst(striked_out_char, "");
			} else {
				striked_out_char = String.valueOf(flames.charAt(((flamed_name_length - 1) % flames.length())));
				flames = flames.replaceFirst(striked_out_char, "");
				}
			
			System.out.println("Now " + flames + ", striked out " + striked_out_char);
			
		}
		
		System.out.println("\nFLAMES result: " + flames_meaning(flames));
		
	}

}
