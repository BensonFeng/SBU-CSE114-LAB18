import java.util.ArrayList;
import java.util.Scanner;

public class part1 {
	
    public static void main(String[] args) {
		System.out.println("Enter 5 integers: ");
	    Scanner input = new Scanner(System.in);
	    ArrayList<Integer> list = new ArrayList<>();
	    for (int i = 0; i < 5; i++) list.add(input.nextInt());
	    sort(list);
	    System.out.println(list);
    }
    
    public static void sort(ArrayList<Integer> list) {
    	int temp;
    	for(int i = 0; i < list.size(); i++ ) {
    		for (int j =  0; j < list.size() - 1; j++) {
    			if(list.get(j)>list.get(j+1)) {
    				temp = list.get(j);
    				list.set(j, list.get(j+1));
    				list.set(j+1,temp);
    			}
    		}
    	}
    }
}