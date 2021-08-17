package firstdemo;

public class SalesClass {
	
	public void display() {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Summation: "+sum);
	}
	public void print() {
		System.out.println("Array size");
		System.out.println("Print all array elements");
		display();
	}
}
