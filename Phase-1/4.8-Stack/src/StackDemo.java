import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stk= new Stack<>();   
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push(22);  
		stk.push(245);  
		stk.push(64);  
		stk.push(72);  
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		System.out.println("Is the stack empty? " + result);

	}

}
