package 백준1021자바ver;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1021 {

	public static void main(String[] args) {
		
     	Scanner sc = new Scanner(System.in); 
//		int a,b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {

			arr[i]= sc.nextInt();

			}
		System.out.println(Arrays.toString(arr));
	}

}
