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
public class HeapSort {

    static void libHeapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    static void heapify(int array[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r < n && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, n, largest);
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        /*Random rand = new Random();
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
        HeapSort object = new HeapSort();
        object.libHeapSort(randNumbers);
        swatch.stop();
        swatch.readout();
        swatch.reset();

        System.out.println("Array sorted by Heap Sort: ");
        printArray(randNumbers);*/
    }
}
