package testing;

import java.util.ArrayList;
import java.util.Collections;

public class euler50 {
	public static void main(String[] args){
			findLargestPrimeSum(1000000);
	}
	
	public static int findLargestPrimeSum(int range){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Integer> corrTerms = new ArrayList<Integer>();
		for(int i = 0; i < range; i++){
			if(isPrimeNumber(i)){
				primes.add(i);
			}
		}

	
		int startingIndex = 0;
		for(int j = primes.size() - 1 ; j > 0; j--){
			int largest = primes.get(j);
			//System.out.println(largest);
			for(int k = 0; k < primes.size();k++){
				int index = k;
				int sum = 0;
				int terms = 0;
				//System.out.println(k);
				while(index < primes.size() - 1 ){
					sum += primes.get(index);
					terms++;
					index++;
					// System.out.println(sum);
					//System.out.println(sum);
					if(sum == largest){
						//System.out.println(sum + " " + largest + " " + terms);
						sums.add(sum);
						corrTerms.add(terms);
						break;
					}
					if(sum > largest){
						break;
					}
				}

			}
		}
		
		int maxTerms = Collections.max(corrTerms);
		System.out.println(maxTerms);
		int sumsWithTerms = corrTerms.indexOf(maxTerms);
		System.out.println(sums.get(sumsWithTerms));
		System.out.println("done");
		return 0;
	}
	
	
    public static boolean isPrimeNumber(int number) {
    	if(number == 1){
    		return false;
    	}
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
