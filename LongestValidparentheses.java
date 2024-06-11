package AllPrograms;

import java.util.Stack;

public class LongestValidparentheses {

	public static int longestValidparentheses(String s) {
		int maxlength = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		
		for(int i =0 ; i<s.length();i++) {
			if(s.charAt(i)== '(') {
				stack.push(i);
			}
			else {
				stack.pop();
				if(stack.isEmpty()) {
					stack.push(i);
				}
				else {
					maxlength = Math.max(maxlength, i-stack.peek());
				}
			}
		}
		
		return maxlength;
		
	}
	
	public static void main(String[] args) {
		String s = "))((((())";    //first '(' open parenthese osthene valid orelse move to next
		System.out.println(longestValidparentheses(s));

	}

}
