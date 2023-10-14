package ValidParentheses;
import java.util.Stack;
public class Solution {
    static public boolean ValidParentheses(String s){
        Stack<Character> parentheses = new Stack<>(); 
        for (int i = 0 ; i < s.length() ; i ++){
            if (s.charAt(i) == '('){
                parentheses.push(')'); 
            }
            else if (parentheses.empty() || parentheses.peek() != s.charAt(i)){
                return false ; 
            }
            else {
                parentheses.pop(); 
            }
        }
        return parentheses.empty() ; 
    }

    static public void main(String [] args ){
        String parentheses = "()((()))" ; 
        System.out.println(ValidParentheses(parentheses)) ; 
    }
}
