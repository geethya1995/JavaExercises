package base;

// Method 1
// Method 2 - Using less number of swaps
public class reverseArray { 

	static void reverse1(int a[], int n)
	{ 
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 

		/*printing the reversed array*/
		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	}

	static void reverse2(int a[], int n)
	{
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.println("Reversed array is: \n");
		for (k = 0; k < n; k++) {
			System.out.println(a[k]);
		}
	}
} 




