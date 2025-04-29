package SortingAlgo;

public class ArrayExample {
	
	int arr[]= {5,6,8,9,1,0,3,2,4};

	public ArrayExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayExample(int[] arr) {
		super();
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	
	public void beforeArray(int[] arr) {
		System.out.println("Before Sorting....");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void afterArray(int[] arr) {
		System.out.println("After Sorting....");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	

}
