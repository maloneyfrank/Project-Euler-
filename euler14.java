import java.util.ArrayList;
import java.util.Collections;


public class euler14 {
	static ArrayList<Long> terms =  new ArrayList<Long>();
	static ArrayList<Long> startingNums = new ArrayList<Long>();
	public static void main(String[] args){
		System.out.println(longestCollatz(1000000));
		System.out.println("Done");
	}
	
	public static Long longestCollatz(int range){
		
		for(long i = 2; i < range; i++){
			terms.add(runSequence(i));
			startingNums.add(i);
		}
		
		Long maxTerms = Collections.max(terms);
		int index = terms.indexOf(maxTerms);
		return startingNums.get(index);
		
		
	}
	
	public static Long runSequence(Long num){
		Long t = (long) 0;
		Long currNum = num;
		while(currNum != 1){
			if((currNum % 2) == 0){
				currNum = currNum / 2;
			}else{
				currNum = (3 * currNum) + 1;
			}
			t++;
		}
		//System.out.println(t + " " + num);
		return t;
	}
}
