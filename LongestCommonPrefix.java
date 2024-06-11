package AllPrograms;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s = {"flower", "flow", "flight"};
		String value = LongestCommonPrefix(s);
		System.out.println("Matching prefix's are : "+value);
		
	}

	public static String LongestCommonPrefix(String[] s) {
		if(s == null || s.length == 0) {
			return "No values in String";
		}
		String prefix = s[0];
		for(int i=1; i <s.length;i++) {
			while(s[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "No matching prefix";
				}
			}
		}
		return prefix;	
	}
}
