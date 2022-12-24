package in.praveenit;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {3,4,2,13,4555};
		int temp[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[count]=arr[i];
			 count++;
		}
		for(int n:temp) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
