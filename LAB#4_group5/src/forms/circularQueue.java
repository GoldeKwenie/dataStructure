
package forms;


public class circularQueue {

    private int[] arr;
    private int front, rear, size;
    
    public circularQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;   
    }
        public boolean enqueue(int value){
            if(size == arr.length) {
                return false;
            }
            rear++;
            arr[rear] = value;
            size++;
            return true;
        }
        
            public Integer dequeue() {
                if (size == 0) {
                    return null;
                }
                int value = arr[front];
                front = (front + 1) % arr.length;
                size--;
                return value;
            }
                public int[] getContents() {
                    int[] contents = new int[size];
                    for (int i = 0; i < size; i++) {
                        contents[i] = arr[(front+ i) % arr.length];
                    }
                    return contents;
                }
    
    
    
}

    

