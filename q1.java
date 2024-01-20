// Question-1 java code to find the element which appears maximum number of  times(n elements)
package labexam;
import java.util.Scanner;
import java.util.Arrays;
public class q1 {
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	public static int maxFreq(int[] arr) {
		insertionSort(arr);
		int n=arr.length;
		int maxfrqele=arr[0];
		int currele=arr[0];
		int maxfrq=1;
		int currfreq=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==currele) {
				currfreq++;
			}
			else {
				currele=arr[i];
				currfreq=1;
			}
			if(currfreq>maxfrq) {
				maxfrqele=currele;
				maxfrq=currfreq;
			}
		}
		return maxfrqele;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter array elements : ");
			arr[i]=s.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		int eleMaxFreq=maxFreq(arr);
		System.out.println("Element with max frequency in array is : "+eleMaxFreq);
	}
}
