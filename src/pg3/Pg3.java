/*
ALGORITHM ASSIGNMENT SOLVED BY EYOSIYAS T.


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mo
 * EYOSI
 */
public class Pg3 {
    private static final int sentinel = -999;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char ch = 0;
        BubbleSort bubble = new BubbleSort();
        SelectionSort1 select = new SelectionSort1();
        InsertionSort insert = new InsertionSort();
        QuickSort quick = new QuickSort();
        MergeSort merge = new MergeSort();
        HeapSort heap = new HeapSort();
        Radix rad = new Radix();
        Tree tre = new Tree();
        
        boolean found = true;
        while(found){
        System.out.print("\n  Sorting Alorithms Simulation APP   ");
        System.out.print("\n           Main Menu   ");
        System.out.println("\n  [1] Bubble Sort");
        System.out.println("  [2] Selection Sort" );
        System.out.println("  [3] Insertion Sort" );
        System.out.println("  [4] Quick Sort" );
        System.out.println("  [5] Merge Sort" );
        System.out.println("  [6] Heap Sort" );
        System.out.println("  [7] Radix Sort" );
        System.out.println("  [8] Binary Tree Sort" );
        System.out.println("  [9]  Exit the APP\n" );
        System.out.print("Choice: ");
        int option = scan.nextInt(); 
        switch(option){
            case 1:
                { do{
                    System.out.println("       \n Bubble Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                        bubble.bubbleStort(brr);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 2:
                { do{
                    System.out.println("       \n Selection Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                        select.sort(brr);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 3:
                { do{
                    System.out.println("       \n Insertion Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                        insert.sort(brr);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 4:
                { do{
                    System.out.println("       \n Quick Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                            int n= brr.length;
                        quick.quickSort(brr, 0, n-1);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 5:
                { do{
                    System.out.println("       \n Merge Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                            int n= brr.length;
                        merge.sort(brr, 0, n-1);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 6:
                { do{
                    System.out.println("       \n Heap Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                            int n= brr.length;
                        heap.sort(brr);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 7:
                { do{
                    System.out.println("       \n Radix Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                            int n= brr.length;
                        rad.radixsort(brr, n);
                        System.out.println("Sorted integer array: ");
                        for(int i=0; i<conut; i++){
                        System.out.print(brr[i]+" ");}
                        System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 8:
                { do{
                    System.out.println("       \n Binary Tree Sort Interface\n");
                    int bu = -999;
                    int conut = 0;
                    int [] arr1 = new int[1000];
                    //int[] arr;
                        try
                        {
                            Scanner b = new Scanner(System.in);
                            for(int i = 0; i < arr1.length; i++){
                            System.out.println("Enter number[" + i + "] or enter -999 to terminate: ");
                            bu = b.nextInt();
                            if(bu == -999){
                                break;
                            }
                            else{ 
                            arr1[i] = bu;
                            conut++;
                            //System.out.println(arr);
                            }
                            }
                            int [] brr = new int[conut];
                            brr = Arrays.copyOf(arr1, conut);
                            System.out.print("Unsorted integer array: ");
                        for(int j=0; j<brr.length; j++){
                        System.out.print(brr[j]+" ");}
                            System.out.println();
                            int n= brr.length;
                        tre.treeins(brr);
                        System.out.println("Sorted integer array: ");
                        tre.inorderRec(tre.root);
                        
                        //for(int i=0; i<conut; i++){
                        //System.out.print(brr[i]+" ");}
                        //System.out.println();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        
                    System.out.println("\nRepeat?[Y/N]:");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
            case 9: {
                System.exit(0);
            }
    }
    
}
}}