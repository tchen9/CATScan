# CATScan

We selected the following methods to implement in our Atac class:
1. `addFirst(T e)`   : Adds a node e to the front 
2. `addLast(T e)`     : Adds a node e to the end
3. `peekFirst()`      : Returns the cargo of the first node
4. `peekLast()`       : Returns the cargo of the last node
5. `removeFirst()`    : Removes the first node
6. `removeLast()`     : Removes the last node
7. `toString()`       : Prints a deque that appears the way a human would expect

We chose a doubly-linked node-based architecture in implementing the deque interface. This is because we have seen in our coding of the Queue class, that using nodes guarantees constant runtime for both adding and removing. Therefore, adding and removing, regardless of position (first or last), will have a constant runtime. An ArrayList would have a linear runtime for addFirst(), and a linear runtime for removeFirst(). 

The upside of an ArrayList would be that it requires less memory. However, we do not expect to be building a huge deque, but rather one that can simply mimic the length of a Fake Terry's line. Therefore, we prioritized speed over memory, and used a doubly-linked node methodology.
