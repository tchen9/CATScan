//Tina Chen, Caleb Smith-Salzberg, Angel Ng
//Team CATScan
//APCS2 pd5
//Lab02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2017-03-31

public class Atac{
    DLLNode _head;
    DLLNode _tail;
    int size;
    
    public Atac{
	_head = _tail = null;
    }
    public void addFirst( T e ){
	DLLNode<T> toAdd = new DLLNode( e, null, null );
	if ( _head.getCargo()==null )
	    _end = add;
    else {
	    toAdd.setNext( _front );
	    _front.setPrev( toAdd );
	}
	_front = toAdd;
	size+=1;
    }
}
