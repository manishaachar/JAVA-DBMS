package Java.ASS5;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class user
{
    String name;
    user(String name)
    {
        this.name=name;
    }
class Account{
    //String name;
    double balance;
   int accountno;
   Account(int accno,double bal)
   {
    //this.name=name;
    this.balance=bal;
    this.accountno=accno;
   }
}

Account[] a= new Account[2];
   void deposit(double amount, int accountno)
   {
    int found=0,k=-1;
    for(int i=0;i<2;i++) 
    if(a[i].accountno==accountno)
    {
        a[i].balance+=amount;
        found=1;
        k=1;
        break;
    }
    if(found==1)
    {
        System.out.println("Balance Updated");
        display(a[k].accountno);
    }
    else
    System.out.println("Account no does not exist");
    }



//     this.bal+=amount;
//     System.out.println("The Balance details");
//     System.out.println(name+"\t"+accountno+"\t"+balance);
//    }
   
   void withdrawal(double amount,int accountno)
   {
    int k=-1;
    int found=0;
    for(a[i].accountno==accountno)
    {
        k=i;
        found=1;
        break;
    }
    if(found==1)
    {
        if((a[k].balance<500)||(a[k].balance<amount))
        throw new LessBalanceExeception(amount);
        else 
        {
            a[k].balance=amount;

        }
    }
    }

void create_account()
{
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
        System.out.println("Enter account number:");
        int accountno=sc.nextInt();
        System.out.println("Enter balance");
        double balance=sc.nextDouble();
        a[i]=new Account(accno, bal);
    }
}

void display(int accountno)
{
    int k=-1,found=0;
    for(int i=0;i<2;i++)
    if(a[i].accountno==accountno)
    {
        k=i;
        found=1;
        break;
    }
    if(found==1)
    {
        System.out.println("--------------------------Account Details------------------------------");
        System.out.println(name+"\t"+a[k].accountno+"\t"+a[k].balance);
        System.out.println("-----------------------------------------------------------------------");
    }
    }
}




public class account_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CREATE ACCOUNT WITH MINIMUM BALANCE 500");
        System.out.println("Enter owner name");
        String name=sc.next();
        //System.out.println("Enter the accountno"); 
        user u=new user(name);
        u.create_account();
        System.out.println("Account created successfully");
        boolean opt=true;
        while(opt)
        {
            System.out.println("==============================================================");
            System.out.println("1.Balance\n 2.Deposit 3.withdrawl");
            System.out.println("==============================================================");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Your account details");
                System.out.println("Enter account number");
                accountno=sc.nextInt();
                u.display(accountno);
                break;

                case 2:System.out.println("Enter Account no");
                accountno=sc.nextInt();
                System.out.println("Amount to deposit");
                double amt=sc.nextInt();
                u.deposit(amt,accountno);
                break;

                case 3:try
                System.out.println("enter account no");
                accountno=sc.nextInt();
                System.out.println("Amount to withdraw");
                double amt=sc.nextInt();
                u.withdrawal(amount,accountno);
            }
            catch(LessBalanceExeception e){}
            break;
        }
    }
        }
    


