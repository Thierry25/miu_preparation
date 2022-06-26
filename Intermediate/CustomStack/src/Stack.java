import java.util.ArrayList;
import java.util.List;

public class Stack<E>{
    private final List<E> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() -1);
    }

    public E pop(){
        E element = peek();
        list.remove(element);
        return element;
    }

    public void add(E element){
        this.list.add(element);
    }
}
