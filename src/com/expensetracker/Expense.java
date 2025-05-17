package com.expensetracker;

public class Expense {
    
    public String Name;
    public float Amount;
    public int Date;
    public int Month;

    public Expense(String Name,float Amount,int Date,int Month){
        this.Name = Name;
        this.Amount = Amount;
        this.Date = Date;
        this.Month = Month;
    }

}
