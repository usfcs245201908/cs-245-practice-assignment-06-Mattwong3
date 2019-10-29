public class ArrayStack <T> implements Stack<T> {
        int top;
        int size;
        T[] a;

    public ArrayStack(){
        size = 0;
         top = 0;
         a = (T[]) new Object[10];



    }

    public void push(T item){
        int len = a.length;
        size = len;
        if(top ==size){

            T[] new_array = (T[]) new Object[len * 2];
            for (int i = 0; i < len; i++) {
                new_array[i] = a[i];
            }
            a = new_array;
        }


        a[top++] = item;


    }

    public T pop() {
        if(top>0)
            return a[--top];
        else
            return null;



    }
    public T peek(){
        int len = a.length;
        return a[len-1];

    }
    public boolean empty(){
        return top == 0;


    }

}
