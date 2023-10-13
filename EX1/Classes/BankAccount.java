package EX1.Classes;
import java.util.ArrayList;
public class BankAccount {
    protected int accountNumber ; 
    protected String accountHolderName ; 
    protected int balance ; 
    static protected ArrayList<Integer> accounts = new ArrayList<>(); 

    public BankAccount(){}
    public BankAccount(int accountNumber , String accountHolderName , int balance){
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accounts.size() ; 
        this.balance = balance; 
        accounts.add(accountNumber); 
    
    }

    public int GetAccountNumber (){
        return this.accountNumber ;  
    }
    public String GetAccountHolder(){
        return this.accountHolderName;  
    }
    public int GetBalance(){
        return this.balance; 
    }

    public void deposit (int amount){
        if (amount <= 0 ){
            System.out.println("Amount invalid");
        }
        else {
            this.balance+=amount;
        }
        
    }

    public void withdraw (int amount){
        if ( amount > this.balance || amount <= 0 ){
            System.out.println("Balance is not sufficient !! "); 
        }
        else {
            this.balance-=amount ; 
            System.out.println("Withdrawl success !"); 
        }
    }

    public void print(){
        System.out.println("==================================");
        System.out.println("Account number : " + this.GetAccountNumber()); 
        System.out.println("Account holder name : " + this.GetAccountHolder());
        System.out.println("Account balance : " + this.GetBalance());
    }
}
