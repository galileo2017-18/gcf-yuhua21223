
public class GCF {

	public static void main(String[] args) {
		//test your methods here
		//make sure gcfIterative and gcfRecursive return the same value!
		
	}
	
	
	//Returns GCF of a and b (iterative)
	//Precondition: a > 0, b > 0
	public static int gcfIterative (int a, int b) {
	    while (a != b) {
	        if (a > b)
	            a -= b;
	        else
	            b -= a;
	    }
	    return a;
	}

	
	//Returns GCF of a and b (recursive)
	//Precondition: a > 0, b > 0
	public static int gcfRecursive(int a, int b) {
	    if (a == b) {
	        return a;
	    }
	    else if (a > b) {
	        return gcfRecursive(a - b, b);
	    }
	    else {
	        return gcfRecursive(a, b - a);
	    }
	}
	
	
	//Challenge: rewrite gcfIterative and gcfRecursive with the 
	// modulo operator % to make the methods more efficient
	
	public static int gcfIterMod (int a, int b) {
		
	}
	
	public static int gcfRecurMod (int a, int b) {
		
	}

}
