#UC-1
import java.lang.*;
class Attendance{
        public static void main(String args[]){
                int present=1;
                int check=(int)(Math.floor(Math.random()*10)%2);
                if(present==check)
                System.out.println("Present");
                else
                System.out.println("Not Present");
}
}

#UC-2
class DailyEmpWage{
        public static void main(String args[]){
                int present=1;
                int check=(int)(Math.floor(Math.random()*10)%2);
                int salary=0;
                int empRatePerHour=20;
                int empHours=8;
                if(present==check){
                        salary=empRatePerHour*empHours;
                        System.out.println(salary);
                }
                else{
                        System.out.println(salary);
                }
}
}

#UC-3
class PartTimeWage{
        public static void main(String args[]){
                int partTime=0;
                int check=(int)(Math.floor(Math.random()*10)%2);
                int salary=0;
                int empRatePerHour=20;
                int empHours;
                if(partTime==check){
                        empHours=4;
                 }
                else{
                        empHours=8;
                }
                salary=empRatePerHour*empHours;
                 System.out.println(salary);
}
}

#UC-4
class SwitchCaseWage{
        public static void main(String args[]){
                int check=(int)(Math.floor(Math.random()*10)%2);
                int salary=0;
                int empRatePerHour=20;
                int empHours;
                switch(check){
                case 0 :
                        empHours=4;
                        break;
                case 1 :
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                salary=empRatePerHour*empHours;
                 System.out.println(salary);
}
}

#UC-5
class WageForMonth{
        public static void main(String args[]){
                int salary=0;
                int empRatePerHour=20;
                int empHours;
                int numberOfWorkingDays=20;
                int totalSalary=0;
                for(int day=1;day<=numberOfWorkingDays;day++){
                int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case 0 :
                        empHours=4;
                        break;
                case 1 :
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                salary=empRatePerHour*empHours;
                totalSalary=+salary;
                 }
                System.out.println("Total wage for 20 days: "+totalSalary);
}
}

#UC-6
class WagesTillCondition{
        int hours;
        int days;
        int salary;
        int empRatePerHour=20;
        int empHours;
        int totalSalary;
private int calculateSalary(int h,int d){
         while(hours<=h && days<=d){
              int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case 0 :
                        empHours=4;
                        break;
                case 1 :
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days+=1;
                salary=empRatePerHour*empHours;
                totalSalary=totalSalary+salary;
  }
                return totalSalary;
}
public static void main(String args[]){
                int totalHours=100;
                int totalDays=20;
                WagesTillCondition con=new WagesTillCondition();
                int wage=con.calculateSalary(totalHours,totalDays);
                System.out.println(wage);
}
}



