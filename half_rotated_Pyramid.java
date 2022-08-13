//rotated by 180 degree
import java.util.*;
//by 180 degree we rotated pyramid..
public class half_rotated_Pyramid {
public static void main(String[] args) {
	int n=4;
	//outer loop
	for(int i=1;i<=n;i++) {
		//inner loop this is for spaces
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		//loop for printing stars
		for(int j=1;j<=i;j++) {
			System.out.print("*");
	}
		
		System.out.println();
		//outer loop end
}
}
}