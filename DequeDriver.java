/****** TEAM BOATY ******/
/*
Tim Marder, Dan Gelfand, Maxwell Vale
APCS2 pd02
lab#02 -- All Hands on Deque!
2018-04-20
*/

/*****   DequeDriver Creds to Team StillCold!   *****

/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeDriver{

  public static void main(String[] args) {

    QQKachoo<String> boats = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    boats.offerFirst("Yacht(y)");
    System.out.println("Added: " + boats.peekFirst()); //Yacht(y)
    boats.offerFirst("Cruise");
    System.out.println("Added: " + boats.peekFirst()); //Cruise
    boats.offerFirst("Sail");
    System.out.println("Added: " + boats.peekFirst()); //Sail
    boats.offerFirst("Row");
    System.out.println("Added: " + boats.peekFirst()); //Row

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Row Sail Cruise Yacht(y)

    System.out.println("");

    System.out.println("-----Adding to end------");
    boats.offerLast("Speed");
    System.out.println("Added: " + boats.peekLast()); //Speed
    boats.offerLast("Fishing");
    System.out.println("Added: " + boats.peekLast()); //Fishing
    boats.offerLast("Lil'");
    System.out.println("Added: " + boats.peekLast()); //Lil

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Row Sail Cruise Yacht(y) Speed Fishing Lil

    System.out.println("");

    System.out.println("-----Removing from front-----");
    boats.pollFirst(); //Row  dies
    System.out.println("New front: " + boats.peekFirst()); //Sail

    System.out.println("");

    System.out.println("-----Removing from end-----");
    boats.pollLast(); //Lil dies
    System.out.println("New end: " + boats.peekLast()); //Fishing

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(boats); //Sail Cruise Yacht(y) Speed Fishing

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    boats.pollFirst();
    System.out.println(boats);
    boats.pollLast();
    System.out.println(boats);
    boats.pollFirst();
    System.out.println(boats);
    boats.pollLast();
    System.out.println(boats);
    boats.pollFirst();
    System.out.println(boats);
    System.out.println("Empty now?: "+boats.isEmpty()); //true
  }

}
