package SortingAlgo;

public class SelectionSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExample arrE=new ArrayExample();
		int arr[]= arrE.getArr();
		
		arrE.beforeArray(arr);
		SelectionSort(arr);
		arrE.afterArray(arr);

	}
	
	public static void SelectionSort(int arr[]) {
		int start,lowest=0;
		for(int i=0;i<arr.length;i++) {
			start=i;lowest=i;
			while(start<arr.length) {
				if(arr[start]<arr[lowest]) {
					lowest=start;
				}
				start++;
			}
			int temp=arr[i];
			arr[i]=arr[lowest];
			arr[lowest]=temp;
			
			
		}
	}

}
