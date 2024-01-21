import java.util.Scanner;

class GradeCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Subject:");
        int Subject= sc.nextInt();
        System.out.println("Enter the marks of each paper:");
        int Maxmarks=sc.nextInt();
        int tmarks=0;

        for (int i=0;i<Subject; i++){

            System.out.println("Marks of Each Subject:");
            int marks=sc.nextInt();
            tmarks=tmarks+marks;
        }
        int tmax=Subject*Maxmarks;
        int per=100*tmarks/tmax;
        System.out.println("Percentage :"+per+"%");
        int Avg=tmarks/Subject;
        System.out.println("Average marks :"+Avg);
        String grade=calculateGrade(Avg);
        System.out.println("Grade:"+grade);
    }
    static String calculateGrade(int average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
