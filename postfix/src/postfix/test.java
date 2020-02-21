package postfix;
import java.util.*; 

public class test {
	//Initialize a Stack for operators, output list
	//Split the input into a list of tokens.
	/*for each token (left to right):
	if it is operand: append to output
	if it is '(': push onto Stack
	if it is ')': pop & append till '('*/
	/*   if it in '+-/*': 
	            while peek has precedence ≥ it:
	                   pop & append
	            push onto Stack
	pop and append the rest of the Stack.*/


	public static void main(String[] args) {
	        System.out.println(postFixEvaluate("5 2 4 * + 7 -")); 
	    }
	    
	    public static int postFixEvaluate(String ex){
	        Scanner myScan = new Scanner(ex);
	        Stack<Integer>s = new Stack<Integer>();
	        
	        while(myScan.hasNext()){
	            if(myScan.hasNextInt())
	                s.push(myScan.nextInt());
	            
	            else{
	                int num2= s.pop();
	                int num1= s.pop();
	                String operator = myScan.next();
	                
	                if(operator.equals("+")){
	                s.push(num1+num2);   
	            }
	                
	                else if(operator.equals("-")){
	                s.push(num1-num2);
	            }
	                else if(operator.equals("/")){
	                s.push(num1/num2);
	            }
	                else{
	                s.push(num1*num2);
	            }
	            }
	        }
	        myScan.close();
	        return s.pop();
	    }
}
