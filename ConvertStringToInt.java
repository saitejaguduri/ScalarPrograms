package AllPrograms;

public class ConvertStringToInt {

	public static void main(String[] args) {
		
		String s = "123456";
		
		//this is parsing example
        int num = Integer.parseInt(s);
        System.out.println(num);
        
        //this is by using valueOf method we can also use this try catch method for parseint
        String s2 = "1ef345";
        try {
        	int number = Integer.valueOf(s2);
        	System.out.println(number);
        }
        catch(NumberFormatException e) {
        	System.out.println("Invalid number format for parseInt: " + e);
        }
        
        
	}

}
