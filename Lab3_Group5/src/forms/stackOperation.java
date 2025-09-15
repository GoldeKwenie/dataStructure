/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
class stackOperation {
    private  int maxsize;
    private int top;
    private String[] stack;
    
    public stackOperation(int size) {
        maxsize = size;
        stack = new String[maxsize];
        top = -1;
    }
        public boolean push(String value){
            if (top >= maxsize - 1) {
                return false;
            }
            top++;
            stack[top] = value;
            return true;
        }
            
            public String pop() {
                if (top < 0){
                    return null;
                }
                String remove = stack[top];
                stack[top] = null;
                top--;
                return remove;
            }
            
                public String getStack() {
                    String result = "";
                    for (int i = top; i >= 0; i--){
                        result += stack[i] + "\n";
                    }
                        return result;
                }
                
                    public boolean isEmpty(){
                        return top < 0;
                    }       
}
