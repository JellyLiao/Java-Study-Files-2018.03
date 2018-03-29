/*
*Title:SelectSort(Can't Enter)
*Author:JellyLiao
*Xirsion:1.0
*Description：Use Java language,use select sort algorithm,selective sortting for a known array
*Date:2018.03.29
*Copyright:Copyright (c),2018,JellyLiao
*/

public class SelectSort{
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
	    int [] a={1,7,3,9,2,5,8,4,6};
	    SelectionSort(a);
	    for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
}