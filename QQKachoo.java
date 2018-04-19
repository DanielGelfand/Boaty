/*** TEAM BOATY ***/
/* Tim Marder, Dan Gelfand, Maxwell Vale */

/**********
    _~
_~ )_)_~
)_))_))_)
_!__!__!_
\_______/

***********/


import java.util.ArrayList;

public class QQKachoo<Card> implements Deque<Card> {

  ArrayList<Card> deck;


  // constructor
  public QQKachoo() {

    deck = new ArrayList<Card>();

  }

  /** Implementation of the Deque Methods **/

  /* ~~~~~ "Add" Methods ~~~~~ */

  public boolean offerFirst(Card e) {

    deck.add(0,e);
    return true;

  }

  public boolean offerLast(Card e) {

    return deck.add(e);

  }

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

  /* ~~~~~ "Remove" Methods ~~~~~ */

  public Card pollFirst() {

    return deck.remove(0);

  }

  public Card pollLast() {

    return deck.remove(deck.size() - 1);

  }

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

  /* ~~~~~ "Get" Methods ~~~~~ */

  public Card peekFirst() {

    return deck.get(0);

  }

  public Card peekLast() {

    return deck.get(deck.size() - 1);

  }

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

  public String toString() {

    return deck.toString();

  }


  public static void main (String[] args) {

    Deque<String> test = new QQKachoo<String>();

    test.offerFirst("hey");
    test.offerLast("sup");
    test.offerFirst("bye");
    test.offerLast("no");
    test.offerFirst("thanks");
    test.offerLast("cool");

    System.out.println(test);

    System.out.println("First element: " + test.peekFirst()); // thanks
    System.out.println("Last element: " + test.peekLast()); // cool

    System.out.println("Removing " + test.pollFirst() + "..."); // thanks
    System.out.println("Removing " + test.pollLast() + "..."); // cool
    System.out.println(test);

  } // end main method

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
