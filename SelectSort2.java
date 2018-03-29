/*
*Title:SelectSort(Can Enter)
*Author:JellyLiao
*Xirsion:2.0
*Description：Use Java language,use select sort algorithm,
selective sortting for a enter array,
but the length of the array is fixed
*Date:2018.03.29
*Copyright:Copyright (c),2018,JellyLiao
*/

import java.util.Scanner;
import java.util.Arrays;
public class SelectSort2{
	public static void SelectionSort(int[] b){
		for(int i=0;i<b.length;i++){
			int k=i;
			for(int j=i+1;j<b.length;j++){
			if(b[k]>b[j])
				k=j;
		}
		if(k!=i){
			int temp=b[i];
			b[i]=b[k];
			b[k]=temp;
		    }
	    }
    }

    public static void main (String args[]){
    	Scanner x=new Scanner(System.in);
    	System.out.println("Please enter a string of integers:");
	    int [] a=new int[10];
	    for(int c=0;c<10;c++){
	    	a[c]=x.nextInt();
	    }
	    x.close();
	    SelectionSort(a);
	    for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
}