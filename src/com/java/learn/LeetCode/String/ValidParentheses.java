package com.java.learn.LeetCode.String;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for(char sym:s.toCharArray()){
           if(sym=='('||sym=='['||sym=='{'){
               stack.push(sym);
           }else{
               if(stack.isEmpty()){
                   return false;
               }
               char last = stack.peek();
               if((last=='(')&& sym==')'||(last=='[')&& sym==']'||(last=='{')&& sym=='}'){
                   stack.pop();

               }else {
                   return false;
               }
           }
       }

        return stack.isEmpty();
    }
}
