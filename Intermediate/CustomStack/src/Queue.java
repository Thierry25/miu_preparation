import java.util.LinkedList;

public class Queue<E> {
    private final LinkedList<E> list = new LinkedList<>();

  public boolean isEmpty(){
      return this.list.isEmpty();
  }

  public void enqueue(E element){
      this.list.addLast(element);
  }

  public E dequeue(){
      return this.list.removeFirst();
  }
}
