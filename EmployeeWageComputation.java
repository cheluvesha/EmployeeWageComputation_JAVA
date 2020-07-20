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



