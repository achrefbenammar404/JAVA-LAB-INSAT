package SingleNumber;

public class Solution {
    static public int SingleNumber (int [] array ){
        int result = 0  ; 
        for (int n : array ){
            result^=n;
        }
        return result ; 
    }

    public static void main(String [] args ){
        int[] array = {1 , 1 , 2 , 3 , 3 , 2 , 34 }; 
        System.out.println(SingleNumber(array));
    }
}
