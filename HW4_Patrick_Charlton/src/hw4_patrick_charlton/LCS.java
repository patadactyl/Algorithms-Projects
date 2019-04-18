/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4_patrick_charlton;

import java.util.Scanner;

/**
 *
 * @author patrickcharlton
 */
public class LCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] Y = {'0','1','0', '1', '1', '0', '1', '1', '0'};
        char[] X = {'1','0','0', '1', '0', '1', '0', '1'};
        int m = X.length;
        int n = Y.length;
        dynamic_lcs_length(X, Y, m, n);
        brute_force_lcs(X, Y, m, n);

    }

    private static void dynamic_lcs_length(char[] X, char[] Y, int m, int n) {
        char[][] b = new char[m + 1][n + 1];
        int[][] c = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < n + 1; j++) {
            c[0][j] = 0;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = '\\';

                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    b[i][j] = '|';
                } else {
                    c[i][j] = c[i][j - 1];
                    b[i][j] = '-';
                }
            }
        }
        print2D(c);
        print2D(b);
        print_lcs(b, X, m, n);
    }

    private static void print_lcs(char[][] b, char[] X, int i, int j) {
        if (i == 0 || j == 0) {
            return;
        }
        if (b[i][j] == '\\') {
            print_lcs(b, X, i - 1, j - 1);
            System.out.print(X[i - 1] + " ");
        } else if (b[i][j] == '|') {
            print_lcs(b, X, i - 1, j);
        } else {
            print_lcs(b, X, i, j - 1);
        }
    }
    

    private static int brute_force_lcs(char[] X, char[] Y, int m, int n) {
        char[][] b = new char[m + 1][n + 1];
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X[m - 1] == Y[n - 1]) {
            return 1 + brute_force_lcs(X, Y, m - 1, n - 1);
        } else {
            return Math.max(brute_force_lcs(X, Y, m - 1, n), brute_force_lcs(X, Y, m, n - 1));

        }
    }

    private static void print2D(int grid[][]) {
        for (int[] rowInt : grid) {
            System.out.println(rowInt);
        }
    }

    private static void print2D(char grid[][]) {
        for (char[] rowChar : grid) {
            System.out.println(rowChar);
        }
    }

}
