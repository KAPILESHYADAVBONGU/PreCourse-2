class Exercise_2
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here  
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;   
    }
    
    int partition(int arr[], int low, int high) 
    { 
        int p= arr[high];
    	int j=low-1;
    	for(int i=low;i<=high-1;i++) {
    		if(arr[i]<p) {
    			j++;
    			swap(arr,j,i);
    		}
    	}
    	swap(arr,j+1,high);
    	return(j+1);


   	//Write code here for Partition and Swap
    /*int p=a[low];
    int i=low+1,j=high-1;
    while(i<j){
     while(a[i]<p) i++;
     while(a[j]>p)  j--;
     if(a[i]<a[j])
        swap(a, i, j);
    } 
    swap(a, low, j);
    return j;*/
    
}

    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
        if(low<high){
            int j=partition(arr, low, high);
            sort(arr, low, j-1);
            sort(arr, j+1, high);
        }
            // Recursively sort elements before 
            // partition and after partition 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        Exercise_2 ob = new Exercise_2(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 
