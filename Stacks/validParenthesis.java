package Stacks;
import java.util.*;

// ()()( --invalid paranthesis

//paranthesis questions mostly solved with stacks

public class validParenthesis {

    public static boolean isValid(String s){
        int n=s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){ //if opening blind push
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if(ch==')'&&top!='('){
                    return false;
                }else if(ch==']'&&top!='['){
                    return false;
                }else if(ch=='}'&&top!='{'){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        //After for loop again we will check if stack is empty or not , if it is not empty then we have extra opening pairs left
        return (stack.size()==0);




    }


       public static void main(String[] args) {
        // ✅ Test cases
        String[] testCases = {"()()", "([])", "({[]})", "([)]", "(()", ")("};
        for (String s : testCases) {
            boolean result = isValid(s);
            System.out.println("Input: " + s + " → Valid? " + result);
        }
    }

}
