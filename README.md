# CATScan
Tina Chen, Caleb Smith-Salzberg, Angel Ng
Period 5

We selected the following methods to implement in our Atac class:
1. `addFirst(T e)`   : Adds a node e to the front of a deque 
2. `addLast(T e)`     : Adds a node e to the end of a deque
3. `peekFirst()`      : Returns the cargo of the first node of a deque
4. `peekLast()`       : Returns the cargo of the last node of a deque
5. `removeFirst()`    : Removes the first node of a deque
6. `removeLast()`     : Removes the last node of a deque
7. `toString()`       : Prints a deque that appears the way a human would expect

We chose the addFirst, addLast, removeFirst, removeLast methods because they are essential to building and modifying a deque. We also decided that the peek and get methods have the same functions, but the get method throws an exception if the deque is empty, but we preferred a null output because an exception isn't necessary for this. Because of this, we only used peekFirst and peekLast. We didn't use offerFirst and offerLast because we didn't have a restricted capacity. It should throw an exception because the list is null and there is nothing to remove from.

We chose a doubly-linked node-based architecture in implementing the deque interface. This is because we have seen in our coding of the Queue class, that using nodes guarantees constant runtime for both adding and removing. Therefore, adding and removing, regardless of position (first or last), will have a constant runtime. An ArrayList would have a linear runtime for addFirst(), and a linear runtime for removeFirst(). 

The upside of an ArrayList would be that it requires less memory. However, we do not expect to be building a huge deque, but rather one that can simply mimic the length of a Fake Terry's line. Therefore, we prioritized speed over memory, and used a doubly-linked node methodology.

