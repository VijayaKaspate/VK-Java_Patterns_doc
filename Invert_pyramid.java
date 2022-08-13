import java.util.*;
public class Invert_pyramid {
public static void main(String[] args) {
	Scanner scb=new Scanner(System.in);
	int r=scb.nextInt();
	System.out.println("the row is  "+r);
	for(int i=r;i>=1;--i) {
		for(int j=1;j<=i;++j) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}