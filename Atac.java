//Tina Chen, Caleb Smith-Salzberg, Angel Ng
//Team CATScan
//APCS2 pd5
//Lab02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2017-03-31

public class Atac<T> implements Deque<T>{
    private DLLNode<T> _head;
    private DLLNode<T> _tail;
    private int size;
    
    //creates empty deque
    public Atac(){
	_head = _tail = null; 
	size = 0;
    }

    //adds a node to the beginning of the deque
    public void addFirst( T e ){
	DLLNode<T> toAdd = new DLLNode( e, null, null ); //node to add
	if ( _head==null )
	    _tail = toAdd;
	else {
	    toAdd.setNext( _head );
	    _head.setPrev( toAdd );
	}
	_head = toAdd;
	size += 1;
    }
    
    //adds a node to the end of the deque
    public void addLast( T e){
	DLLNode<T> toAdd = new DLLNode( e, null, null ); //node to add
	if ( _head==null )
	    _head = toAdd;
	else {
	    _tail.setNext( toAdd);
	    toAdd.setPrev(_tail);
	}
	_tail = toAdd;
	size += 1;
    }

    //returns what's in the first node
    public T peekFirst(){
	return _head.getCargo();
    }

    //returns what's in the last node
    public T peekLast(){
	return _tail.getCargo();
    }

    public String toString(){
	String ret = "";
	DLLNode<T> temp = _head;
	while (temp != null){
	    ret += temp.getCargo() + " ";
	    temp = temp.getNext();
	}
	return ret;
    }

    //reassigns the pointers so nothing points to the first node and the garbage collector eats it
    public T removeFirst(){
	if (size==1){
	    T first = _tail.getCargo();
	    _head=_tail=null;
	    return first;
	}
       	if (isEmpty())
	    throw new NullPointerException("Cannot remove from an empty Deque");
	T first = _head.getCargo(); 
	_head = _head.getNext();
	_head.setPrev(null); 
	size--; 
	return first; 
    }

    //reassigns the pointers so nothing points to the last node and the garbage collector eats it
    public T removeLast(){
	if (size==1){
	    T last = _tail.getCargo();
	    _head=_tail=null;
	    return last;
	}
	else if (isEmpty())
	    throw new NullPointerException("Cannot remove from an empty Deque");
	else{
	    T last = _tail.getCargo(); 
	    _tail = _tail.getPrev(); 
	    _tail.setNext(null); 
	    size--; 
	    return last;
	}
    }

    //returns size of deque 
    public int size(){
	return size;
    } 
    public boolean isEmpty(){
	return size==0;
    }

    public static void main(String[] args){
	Atac<String> bob = new Atac<String>();
	bob.addLast("a");
	bob.addLast("b");
	bob.addFirst("z");
	System.out.println(bob);
	bob.removeLast();
	System.out.println(bob);
    }
}
