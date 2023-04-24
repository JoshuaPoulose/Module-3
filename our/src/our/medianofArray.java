package our;

import java.util.Arrays;

public class medianofArray {
	public static void main(String[] args) {
		
	
	int a[]= {2,8,3,9,1};
	int x=0;
	Arrays.sort(a);
	System.out.println(a.length);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	if(a.length%2==0) {
		
	}
	else {
		x=a[a.length/2];
		System.out.println(x);
	}
 }
}