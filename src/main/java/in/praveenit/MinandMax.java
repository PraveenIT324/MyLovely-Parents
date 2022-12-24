package in.praveenit;

public class MinandMax {
	public static void main(String[] args) {
//		int arr[]= {4,2,7,9,6,25};
//		System.out.println("Min Elements"+arr[0]);
//		System.out.println("Max Elements"+arr[arr.length-1]);
//		//System.out.println(yttt);
		
		int arr[]= {12,3,6,8,2,9};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Max Element::"+max);
		System.out.println("Min Element::"+min);
	}
	

}
