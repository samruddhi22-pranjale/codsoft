import java.util.Scanner;
class Main{
 public static void main(String args[])
    {
     Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the no of subject");
 int numsub=scanner.nextInt();
        int tmarks=0;
        for(int i=1;i<=numsub;i++)
        {
            System.out.println("enter the marks of each subject" + i + ":");
            int marks=sc.nextInt();
            tmarks +=marks;
        }
    double avgpercentage=(double)tmarks/numsub;
    char grade;
    if(avgpercentage>=90){
    grade='A';
    }
   else if(avgpercentage>=80){
   grade='B';
   }
   else if(avgpercentage>=70){
   grade='C';
   }
   else if(avgpercentage>=60){
   grade='D';
   }
   else
{
   grade='E';
    }
    System.out.println("total marks"+ tmarks);
    System.out.println("average percentge"+ avgpercentage);
    System.out.println("grade"+ grade);
}
}

