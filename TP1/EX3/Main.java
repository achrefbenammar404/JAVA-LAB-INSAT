package EX3;
import EX3.Classes.CustomArrayList;
public class Main {
    public static void main(String [] args){
        CustomArrayList myArray  = new CustomArrayList(); 
        for (int i = 0 ; i < 5 ; i ++ ){
            myArray.add(i+1);
        }
        myArray.print();
        myArray.add(0, 0); 
        myArray.print();
        myArray.add(-1, 500); 
        myArray.print();
        myArray.add(3, 3); 
        myArray.print();
        myArray.remove(0);
        myArray.print();
        myArray.remove(1);
        myArray.print();
        myArray.remove(2);
        myArray.print();
        myArray.remove(3);
        myArray.print();
        System.out.println(myArray.find(4));
        System.out.println(myArray.isIn(0));

    }
}
