class bankaccount{
    private int accountnumber;
    private String holdername;
    private double balnce;
    
    void set accountnumber(int accountnumber){
        this.accountnumber=accountnumber;
    }
    void set holdername(String holdername){
        this.holdername=holdername;
    }
    void set balance(double balance){
        if balance >= 0 {
            this.balnce=balance;
        }else{
            System.out.println("invalid balance");
        }
    }
    public class bank{
        public static void main(String [] args){
            bankaccount b1=new bankaccount();
            b1.set accountnumber(12345);
            System.out.println(b1.get accountnumber());
        }
    }
    int get accountnumber(){
    return accountnumber;
    }
    String get holdername(){
        return holdername;
    }
    double get balance(){
        return balnce;
    }
    bankaccount b1=new bankaccount();
    b1.set accountnumber(12345);
    System.out.println(b1.get accountnumber());
    b1.accountnumber=12345;
    
}
