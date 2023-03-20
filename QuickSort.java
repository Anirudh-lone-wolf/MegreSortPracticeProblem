package com.codingchallengedsa.corejava;

import java.util.Scanner;

public class QuickSort {
	
	Scanner sc = new Scanner(System.in);
	 int size, i, j, pivot, low, high, temp = 0, arr[]; 
	 boolean status;
	 
	 public void doQuickSort() {
			
			System.out.println("Enter the number of elements you want to sort "); 
			this.size = sc.nextInt();
			System.out.println("Enter the elements you want to sort");
			this.arr = new int[this.size];
			insertValues();
			System.out.println("The array before sorting : ");
			printValues();
			System.out.println();
			
			quickSort(arr, 0, arr.length-1);
			
			System.out.println("This is the array after implementing selection sort : ");
			displaySortedValues();
		}
	 
	 private void quickSort(int[] array, int low, int high) {
		 if(low < high) {
			 pivot = partition(arr, low, high);
			 printValues();
			 quickSort(arr, low, pivot - 1);
			 printValues();
			 quickSort(arr, pivot + 1, high);
			 printValues();
		 }
	 }
	 
	 private int partition(int[] array, int low, int high) {
		 int pivot_Element = arr[high];
		 i = low-1;
		 
		 for(j = low; j <= high-1; j++) {
			if(arr[j] < pivot_Element) {
				 i++;
				 swap(arr, i, j);
			}
		 }
		 swap(arr, i+1, high);
		 return i + 1;
	 }
	 
	 private void swap(int[] array, int i, int j){
		 temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	 }

	private void displaySortedValues() {
		for(int l = 0; l < arr.length; l++) {
			System.out.print(arr[l]+" ");
		}
	}

	private void printValues() {
		for(int m = 0; m<arr.length; m++) {
			System.out.print(arr[m]+" ");
		}
		System.out.println();
	}

	private void insertValues() {
		for(int n = 0; n < this.size; n++) {
			this.arr[n] =sc.nextInt();
		}
	}


	public static void main(String[] args) {
		QuickSort quicksort = new QuickSort();
		quicksort.doQuickSort();
	}

}
