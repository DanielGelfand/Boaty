/*
 * Interface for a Deque --> A Double Ended QUEue
 */

public interface Deque<Card> {

  // Inserts the specified element at the front of this deque
  // unless it would violate capacity restrictions.
  public boolean offerFirst(Card e);

  // Inserts the specified element at the end of this deque
  // unless it would violate capacity restrictions.
  public boolean offerLast(Card e);

  // Retrieves and removes the first element of this deque
  // Returns the head of the deque or null if empty
  public Card pollFirst();

  // Retrieves and removes the last element of the deque
  // Returns the tail of the deque or null if empty
  public Card pollLast();

  // Retrieves, but does not remove, the first element of the deque
  // Returns the head of the deque or null if empty
  public Card peekFirst();

  // Retrieves, but does not remove, the last element of the deque
  // Returns the tail of the deque or null if empty 
  public Card peekLast();

} // end interface Deque
