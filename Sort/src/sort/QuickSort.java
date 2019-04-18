/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Random;

/**
 *
 * @author patrickcharlton
 */
public class QuickSort {

    public void libQuickSort(int[] array, int p, int r) {
        if (p < r) {
            int q = Partition(array, p, r);
            libQuickSort(array, p, q - 1);
            libQuickSort(array, q + 1, r);
        }
    }

    public int Partition(int[] array, int p, int r) {
        int x = array[r];
        int i = (p - 1);
        for (int j = p; j < r; j++) {
            if (array[j] <= x) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[r];
        array[r] = temp;
        return i + 1;
    }

    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /* Random rand = new Random();
        int[] randNumbers = new int[100];
        for (int i = 0; i < randNumbers.length; i++) {
            int n = rand.nextInt(1000);
            randNumbers[i] = n;
        }

        System.out.println("Array unsorted: ");
        printArray(randNumbers);

        Stopwatch swatch = new Stopwatch();  
        
        int n = randNumbers.length;
        
        swatch.start();
        QuickSort object = new QuickSort();
        object.libQuickSort(randNumbers, 0, n - 1);
        swatch.stop();
        swatch.readout();
        swatch.reset();

        System.out.println("Array sorted by Quick Sort: ");
        printArray(randNumbers);*/
    }
}
