package testing;

public class euler125 {
	public static void main(String[] args){
		System.out.println(palindromicSums(100000000));
		//System.out.println(isSumOfConsecSquares(969));
		System.out.println("Done");
	}
	
	public static long palindromicSums(long range){
		long sum = 0;
		for(int i = 2; i < range; i++){
			if(isPalindrome(i)){
				if(isSumOfConsecSquares(i)){
					sum += i;
					
				}
			}
		}
		
		return sum;
	}
	
	


	public static boolean isPalindrome(long num){
		if(reverseNum(num) == num){
			return true;
		}else{
			return false;
		}
	}
	
	public static long reverseNum(long num){
		   long reversedNumber = 0;
           long temp = 0;
          
           while(num > 0){
                  
                   //use modulus operator to strip off the last digit
                   temp = num % 10;
                  
                   //create the reversed number
                   reversedNumber = reversedNumber * 10 + temp;
                   num = num/10;
                    
           }
           return reversedNumber;
	}
	
	public static boolean isSumOfConsecSquares(long num) {
		for(int j = 1; j < Math.floor(Math.sqrt(num)); j++){
			long currNum = j;
			long sum = 0;
			
			while(sum <= num){
				sum += currNum*currNum;
				currNum++;
				if(sum == num){
					System.out.println(sum);
					return true;
					
				}
			}
			

		}
		
		
		return false;
	}
	
}
