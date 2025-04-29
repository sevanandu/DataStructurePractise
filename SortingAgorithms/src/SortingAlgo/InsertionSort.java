package SortingAlgo;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExample arrE=new ArrayExample();
		int arr[]= arrE.getArr();
		
		arrE.beforeArray(arr);
		InsertionSort(arr);
		arrE.afterArray(arr);
		

	}
	
	public static void InsertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int currVal=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>currVal) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=currVal;
		}
	}

}
