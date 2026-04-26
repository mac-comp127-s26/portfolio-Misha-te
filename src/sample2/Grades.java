package sample2;

import java.util.Scanner;

public class Grades {
    private double midTerm1;
    private double midTerm2;
    private double finalExam;
    private double extra;
    public String student;

    public Grades(double midTerm1,double midTerm2, double finalExam, double extra){
        this.extra=extra;
        this.finalExam=finalExam;
        this.midTerm1=midTerm1;
        this.midTerm1=midTerm1;
    }
    public double getMidterm1(){
        while (true){
            Scanner scanner1 =new Scanner(System.in);
            System.out.println("Please enter your midterm 1 score: ");
            double midterm1 = scanner1.nextDouble();
            if (midterm1 >=0 && midterm1>=100){
                break;
            }else{
                System.out.println("Enter a value between 0 and 100 :");
            }
         }
        return midTerm1;     
    }
    public double getMidterm2(){
        Scanner scanner2 =new Scanner(System.in);
        System.out.println("Please enter your midterm 2 score: ");
        double midterm2 = scanner2.nextDouble();
        return midterm2;
    }
    public double getFinalExam(){
        Scanner scanner3 =new Scanner(System.in);
        System.out.println("Please enter your final score: ");
        double finalExam = scanner3.nextDouble();
        return finalExam;
    }
    public double getExtra(){
        Scanner scanner4 =new Scanner(System.in);
        System.out.println("Enter Extra Credit: ");
        double extra = scanner4.nextDouble();
        return extra;
    
    }
    
    }
    public static void main(String[] args) {
        System.out.println("HelloYOUTHERE");
        //double  m= new getMidterm1();
        
        //System.out.println(james.getMidterm1());
        
    }
}