package Stack;

import SinglyLinkedList.SinglyLinkedList;

public class SlinkedStack<E>  implements Stack<E> {
    SinglyLinkedList<E> slist=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return slist.isEmpty();

    }

    @Override
    public int size() {
      return   slist.size();

    }

    @Override
    public void push(E data) {
        slist.addFirst(data);
    }

    @Override
    public E pop() {
        return slist.removeFirst();
    }

    @Override
    public E top() {
        return slist.getFirst();
    }
    public void clear(){
        while (!slist.isEmpty()){
            slist.removeFirst();
        }
    }
}
