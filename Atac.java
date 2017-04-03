//Tina Chen, Caleb Smith-Salzberg, Angel Ng
//Team CATScan
//APCS2 pd5
//Lab02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2017-03-31

public class Atac<T> implements Deque<T>{
    private DLLNode _head;
    private DLLNode _tail;
    private int size;
    
    public Atac(){
	_head = _tail = null;
    }
    public void addFirst( T e ){
	DLLNode<T> toAdd = new DLLNode( e, null, null );
	if ( _head.getCargo()==null )
	    _tail = toAdd;
    else {
	    toAdd.setNext( _head );
	    _head.setPrev( toAdd );
	}
	_head = toAdd;
	size+=1;
    }
}
