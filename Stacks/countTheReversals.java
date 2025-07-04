package Stacks;
import java.util.*;

public class countTheReversals {

    int countRev(String s){

        if(s.length()%2!=0){
            return -1;
        }

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()||stack.peek()=='}'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        //now only invalid pairs are there in the stack
        int ans=0,open=0,close=0;
        while(!stack.isEmpty()){
            char top=stack.pop();
            if(top=='{'){ //for char single quotes 
                open++;
            }else{
                close++;
            }
        }
        ans=(int)(Math.ceil(open/2.0)+Math.ceil(close/2.0)); //as we need to reverse half from opening and closing pairs to get the answer
        return ans;


    }
    
}
