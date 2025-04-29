package SortingAlgo;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample arrE=new ArrayExample();
		int arr[]= arrE.getArr();
		
		arrE.beforeArray(arr);
		BubbleSort(arr);
		arrE.afterArray(arr);
		

	}
	public static void BubbleSort(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
