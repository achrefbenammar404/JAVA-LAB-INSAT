package EX3.Classes;

public class CustomArrayList {

    //Attributes 
    protected int[] array ; 
    protected int numberOfElements =0   ; 

    //Constructor 
    public CustomArrayList(){
        array = new int [10];
        
    }
    public CustomArrayList(int size ){
        array = new int[size];  
    }

    //Methods 
    public void add (int num ){
        if (numberOfElements < array.length ){
            array[numberOfElements] = num ; 
        }
        else {
            int[] array2 = new int[numberOfElements+1]; 
            int i = 0 ; 
            for (int n : array ){
                array2[i] = n ; 
                i++;  
            }
            array2[i] = num ; 
            array = array2; 
            
        }
        numberOfElements++; 
        return ; 
    }

    public void add(int index , int number ){
        if (index >= 0 && index <= numberOfElements){
            if (numberOfElements < array.length){
                for (int i = numberOfElements ; i > index ; i -- ){
                    array[i] = array[i-1]; 
                }
                array[index] = number ; 
            }
            else {
                int[] array2 = new int[numberOfElements+1]; 
                for (int i = 0 ; i < index ; i ++ ){
                    array2[i] = array[i] ; 
                }
                array2[index] = number ; 
                for (int i = index ; i < numberOfElements ; i ++ ){
                    array2[index+1] = array[i]; 
                }
                
            }
            numberOfElements++; 
            }
        
    }

    public int get (int index){
        if (index < 0 || index >= numberOfElements ){
            System.out.println("Invalid Index "); 
            return -1 ; 
        }
        return array[index]; 
    }

    public void print(){
        for (int i = 0 ; i < numberOfElements ; i ++ ){
            System.out.print("|"+array[i]+"|"); 
        }
        System.out.println();
    }

    public int size (){
        return numberOfElements; 
    }

    public boolean isEmpty (){
        return numberOfElements==0 ; 
    }

    public boolean isIn(int number ){
        for (int i = 0 ; i < numberOfElements ; i ++ ){
            if (array[i] == number){
                return true ; 
            }
        }
        return false ; 
    }

    public int find (int x ){
        for (int i = 0 ; i < numberOfElements ; i ++ ){
            if (array[i] == x ){
                return i; 
            }
        }
        return -1 ; 
    }

    public void remove (int x){
        int index = this.find(x); 
        if (index != -1 ){
            for (int i = index ; i < numberOfElements ; i ++ ){
                array[i] = array[i+1]; 
            }
            
            numberOfElements--; 
        }
    }
    

}
