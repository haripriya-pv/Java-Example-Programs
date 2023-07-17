package examplePrograms;

public class ExampleArray {

	public ExampleArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int last;
		int l=a.length-1;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
		  b[l]=a[i];
		  l--;
			
		}
		System.out.println("reversed array");
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j] + " ");
		}

	}

}
