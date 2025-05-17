package com.reportcard;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    
        ArrayList<StudentDetails> sdetails = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String Name;
        int RollNo;
        String SubName[];
        int Mark[];

        int subjects;
        System.out.print("Enter number of subjects:");
        subjects = scan.nextInt();
        scan.nextLine();
        SubName = new String[subjects];
        
        for(int j=0;j<subjects;j++){
        System.out.print("Enter Subject Name:");
        SubName[j] = scan.nextLine();

        }

        System.out.print("Enter no of Students:");
        int Loop = scan.nextInt();
        scan.nextLine();

        for(int i=0;i<Loop;i++){
            Mark = new int[subjects];
            System.out.print("Enter Student Name:");
            Name = scan.nextLine(); 
            
            System.out.print("Enter Student RollNo:");
            RollNo = scan.nextInt();
            scan.nextLine();

            for(int j=0;j<subjects;j++){
                
                System.out.print("Enter Mark of "+SubName[j]+" :");
                Mark[j] = scan.nextInt();
                scan.nextLine();

            }

            StudentDetails sd = new StudentDetails(Name, RollNo, SubName, Mark);
            sdetails.add(sd);
            sd.total();
        }
        sdetails.sort((a,b)->Integer.compare(b.total, a.total));
        
        for(int i=0;i<sdetails.size();i++){
            
            System.out.println("Name: " + sdetails.get(i).Name);
            System.out.println("RollNo " + sdetails.get(i).RollNo);
            System.out.println("Subjects: " + Arrays.toString(sdetails.get(i).SubName));
            System.out.println("Marks: " + Arrays.toString(sdetails.get(i).Mark));
            System.out.println("Total :"+sdetails.get(i).total);

        }

        scan.close();

    }

}
