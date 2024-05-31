package lesson5IntermJ_DtStrct;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class HomeWork5_3 {
//    Assignment 3:
//    The program should receive an ArrayList of Strings and print all the words with no duplicates.
//    for example:
//    input
//    [Steve, Tim, Lucy, Steve, Pat, Angela, Tom, Tim, Anna, Lucy]
//     output:
//    [Steve, Tim, Lucy, Pat, Angela, Tom, Anna]
//    tips:
//    1.  What if you will sort the array before removing the duplicates?
//    2. What if you use some different collections?

    public void strNames() {

        //String[] stringNames = {"Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom", "Tim", "Anna", "Lucy"};


       // ArrayList<String> arrList = new ArrayList<String>(new LinkedHashSet(collectionWithDuplicates));

        List<Object> myList = List.of("Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom", "Tim", "Anna", "Lucy");
        HashSet<Object> duplicates = new HashSet<Object>();

        for (int x = 0; x < myList.size(); x++) {
            for (int y = x + 1; y < myList.size(); y++) {
                if (x == y) break;
                if (!myList.get(x).equals(myList.get(y))) {
                    duplicates.add(myList.get(x));
                    break;
                }
            }
        }
        System.out.println(duplicates);

}
}
