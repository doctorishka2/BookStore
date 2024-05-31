package lesson5IntermJ_DtStrct;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SelfTraining5_4 {

//    Task 1. Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//    has22([1, 2, 2]) → true
//    has22([1, 2, 1, 2]) → false
//    has22([2, 1, 2]) → false

    public void has22 (int[] nums) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 2 && i > 0 && nums[i-1] == 2) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }


    // Task 2. Given an array of ints, return true if the array contains no 1's and no 3's.
//      lucky13([0, 2, 4]) → true
//    lucky13([1, 2, 3]) → false
//    lucky13([1, 2, 4]) → false

    public void hasNot13 (int[] numbers) {
        boolean not13 = true;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                not13 = false;
                break;
            }
        }
        System.out.println(not13);
    }

//    Task 3. Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
//    maxTriple([1, 2, 3]) → 3
//    maxTriple([1, 5, 3]) → 5
//    maxTriple([5, 2, 3]) → 5
    public int biggestNum (int[] bigN) {
        int result = 0;
        int a = bigN[0];
        int b = bigN[(((bigN.length + 1) / 2) - 1)];
        int c = bigN[bigN.length - 1];

         if (a > b && a > c) {
             System.out.println(a);
             //result = a;
         }
         if (b > a && b > c) {
             System.out.println(b);
             //result = b;
         }
        if (c > a && c > b)
            System.out.println(c);
        //result = c;
        return result;
    }

//    Task 4. Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//    arrayFront9([1, 2, 9, 3, 4]) → true
//    arrayFront9([1, 2, 3, 4, 9]) → false
//    arrayFront9([1, 2, 3, 4, 5]) → false
//   public boolean arrayFront9 (int[] nums) {
//        int len = nums.length;
//       //boolean arF9 = false;
//        //boolean arF10 = true;
//        if (len <= 4) {
//            for (int i = 0; i < len; i++) {
//                if (nums[i] == 9)
//                    return true;
//                else;
//            }
//        } else {
//            for (int j = 0; j < 4; j++) {
//                if (nums[j] == 9)
//                    return true;
//                else;
//            } System.out.println("");
//        }
//        return false;
//   }
    public boolean arrayFront9(int[] nums) {
boolean found = false;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 9) {
                found = true;}
        }
        System.out.println(found);
                return false;
    }

//    Task 5. Given a list of integers, return a list where each integer is multiplied with itself.
//    square([1, 2, 3]) → [1, 4, 9]
//    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]

    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();

        //for (int num : nums) {
        for (int num = 0; num < nums.toArray().length; num++) {
            result.add(num);
        }
        return result;



}
}