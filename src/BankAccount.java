public class BankAccount {

    int balance;
    int x= 0;
    int min = 0;
    int max = 0;

    BankAccount( int initialBalance )
    {
        this.balance = initialBalance;
        x+=1;
        getMin();
        getMax();


    }

    public int getBalance()
    {
        return balance;
    }

    public void updateBalance( int newBalance )
    {
        this.balance = newBalance;
        x+=1;
        getMin();
        getMax();
    }

    public int getMin()
    {

        if(this.x == 1){min = this.balance; return min;}else{
            if(this.balance < min){min = this.balance; return min;}
        }
        return min;
    }

    public int getMax()
    {

        if(this.x == 1){max = this.balance; return max;}else{
            if(this.balance > max){max = this.balance; return max;}
        }
        return max;
    }

}