package Stacks;

import java.util.Stack;

public class minAddtoMakeValidBracketPair {
    public int addToMakeValid(String s){

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
        return stack.size(); //the remaining invalid pairs must be again added with opening to make it valid pair 
    }

    
}

//optimization


    //      int open=0,close=0;
    
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(ch=='{'){
    //             open++;
    //         }else{
    //             if(open<=0){
    //                 close++;
    //             }else{
    //                open--;
    //             }

    //         }
    //     }
    //     return open+close; //the remaining invalid pairs must be again added with opening to make it valid pair 
    // }

