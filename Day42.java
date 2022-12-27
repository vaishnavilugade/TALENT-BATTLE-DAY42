import java.util.*;
class Day42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size1,size2;
		System.out.println("Enter the size of first array :");
		size1=sc.nextInt();
		int arr[]=new int[size1];
		System.out.println("Enter elements of first array :");
		for(int i=0;i<size1;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second array :");
		size2=sc.nextInt();
		int arr1[]=new int[size2];
		System.out.println("Enter elements of second array :");
		for(int i=0;i<size2;i++){
			arr1[i]=sc.nextInt();
		}
		if(Arrays.equals(arr,arr1)){
			System.out.println("same");
		}
		else{
			System.out.println("not same");
		}
		
		
	}
}

		
		
		