/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

/**
 *
 * @author Asus
 */
public class SinglyLink {
    private node head;
    
    public SinglyLink(){
        head = null;
    }
    
        public void insertStart(int data){
            node newNode = new node(data);
            newNode.next = head;
            head = newNode;
        }
        
            public void insertEnd(int data) {
                node newNode = new node(data);
                if (head == null) {
                    head = newNode;
                    return;
                }
                node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
             public boolean deleteNode(int data) {
                    if (head == null) return false;
                   
                    if (head.data == data) {
                        head = head.next;
                        return true;
                    }
                    node temp = head;
                    while (temp.next != null && temp.next.data != data) {
                        temp = temp.next;
                    }
                        if (temp.next == null) return false;
                        
                        temp.next = temp.next.next;
                        return true;
             } 
                            public String traverse(){
                                if (head == null) return "List is Empty!!!";
                                StringBuilder rs = new StringBuilder();
                                node temp = head;
                                while  (temp != null) {
                                    rs.append(temp.data).append(" -> ");
                                    temp = temp.next;
                                }
                                    rs.append("Null");
                                    return rs.toString();
                                }
                            
            
               
                            }               
                
