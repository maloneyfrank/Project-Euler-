package testing;

import java.util.List;
import java.util.ArrayList;

public class euler3{
	static List<Integer> factors = new ArrayList<Integer>();
	static List<Integer> primes = new ArrayList<Integer>();
	public static void main(String[] args){
		determineFactors(55555L);
		System.out.println("Factors: " + factors);
		checkPrimes(factors);		
		System.out.println("Largest Prime: " + primes.get(primes.size() - 1));
	}
	
	public static void determineFactors(long num){
		for (int x = 2; x <= num / 2; x++){
			if(num % x == 0){
				factors.add(x);
			}
		}
		
	}
	
	public static void checkPrimes(List<Integer> factors){
		for(int x = 0; x < factors.size(); x++){
			if(isPrime(factors.get(x))){
				primes.add(factors.get(x));
			}
		}
	}
	
	public static boolean isPrime(int num){
		
		    for(int i = 2; i <= Math.sqrt(num); i++){
		
		        if((num % i) == 0) return false;
		
		    }
		     return true;
		}

}

