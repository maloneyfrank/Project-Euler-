import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class euler22 {
	static String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static String[] names;
	static int score = 0;
	public static void main(String[] args) throws FileNotFoundException{
		
		
		String content = new Scanner(new File("names.txt")).useDelimiter("\\Z").next();
		 names = content.split(",");
		Arrays.sort(names);
		
		for(int i = 0; i < names.length; i++){
			String name = names[i];
			score += nameScore(name);
		}
		
		System.out.println(score);
	}

	public static int nameScore(String name) {
		int nameScore = 0;
		for(int j = 0; j < name.length(); j++){
			for(int k = 0; k < letters.length; k++ ){
				if(Character.toString(name.charAt(j)).equalsIgnoreCase(letters[k])){
					 nameScore +=  Arrays.asList(letters).indexOf(letters[k]) + 1;
					 
				}
			}
		}
		return (nameScore * (Arrays.asList(names).indexOf(name)+ 1));
	}
}
