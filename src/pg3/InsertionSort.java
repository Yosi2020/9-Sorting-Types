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
public class InsertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; ++i){
            int key =arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] =arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    
}
