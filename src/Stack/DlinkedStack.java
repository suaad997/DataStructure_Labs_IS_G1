package Stack;

import DoublyLinkedList.DoublyLinkedList;

public class DlinkedStack<E>  implements Stack<E> {
    DoublyLinkedList<E> dlist =new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return dlist.isEmpty();

    }

    @Override
    public int size() {
      return   dlist.size();

    }

    @Override
    public void push(E data) {
        dlist.addFirst(data);
    }

    @Override
    public E pop() {
        return dlist.removeFirst();
    }

    @Override
    public E top() {
        return dlist.getFirst();
    }
    public void clear(){
        while (!dlist.isEmpty()){
            dlist.removeFirst();
        }
    }
}
