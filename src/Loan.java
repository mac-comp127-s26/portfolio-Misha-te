public class Loan {
    private double principal; // instance variables
    private double rate;
    private double time;
    public Loan(double principal,double rate,double time){ //the constructor 
        this.principal =principal;
        this.time= time;
        this.rate = rate;
        
    }
    public double getPrincipal (){ //the getters
        return principal;
    }
    public double getTime(){
        return time;
    }
    public double getRate (){
        return rate;
    }
    public static void main (String[]args){ // our main method
        Loan misha = new Loan(20000, 0.2, 2);
        Loan james = new Loan(10_0000, 0.18, 10);
        //formula for loan interest is;
        //p(1+r)^t=A
        //Amount-p=interest
        double bracketPart;
        bracketPart = (1+misha.getRate());
        double amount1 =Math.pow(bracketPart,misha.getTime());
        double amount = amount1*misha.getPrincipal();
        System.out.println("The amount payable is "+ amount);
        double interest;
        interest = amount-misha.getPrincipal();
        System.out.println("The interest payable is "+ interest);

        double bracketPart1;
        bracketPart = (1+james.getRate());
        double amount0 =Math.pow(bracketPart,james.getTime());
        double amount12 = amount0*james.getPrincipal();
        System.out.println("The amount payable is "+ amount12);
        double interest1;
        interest1 = amount12-james.getPrincipal();
        System.out.println("The interest payable is "+ interest1);
    }
}
