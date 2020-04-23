package com.ml.sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		//给出无序数组
		int[] arr = {72,6,57,88,60,42,83,73,48,85};
		
		System.out.println(Arrays.toString(arr));
		
		quickSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr) {
		int low=0;
		int high = arr.length-1;
		quickSort(arr,low,high);
	}

	private static void quickSort(int[] arr, int low, int high) {
		if(low<high){
			int index=MiddleIndex(arr,low,high);
			quickSort(arr,low,index-1);
			quickSort(arr,index+1,high);
		}
	}

	private static int MiddleIndex(int[] arr, int low, int high) {
		int x = arr[low];
		//指定左指针i和右指针j
		int i = low;
		int j= high;
		while(i<j){
			while(arr[j]>=x && i<j){
				j--;
			}
			if(i<j){
				arr[i]=arr[j];
			}
			while(arr[i]<x&&i<j){
				i++;
			}
			if(i<j){
				arr[j]=arr[i];
			}
		}
		arr[i]=x;
		
		return i;
	}
}
