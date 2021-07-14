
public class FloatEqu {

	private static final double TOLERENCE = 0.000001;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double equation_1;
		double equation_2;
		equation_1 =(1.0/10) * (1.0/10);
		equation_2 =(1.0/100);
		
		System.out.println("equation1: " + equation_1);
		System.out.println("equation2: " + equation_2);
		if (equation_1 == equation_2) 
		{
			
			System.out.println("Equal");
		}
		else 
		{
			
		    System.out.println("Not Equal");
		   
		}
	
 if ( Math.abs(equation_1 - equation_2) < TOLERENCE){
	 System.out.println("both are equal");
	 return;
 }
	}
}