package sample2;

import java.util.Scanner;

public class Grades {
    private double midTerm1;
    private double midTerm2;
    private double finalExam;
    private double extra;
    //public String student;

    public Grades(double midTerm1,double midTerm2, double finalExam, double extra){
        this.extra=extra;
        this.finalExam=finalExam;
        this.midTerm1=midTerm1;
        this.midTerm2=midTerm2;
    }
   
    }
    public double getMidterm1(){
            return midTerm1;     
    }
    public double getMidterm2(){
        return midTerm2;
    }
    public double getFinalExam(){
        return finalExam;
    }
    public double getExtra(){
        return extra;
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello YOUTHE RE");
        //double  m= new getMidterm1();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Midterm 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Midterm 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Final Exam: ");
        double fin = sc.nextDouble();

        System.out.print("Enter midterm 1");
        double ext = sc.nextDouble();

        Grades grades = new Grades(m1,m2,fin,ext);


        

        double finalGrade = (0.2*grades.getMidterm1())+(0.3*grades.getMidterm1())+(0.5*grades.getFinalExam())+grades.getExtra();
        System.out.println(finalGrade);

    
        //System.out.println(james.getMidterm1());
        
    }
}