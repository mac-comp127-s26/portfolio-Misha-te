public class Loan {
    private double principal;
    private double rate;
    private double time;
    public Loan(double principal,double rate,double time){
        this.principal =principal;
        this.time= time;
        this.rate = rate;
    }
    public double getPrincipal (){
        return principal;
    }
    public double getTime(){
        return time;
    }
    public double getRate (){
        return rate;
    }
    public  void main (String[]args){
        Loan misha = new Loan(20000, 0.2, 2);
        //formula for loan interest is;
        //p(1+r)^t=A
        //Amount-p=interest
        double bracketPart;
        bracketPart = principal*(1+rate);
        double amount =Math.pow(bracketPart,time);
        System.out.println(amount);

    }
}
