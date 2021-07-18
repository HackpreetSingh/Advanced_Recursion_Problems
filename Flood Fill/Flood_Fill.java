package advanced_Recursion_Problems;
import java.util.Scanner;
/*
 *Flood Fill
 *
 */
public class Flood_Fill {

	void color_palette(int a[][], int rows, int columns, int xindex, int yindex, int tovalue,int fromvalue) {
		if (xindex < 0 || xindex >= rows || yindex < 0 || yindex >= columns)
			return;
		else if(a[xindex][yindex]!=fromvalue) return;
		
		a[xindex][yindex]=tovalue;
		color_palette(a, rows, columns, xindex-1, yindex, tovalue, fromvalue);
		color_palette(a, rows, columns, xindex+1, yindex, tovalue, fromvalue);
		color_palette(a, rows, columns, xindex, yindex-1, tovalue, fromvalue);
		color_palette(a, rows, columns, xindex, yindex+1, tovalue, fromvalue);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int r = s.nextInt();
		int c = s.nextInt();
		int a[][] = new int[r][c];
		for(int i=0;i<r;i++) 
			for(int j=0;j<c;j++)
				a[i][j]=s.nextInt();
		
		System.out.println("Enter the x-index and y-index: ");
		int xindex = s.nextInt();
		int yindex = s.nextInt();
		System.out.println("Enter the value you want: ");
		int tovalue = s.nextInt();
		System.out.println("Enter the value previously present: ");
		int fromvalue = s.nextInt();

		new Flood_Fill().color_palette(a, r, c, xindex, yindex,tovalue,fromvalue);
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)	
			System.out.print(a[i][j]+" ");
		System.out.println();
		}
		s.close();
	}
}
