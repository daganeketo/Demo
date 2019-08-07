
public class PrimeChecker<T> {

	
	public boolean isPrime(T t) {
		int number = (int) t;
		boolean primeNumber = true;
		
		for( int i = 2; i < number; i++) {
			if(number%i == 0) {
				primeNumber = false;
				break;
			}
		}
		
		return primeNumber;
	}
}
