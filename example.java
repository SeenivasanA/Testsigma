package com;
public class example {
public interface bankinter {
    public void acc_det();
    public void interest();
}
static class hdfc implements bankinter {
    //public static void main(String arg[]){
    int bal,lo,interest;

    hdfc(int bal,int lo){
        this.bal=bal;
        this.lo=lo;
    }

    public void acc_det(){
        System.out.println("This is details about your HDFC account");
        System.out.println("BALANCE: "+ bal);
        System.out.println("LOAN : "+ lo);}

    public void interest() {
        System.out.println("interest is: " + interest);
    }
}


static class sbi implements bankinter {
    //public static void main(String arg[]){
    int bal,lo,interest;

    sbi(int bal,int lo){
        this.bal=bal;
        this.lo=lo;
    }
    public void acc_det(){
        System.out.println("This is details about your SBI account");
        System.out.println("BALANCE: "+ bal);
        System.out.println("LOAN : "+ lo);
    }

    @Override
    public void interest() {
        System.out.println("interest is: " + interest);
    }

}
public static void main(String args[]){
    bankinter sbi1=new sbi(2000,0);
    bankinter hdfc1=new hdfc(40000,1000);

    sbi1.acc_det();
    hdfc1.acc_det();

    sbi1.interest();
    hdfc1.interest();

}
}
