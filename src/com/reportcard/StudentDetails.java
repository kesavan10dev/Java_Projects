package com.reportcard;

public class StudentDetails {

    public String Name;
    public int RollNo;
    public String SubName[];
    public int Mark[];
    public int total;

    public StudentDetails(String Name,int RollNo,String SubName[],int Mark[]){
        this.Name = Name;
        this.RollNo = RollNo;
        this.SubName = SubName;
        this.Mark = Mark;
    }

    public void total(){
        for(int i=0;i<Mark.length;i++){
            total += Mark[i];
        }
    }

}
