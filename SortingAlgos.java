public class SortingAlgos{ 
    public static void insertionSort(int[] array) {  
        int n = array.length;
        int temp=0;
        for (int i = 1; i < n; i++) { 
            int j = i-1;  
            while((j>-1) && (array[j]>array[j+1])) {
            temp=array[j]; 
                array [j] = array [j+1];
                array[j+1]=temp;  
                j--; 
            } 
        } 
    }



    public static void selectionsort(int[] arr){
    	int n=arr.length;
    	int index=0;
    	int min,temp=0;
    	for(int i=0; i<n; i++){
    		min=arr[i];
    		index=i;
    		for(int j=i; j<n;j++){
    			if(arr[j]<min){
    				min=arr[j];
    				index=j;
    			}
    		}
    		temp=arr[i];
    		arr[i]=arr[index];
    		arr[index]=temp;
    	}
    	
    }

    public static void bubblesort(int [] arr1){
    	int n=arr1.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr1[j-1] > arr1[j]){  
                                 temp = arr1[j-1];  
                                 arr1[j-1] = arr1[j];  
                                 arr1[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  













       
    public static void main(String [] args){    
        int[] array = {19,16,15,13};    
        System.out.println("Before Insertion Sort");    
        for(int i:array){    
            System.out.print(i + " ");    
        }
         
            
        insertionSort(array);   
           
        System.out.println("After Insertion Sort");    
        for(int i:array){    
            System.out.print(i + " ");    
        } 

    

      
        int[] arr = {9,14,13,2};  
        System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionsort(arr);  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }



     int arr1[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr1.length; i++){  
                        System.out.print(arr1[i] + " ");  
                }  
                System.out.println();  
                  
                bubblesort(arr1); 
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr1.length; i++){  
                        System.out.print(arr1[i] + " ");  
                }  
   
        }
    }