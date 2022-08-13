import java.util.*;
public class Hollow_rectangle {
public static void main(String[] args) {
	Scanner obj1=new Scanner(System.in);
	int r=obj1.nextInt();
	int col=obj1.nextInt();
	for(int i=1;i<=r;i++) {
		for(int j=1;j<=col;j++) {
			if(i==1 || i==r || j==1 || j==col) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");
		}
		
	}
		System.out.println();
}}
}
