import java.util.Scanner;
public class NumDisplay {
 
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        System.out.println(getNumName(number));
        in.close();
    }

	// Get the name for the number
    public static String getNumName(int number) {
        String Name = "";
        switch (number) {
            case 0: Name = "Zero"; break;
            case 1: Name = "One"; break;
            case 2: Name = "Two"; break;
            case 3: Name = "Three"; break;
            case 4: Name = "Four"; break;
            case 5: Name = "Five"; break;
            case 6: Name = "Six"; break;
            case 7: Name = "Seven"; break;
            case 8: Name = "Eight"; break;
            case 9: Name = "Nine"; break;
            default:Name = " Wrong Number ";
        }
        
        return Name;
    }
}

      
  
	 


