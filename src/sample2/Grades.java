package sample2;

import java.util.Scanner;

public class Grades {
    private double midTerm1;
    private double midTerm2;
    private double finalExam;
    private double extra;

    public Grades(double midTerm1,double midTerm2, double finalExam, double extra){
        this.extra=extra;
        this.finalExam=finalExam;
        this.midTerm1=midTerm1;
        this.midTerm2=midTerm2;
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
       // System.out.println("Hello YOUTHE RE");
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();

        
        System.out.print("Midterm 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Midterm 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Final Exam: ");
        double fin = sc.nextDouble();

        System.out.print("Extra : ");
        double ext = sc.nextDouble();

        
        Grades grades = new Grades(m1,m2,fin,ext);
        sc.close();

        double finalGrade = (0.15*grades.getMidterm1())+(0.2*grades.getMidterm2())+(0.65*grades.getFinalExam())+grades.getExtra();
        System.out.println("Your score is: "+finalGrade);

        String letterGrade;
        if(finalGrade>90 && finalGrade<=100){
            letterGrade= "A";
            System.out.println("Great Work "+ name);
        }else if(finalGrade>80 && finalGrade<90){
            letterGrade = "B";
            System.out.println("Keep it up "+name);
        }else if(finalGrade>70 && finalGrade<80){
            letterGrade = "C";
            System.out.println("Above Average "+name);
        }else if(finalGrade>60 && finalGrade<70){
            letterGrade = "D";
            System.out.println("Not a great score "+name);
        }else if(finalGrade>50 && finalGrade<60){
            letterGrade = "F";
            System.out.println("Failed "+name);
        }else{
            letterGrade = "NC";
            System.out.println("No credit "+name);
        }
        System.out.println("Your final letter grade is: "+letterGrade);
    }
}