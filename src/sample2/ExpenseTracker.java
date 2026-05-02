package sample2;

public class ExpenseTracker {
    private String expense;
    private double amount;
    private String description;
    private char category;
    private String date;
    private double expenditure;

    public ExpenseTracker(String expense, double amount,String description, char category,String date, double expenditure){
        this.expense= expense;
        this.amount = amount;
        this.description= description;
        this.date= date;
        this.category =category;
        this.expenditure = expenditure;

    }
    public String getExpense(){
        return expense;
    }
    public double getAmount(){
        return amount;
    }
    public String getDescription(){
        return description;
    }
    public String getDate(){
        return date;
    }
    public char  getCategory(){
        //L- Luxury
        //B-Basic if in ??
        //Utilities- 
        return category;
    }
    public double getExpenditure(){
        return expenditure;
    }
    @Override
    public String toString(){
        return "Expense(date=" + date + ", description=" + description + ", amount=" + amount + ", category=" + category + ")";
    }
    }

