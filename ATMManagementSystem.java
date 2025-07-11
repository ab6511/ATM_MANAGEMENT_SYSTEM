import java.util.Scanner;

class ATM1{

    int Pin=1234;
    float Balance;

    public void checkpoint(){
        System.out.println("Enter the pin");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(Pin==enteredpin){
            menu();
        }
        else
        {
            System.out.println("Enter the valid pin");
        }
    }

    public void menu()
    {
        System.out.println("Enter your choice ");
        System.out.println("1. Check your balance ");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money ");
        System.out.println("4.EXIT");
        Scanner sc = new Scanner(System.in);
        int option=sc.nextInt();
        if( option ==1 )
        {
            checkbalance();
        }
        else if (option==2){
            withdrawmoney();

        }else if(option==3){
            depositemoney();
        }else if (option==4){
            Exit3();
        }
        else {
            System.out.println("please enter valid choice");
        }
    }



    public void checkbalance(){
        System.out.println("Balance "+Balance);
        menu();
    }

    public void withdrawmoney(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        float Amount=sc.nextFloat();
        if(Amount>Balance){
            System.out.println("Insufficient Balance");
        } else {
            Balance=Balance-Amount;
            System.out.println("Withdraw Successfully");
        }
        menu();
    }
    public void depositemoney(){
        System.out.println("Enter your Amount");
        Scanner sc = new Scanner(System.in);
        float Amount=sc.nextFloat();
        Balance = Balance+Amount;
        System.out.println("Money deposit Successfully");
        menu();
    }
    public void Exit3()
    {

            checkpoint();
        }

    }

    public class ATM{
        public static void main(String[] args) {
            ATM1 obj = new ATM1();
            obj.checkpoint();
}
    }
