/*** TEAM BOATY ***/
/*
Tim Marder, Dan Gelfand, Maxwell Vale
APCS2 pd02
lab02 -- All Hands on Deque!
2018-04-20
*/

/**********
_~
_~ )_)_~
)_))_))_)
_!__!__!_
\_______/

***********/


import java.util.ArrayList;

public class QQKachoo<Card> implements Deque<Card> {

  // Utilizes an ArrayList to implement the Deque interface
  ArrayList<Card> deck;

  // default constructor
  public QQKachoo() {

    // instantiate the ArrayList
    deck = new ArrayList<Card>();

  }

  /** Implementation of the Deque Methods **/

  /* ~~~~~ "Add" Methods ~~~~~
  * Uses the add() methods of ArrayList
  * Adds element at the beginning or end
  */

  // Adds element at the beginning of the Deque
  // Returns true if the add is successful and false otherwise
  public boolean offerFirst(Card e) {

    //Handle exception
    if(e == null){
      throw new NullPointerException();
    }

    deck.add(0,e);
    return true;

  }

  // Adds element to the end of the Deque
  // Returns true if the add is successful and false otherwise
  public boolean offerLast(Card e) {
    //Handle exception
    if(e == null){
      throw new NullPointerException();
    }
    
    return deck.add(e);

  }

  /* ~~~~~ "Remove" Methods ~~~~~
  * Use the remove() method of ArrayList
  * Removes either the first or last element
  */

  // Removes and returns the first element of the ArrayList
  public Card pollFirst() {

    if (deck.size() == 0) {
      return null;
    }
    return deck.remove(0);

  }

  // Removes and returns the last element of the ArrayList
  public Card pollLast() {

    if(deck.size() == 0) {
      return null;
    }
    return deck.remove(deck.size() - 1);


  }

  /* ~~~~~ "Get" Methods ~~~~~
  * Uses the get() method of ArrayList
  * retrieve (without removing) either the first or last element
  */

  public Card peekFirst() {

    return deck.get(0);

  }

  public Card peekLast() {

    return deck.get(deck.size() - 1);

  }

  /* ~~~~~ isEmpty Method ~~~~~ */

  public boolean isEmpty() {

    return deck.size() == 0;

  }

  /** END DEQUE INTERFACE IMPLEMENTATION **/


  public String toString() {

    // Uses the toString of the ArrayList to print the contents
    return deck.toString();

  }

  /*


  _..__                    .
  ____...--...__.-''     ''-.         ....---:
  .--'''             ''-.          '.              '.
  .'                       :_._        :      __..--'''.
  :            ___        .'    '--..--'            _.-''-..   _.-
  '-.___..--''   '''---''                       .-'    .' :"":
  .._                               .'  :   :
  :  '"-.                         .'   :     :
  .:     '-.                          :      :
  . :       '.
  .  :        '.
  .   :       _ '.
  .   :   .-" :  :
  .    :-'   :    :
  .  .'$$bn.:      :
  .'   "**:        '.
  :_      :          :.
  .'$$$$Mnn.'.          :.
  .'      "": :          : .
  :__       :   :         '. .
  :$$$$$NNnnn:   :           : .
  .:       """:    '.           : .
  .:           :     :           '. .
  .:...__      .'     :            :   .
  . .'***##nnnnnn:      :             :   .
  .  :      """"" :      '.            :     .
  .  .'           .'       :            '.     .
  .    :MMMnnnccccnn:        :             :       .
  .    :      """""".'.       :             :        .
  .     .'            :  .       :             :         .
  .      :$$$$$NNnnnnnn:  .       :           __:           .
  .       .'       """"".'   .      :   ....--""                .
  .          """"":.------:    .       """    ::                    .
  ----____       ::             .       _______::...--------""""""""/
  \       """"----'____....     ...--"""            ___--""""-- .. /
  \__   ....----""""""  ---""""     """""     """"
  """...___            _____.....---""""       ____....___
  """----"""""          ......----""""

  */

} // end class QQKachoo
