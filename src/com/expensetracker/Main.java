package com.expensetracker;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Expense> data = new ArrayList<>();
        String Name;
        float Amount;
        int Date;
        int Month;
        int Loop;

        System.out.print("Enter how many pdts u byed this month:");
        Loop = scan.nextInt();

        for(int i=0;i<Loop;i++){

            System.out.print("Enter The Amount u have spend:");
            Amount = scan.nextFloat();

            System.out.print("Enter the u date spend this amount:");
            Date = scan.nextInt();

            System.out.print("Enter the month u spend this amount:");
            Month = scan.nextInt();
            scan.nextLine();
                                    
            System.out.print("Enter The Pdt Name:");
            Name = scan.nextLine();

            Expense e1 = new Expense(Name,Amount,Date,Month);
            data.add(e1);

            data.sort((p1,p2)->Float.compare(p2.Amount,p1.Amount));

        }

        for(int i=0;i<data.size();i++){

            System.out.println(data.get(i).Name+" "+data.get(i).Amount+" "+data.get(i).Date+" "+data.get(i).Month);
                            
        }
        scan.close();

    }

}
