package com.codingchallengedsa.corejava;

import java.util.Scanner;

public class MergeSort {
	
	Scanner sc = new Scanner(System.in);
	 int size, i, j,k, arr[], left, right, mid; 
	 boolean status;
	 
	 public void doMergeSort() {
			
			System.out.println("Enter the number of elements you want to sort "); 
			this.size = sc.nextInt();
			System.out.println("Enter the elements you want to sort");
			this.arr = new int[this.size];
			insertValues();
			System.out.println("The array before sorting : ");
			printValues();
			System.out.println();
			
			mergeSort(arr , 0, arr.length-1);
			
			System.out.println("This is the array after implementing merge sort : ");
			displaySortedValues();
		}
	 
	 private void mergeSort(int array[], int left, int right) {
		 if(left < right) {
				 int mid = (left+right)/2;
				 mergeSort(arr,left,mid);
				 mergeSort(arr,mid+1,right);
				 merge(arr, left, mid, right);
		 }
	 }
	 
	 private void merge(int array[], int left, int mid, int right) {
		 int leftsplit = (mid-left)+1; //left array size
		 int rightsplit = right - mid; //right array size
		 
		 int leftArr[] = new int[leftsplit]; //left array
		 int rightArr[] = new int[rightsplit]; //right array
		 
		 for(int i = 0; i < leftsplit; i++) 
			 leftArr[i] = arr[left + i];
		 
		 for(int j = 0; j < rightsplit; j++) 
			 rightArr[j] = arr[mid+ 1 + j];
		 
		 int i = 0,j = 0,k = left;
		 
		 
		 while(i < leftsplit && j < rightsplit) {
			 if(leftArr[i]  <= rightArr[j]) {
				 arr[k] = leftArr[i];
				 i++;
			 }
			 else {
				 arr[k] = rightArr[j];
				 j++;
			 }
			 k++;
		 }
		 
		 while(i < leftsplit) {
			 arr[k] = leftArr[i];
			 i++;
			 k++;
		 }
		 
		 while(j < rightsplit) {
			 arr[k] = rightArr[j];
			 j++;
			 k++;
		 }
		 printValues();
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
		
		MergeSort msort = new MergeSort();
		msort.doMergeSort();
		
		}
}


