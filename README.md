# CATScan

We selected the following methods to implement in our Atac class:
1. addFirst(T e)    : Basic function of a Deque to add an element
2. addLast(T e)     : Basic function of a Deque to add an element
3. peekFirst()      : Basic function of a Deque to view an element
4. peekLast()       : Basic function of a Deque to view an element
5. removeFirst()    : Basic function of a Deque to remove an element
6. removeLast()     : Basic function of a Deque to remove an element
7. toString()       : helps with debugging and visualizing

We chose a doubly-linked node-based architecture in implementing the deque interface. This is because we have seen in our coding of the Queue class, that using nodes guarantees constant runtime for both adding and removing. Therefore, adding and removing, regardless of position (first or last), will have a constant runtime. An ArrayList must have at least one of the methods a linear runtime, and such is the case for a regular array.
