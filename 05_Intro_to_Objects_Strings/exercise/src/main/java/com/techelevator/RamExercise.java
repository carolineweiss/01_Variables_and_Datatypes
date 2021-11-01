package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;


public class Exercises {
    /*
	 Note, for-each is preferred, and should be used when possible.
	 */

    /*
     Given an array of Strings, return an ArrayList containing the same Strings in the same order
     array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
     array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
     array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
     */

    public List<String> array2List(String[] stringArray) {
        // Write your own code and not use any methods from the ArrayList class
        List<String> result = new ArrayList<>(Arrays.asList(stringArray));
        return result;
        List<String> array2List = new ArrayList<String>();



        return



        return

    /*
     Given a list of Strings, return an array containing the same Strings in the same order
     list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
     list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
     list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
     */
    public String[] list2Array(List<String> stringList) {
        // Write your own code and not use any methods from the ArrayList class
        return stringList.toArray(new String[0]);
    }

    /*
     Given an array of Strings, return an ArrayList containing the same Strings in the same order
     except for any words that contain exactly "num" characters as specified.
     dropNumLetters( {"Train", "Boat", "Car"}, 3 )  ->  ["Train", "Boat"]
     dropNumLetters( {"Red", "White", "Blue"},5 )  ->  ["Red", "Blue"]
     dropNumLetters( {"Jack", "Jill", "Jane", "John", "Jim"},4 )  ->  ["Jim"]
     */
    public List<String> dropNumLetters(String[] stringArray, int num) {

        return null;
    }


    /*
     Given a List of Integers, return the largest value.
     findSmallest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 1
     findSmallest( [987, 1234, 9381, 731, 43718, 8932] ) -> 731
     findSmallest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 234
     */
    public Integer findSmallest(List<Integer> integerList) {
        //Write your own algorithm to find the minimum and do not use any methods of ArrayList

        return 0;

    }

    /*
     Given an array of Integers, return a List of Integers containing just the odd values.
     oddOnly( {112, 201, 774, 92, 9, 83, 41872},3 ) -> [201, 774, 9, 83]
     oddOnly( {1143, 555, 7, 1772, 9953, 643},2 ) -> [1772]
     oddOnly( {734, 233, 782, 811, 3, 9999},3 ) -> [3, 9999]
     */
    public List<Integer> onlyDivisibleBy (Integer[] integerArray, int num) {
        return null;
    }

    /*
     Given two lists of Integers, return a list of integers such that the list contains
     the odd element from the first list and the even element from the second list.
     Continue until reaching the end of the list for either one of them.
     Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
     list to the new list before returning it.
     mixElements( [1, 2, 3], [4, 5, 6, 7] )  ->  [1, 5, 3, 7]
     mixElements( [1,4,8,2,5], [2,4,3]) -> [1,4,8]
     */
    public static List<Integer> mixElements(List<Integer> listOddNum, List<Integer> listEvenNum) {

        return null;
    }

    public static void main (String[] args){

        List<Integer> listOddNum = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4}));
        List<Integer> listEvenNum = new ArrayList<>(Arrays.asList(new Integer[]{4,5,6,8}));
        System.out.println(Exercises.mixElements(listOddNum, listEvenNum).toString());

    }

}
