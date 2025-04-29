	package SortingAlgo;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayExample arrE=new ArrayExample();
		int arr[]= arrE.getArr();
		
		arrE.beforeArray(arr);
		mergeSort(arr);
		arrE.afterArray(arr);

	}
	
	public static void mergeSort(int[] arr) {
		int l=0;
		int h=arr.length;
		sortArray(arr,l,h-1);
		
	}
	
	
	
	public static void sortArray(int[] arr,int l,int h) {
		
		if(l<h) {
			int m = l + (h - l) / 2;
			sortArray(arr,l,m);
			sortArray(arr,m+1,h);
			mergeArray(arr,l,m,h);
		}
	}
	
	public static void mergeSort(int[] arr,int l,int m,int h) {
		
		 int N1=m-l+1;
		 int N2=h-m;
		 
		 int A1[]=new int[N1];
		 int A2[] =new int[N2];
		 
		 for(int i=0;i<N1;i++) {
			 A1[i]=arr[l+i];
		 }
		 
		 for(int i=0;i<N2;i++) {
			 A2[i]=arr[m+1+i];
		 }
		 
		 int i=0,j=0,k=l;
		 while(i<N1 && j<N2){
			 if(A1[i]<A2[j]) {
				 arr[k++]=A1[i++];
				 
			 }
			 else  {
				 arr[k++]=A2[j++];
				 
			 }
			 
		 }
		 while(i<N1) {
			 arr[k++]=A1[i++];
		 }
		 while(j<N2) {
			 arr[k++]=A2[j++];
		 }
		 
		 
	}
	
	public static void mergeArray(int A[],int l,int m,int h) {
		int n1=m-l+1,n2=h-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=A[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=A[m+1+i];
		}
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				
				A[k++]=L[i++];
				
			}
			else {
				A[k++]=R[j++];
				
			}
			
		}
		while(i<n1) {
			A[k++]=L[i++];
		}
		while(j<n2) {
			A[k++]=R[j++];
		}
	}
	

}
