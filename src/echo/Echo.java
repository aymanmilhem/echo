/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echo;

import java.util.*;

/**
 *
 * @author omega
 */
public class Echo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //        ArrayList memory = new ArrayList();
        //        The ArrayList memory that we've created will actually store any type of single entity we
        //place within it. This might sound really, really great at first, but honestly, it's not a good
        //thing to have in our program. It's really easy to get confused if we have ArrayLists, or any
        //data structure, really, that's storing just about anything, and if we feel the need to do this,
        //we're either doing something really complicated, or more likely we're not writing our code
        //as cleanly as we should. More importantly, once we store anything in our ArrayList, it's
        //possible for us to sneak by our compiler and create code that compiles OK. However, the
        //other possibility is that it would break at runtime, causing the kind of bugs that are really
        //bad to have in commercial software because they can break when people are actually using
        //it.
        //To solve this problem, we can tell our ArrayList to only accept information of a certain type.
        //We do this by following our ArrayList declaration and instantiation with double character
        //brackets and placing a type within them:
        ArrayList<String> memory = new ArrayList<String>();
        //We've declared and then caused to come into being an ArrayList data structure that will
        //only allow strings to be stored within it.
        while (true) {
            /*
            Each time our loop runs, we're going to want to use the              nextLine() function on our
            Scanner variable, that is, reader, to grab a new line of             input from the user that we're going
            to store in our ArrayList.
             */
            memory.add(reader.nextLine());
            if ((memory.get(memory.size() - 1)).equals("CLEAR")) {
                memory.clear();
            } else {
                if ((memory.get(memory.size() - 1)).equals("END")) {
                    break;
                }
            }
            System.out.println(memory.toString());
        }
    }

}
