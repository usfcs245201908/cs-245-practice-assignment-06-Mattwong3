public class ArrayQueue<T> implements Queue<T> {
    int front;
    int back;
    T[] a;
    int size;


    public ArrayQueue(){
        back = 0;
        front = 0;
        a = (T[]) new Object[10];
        size = 10;


    }


    public T dequeue(){
        if(front == back)
            return null;
        T item  = a[front];
        front = (front+1)%size;
        /*int len = a.length;
        for(int i = 0;i<len-1;i++){
            a[i]=a[i+1];
        }
        back--;*/
        return item;


    }
    public void enqueue(T item){
        int len = a.length;
        if(back ==a.length) {
            T[] new_array = (T[]) new Object[len * 2];
            for (int i = 0; i < len; i++) {
                new_array[i] = a[i];
            }//copy old into new array
            a = new_array;
           back++;
            a[back] = item;



        }


        a[back] = item;
        back = (back+1)%size;



    }

    public boolean empty(){
       return front == back;
    }


}
