//we have print here the patter for number in the way of pyramid
public class Half_pyramid_numbers {
public static void main(String[] args) {
	int n=5;
	//outer loop
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
			
}
}
