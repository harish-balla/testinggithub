package jdbc_apps;

public class TechmahindraTest {

	public static void main(String[] args) {
		TechmahindraTest t =new TechmahindraTest();
		int arr[]= {10,11,7,12,14};
		System.out.println("Result is "+t.getDiff(4, arr));

	}
	public int getDiff(int s,int arr[]) {
		int lo=arr[1],high=arr[1];
		for(int i=0;i<=s;i++) {
			for(int j=i;j<=s;j++) {
				if(arr[j]>high) {
					high=arr[j];
				}
				if(arr[j]<lo) {
					lo=arr[j];
				}
			}
		}
		return high-lo;
	}

}
