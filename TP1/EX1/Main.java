package EX1; 
import EX1.Classes.*;
class Main {
    public static void main (String [] args){
        
        BankAccount account1 = new BankAccount(0 , "X"  ,1000);
        BankAccount account2 = new BankAccount(0, "Y", 0); 
        account1.print();
        account2.print();
        account1.withdraw(342);
        account2.deposit(1222);
        account1.print();
        account2.print();
    }
}