# Boaty :boat: :speedboat: :sailboat: -- Daniel Gelfand, Tim Marder, Maxwell Vale

##  :sweat_drops: Step 1 :sweat_drops:
#### Create Deque interface.


## :sweat_drops: Step 2 :sweat_drops:
#### Implement the methods specified by the Deque interface.
1. offerFirst(e)
2. offerLast(e)
3. pollFirst()
4. pollLast()
5. peekFirst()
6. peekLast()

Methods will be written one at a time using the interface as a guide and compilability will be ensured.

## :sweat_drops: Step 3 :sweat_drops:
#### Test. Test. Test. Profit. :moneybag:

## Why an ArrayList based architecture?
ArrayList methods closely resemble the necessary methods needs for a deque.
The handy ArrayList methods, in addition to automatic resizing, make ArrayList a decent option for a deque.
Although an O(n) runtime will be encountered during element shifts, the ease of use in contrast with the pointers of LLNodes
and the size issues of arrays make it the best option for Boaty.

