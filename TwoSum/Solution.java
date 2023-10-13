package TwoSum;


import java.util.HashMap;

public class Solution {
    public static void main(String args[]){
        Integer [] array = {1 , 2 , 3 , 4}; 
        Integer target = 7 ;
        
        Integer[] result = TwoSum(array , target ); 
        for (Integer n : result ){
            System.out.print(n + "|");
        }
    }

    public static Integer[] TwoSum(Integer [] array , Integer target ){
        HashMap <Integer , Integer> map = new HashMap<>();
        Integer[] result = new Integer[2]; 
        //map -> set of element , index pair 
        for (int i =  0 ; i < array.length ; i ++ ){
            if ( map.containsKey(target - array[i]) ){
                result[0] = i ; 
                result[1] = map.get(target - array[i]);  
                return result;  
            }
            else {
                map.put(array[i], i) ;  
            }

        }



        return null ; 
    }
}
