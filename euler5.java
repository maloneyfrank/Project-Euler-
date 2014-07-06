package testing;

import java.util.List;
import java.util.ArrayList;

public class euler5{

public static boolean solved = false;
public static int trying = 1;

	public static void main(String[] args){
		
		while(!solved){
			if(test(trying)){
				System.out.println(trying);
				solved = true;
			}else{
				trying++;
			}
		}
	}
	public static boolean test(int x) {
		int status = 0;
		for(int i = 1; i <= 20; i++ ){
			if(x % i == 0){
				status++;
				if(status == 20){
					return true;
				}
			}
		
		}
		return false;
	}
	
}