
public class euler45 {
	public static void main(String[] args){
		System.out.println(findNext(40755));
	}
	
	public static long findNext(long start){
		long i = start + 1;
		while(true){
			if(isTriangle(i) && isPentagonal(i) && isHexagonal(i)){
				return i;
			}else{
				i++;
			}
		}

	}
	
	public static boolean  isTriangle(long n){
		//0.5*sqrt(8x + 1) - 0.5
		double newN = 0.5 * Math.sqrt(8*n + 1) - 0.5;
		if(newN == (int) newN){
			return true;
		}
		return false;
	}
	
	public static boolean isPentagonal(long n){
		//[1 + sqrt(24P + 1)]/6
	
		double newN = (1 + Math.sqrt(24*n+1)) / 6;
		
		if(newN == (int) newN){
			return true;
		}
		
		return false;
	}
	
	public static boolean isHexagonal(long n){
	
		double newN = (1 + Math.sqrt(1+ 8*n)) / 4;
		if(newN == (int) newN){
			return true;
		}
		
		return false;
	}

}