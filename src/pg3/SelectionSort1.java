/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg3;

/**
 *
 * @author mo
 */
public class SelectionSort1 {
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j = i+1; j<n; j++)
                if(arr[j]<arr[min_idx])
                    min_idx = j;
            
            // swap the found minimum element with the first
            //elements
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] =temp;
        
        }
    }
    
}
