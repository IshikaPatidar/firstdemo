package firstdemo;

public class SalesClass {
	
	public void display() {
		int[] arr= {1,2,3,4,5};
		for(int num:arr)
			System.out.println(num);
	}
	public void print() {
		System.out.println("Print all array elements");
		display();
	}
}
