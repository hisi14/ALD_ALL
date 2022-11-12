package A01_Stack;


public class Stack<T>
{
	 private Node<T> last;
     private int counter = 0;
    /**
     * Oberstes Element entfernen und zurückliefern.
     * Existiert kein Element, wird eine Exception ausgelöst.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {
        if(last == null)
            throw new StackEmptyException();

        T returnValue = last.getData();
        last = last.getNext();

        counter --;
        return returnValue;
    }
    
    /**
     * Übergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {

        Node<T> helper = new Node<>(i);
        helper.setNext(last);
        last = helper;
        counter ++;
    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
    	return counter;
    }
}
