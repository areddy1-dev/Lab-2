

import java.util.Scanner;

public class DistCalc {
    public static void main(String[] args){
        float x1;
		float x2;
		float y1;
		float y2;
		Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        x1 = input.nextFloat();
        y1 = input.nextFloat();
        
        System.out.print("Enter x2 and y2: ");
        x2 = input.nextFloat();
        y2 = input.nextFloat();
        input.close(); 
        float determinant = (float) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        float sqrRoot = (float) Math.pow(determinant, 0.5);

        System.out.printf("The distance between two points is %.3f", sqrRoot);
    }
}
