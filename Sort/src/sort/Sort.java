/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.Random;
import sort.QuickSort;
import sort.HeapSort;
import static sort.HeapSort.printArray;
/**
 *
 * @author patrickcharlton
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Generates a random array
        Random rand = new Random();
        int[] randNumbers = new int[100];
        for (int i = 0; i < randNumbers.length; i++) {
            int n = rand.nextInt(10000);
            randNumbers[i] = n;
        }

        System.out.println("Array unsorted: ");
        //printArray(randNumbers);
        
        Stopwatch swatch = new Stopwatch();

        int n = randNumbers.length;

        swatch.start();
        HeapSort object1 = new HeapSort();
        object1.libHeapSort(randNumbers);
        swatch.stop();
        swatch.readout();
        swatch.reset();

        System.out.println("Array sorted by Heap Sort: ");
        //printArray(randNumbers);
        
        swatch.start();
        QuickSort object2 = new QuickSort();
        object2.libQuickSort(randNumbers, 0, n-1);
        swatch.stop();
        swatch.readout();
        swatch.reset();

        System.out.println("Array sorted by Quick Sort: ");
        //printArray(randNumbers);
        
        swatch.start();
        CountingSort object3 = new CountingSort();
        libCountingSort(randNumbers, randNumbers, n);
        swatch.stop();
        swatch.readout();
        swatch.reset();

        System.out.println("Array sorted by Counting Sort: ");
        printArray(randNumbers);
        
        
    }
    
    public static void libCountingSort(int[] input, int[] output, int k) 
    { 
  
        // The output character array that will have sorted arr 
        int arr[] = new int[k]; 
        k = arr.length; 
 
        for (int i=0; i<k; i++) 
            arr[i] = 0; 
  
        // store count of each character 
        for (int j=1; j<input.length; j++) 
            arr[input[j]] = arr[input[j]] + 1; 
  
        // Change count[i]
        for (int i=1; i<=k; i++) 
            arr[i] = arr[i] + arr[i-1];
  
        // Build the output character array 
        for (int j = input.length; j>=1; j--) 
        { 
            output[arr[input[j]]] = input[j]; 
            arr[input[j]] = arr[input[j]] - 1; 
        } 
  
    
    }

}
            

