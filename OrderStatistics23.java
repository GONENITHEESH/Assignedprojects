package Assistedpracticeproject;
import java.util.Random;

public class OrderStatistics23 {
	int OrderStatistics(int arr[], int l, int r, int h) 
	{ 
         		if (h> 0 && h <= r - l + 1) 
    		{ 
        			int pos = randomPartition(arr, l, r); 
        			if (pos-l == h-1) 
            			return arr[pos]; 
        			if (pos-l > h-1) 
            			return OrderStatistics(arr, l, pos-1, h); 
        			return OrderStatistics(arr, pos+1, r, h-pos+l-1); 
    		} 
    return Integer.MAX_VALUE; 
} 
void swap(int arr[], int i, int j) 
{ 
    int temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
} 
int partition(int arr[], int l, int r) 
{ 
    int x = arr[r], i = l; 
    for (int j = l; j <= r - 1; j++) 
    { 
        if (arr[j] <= x) 
        { 
            swap(arr, i, j); 
            i++; 
        } 
    } 
    swap(arr, i, r); 
    return i; 
} 
int randomPartition(int arr[], int l, int r) 
{ 
    int n = r-l+1; 
    int pivot = (int)(Math.random()) * (n-1); 
    swap(arr, l + pivot, r); 
    return partition(arr, l, r); 
} 



public static void main(String[] args) {
	OrderStatistics23 ob = new OrderStatistics23(); 
    int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
    int n = arr.length,h = 6; 
    System.out.println("h'th smallest element is "+ ob.OrderStatistics(arr, 0, n-1, h)); 
}


}
