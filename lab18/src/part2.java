import java.util.ArrayList;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
	    int n=input.nextInt();
	    
		int [][] mat=new int[n][n];
		for(int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = (int) Math.round(Math.random());
				
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}
    
		ArrayList<Integer> c = new ArrayList<>();
    	ArrayList<Integer> r = new ArrayList<>();
		int max = -1;
		for(int i = 0; i<mat.length; i++) {
			int sum = 0;
			for(int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == 1)
					sum++;
			}
			if (sum > max) {
				max = sum;
				r.clear();
				r.add(i);
			}
			else if (sum == max) {
				r.add(i);
			}
		}
		System.out.println("Row max");

		System.out.println(r);
		
		max = -1;
		for(int i = 0; i<mat.length; i++) {
			int sum = 0;
			for(int j=0; j<mat[i].length; j++) {
				if (mat[j][i] == 1)
					sum++;
			}
			if (sum > max) {
				max = sum;
				c.clear();
				c.add(i);
			}
			else if (sum == max) {
				c.add(i);
			}
		}
		System.out.println("Column max");

		System.out.println(c);

    }
    
    
}