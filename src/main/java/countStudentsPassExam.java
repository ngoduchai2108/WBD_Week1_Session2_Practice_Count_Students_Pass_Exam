import java.util.Scanner;

public class countStudentsPassExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Number of students not exceed 30
        int size;
        do{
            System.out.println("Enter a size for list students");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("Size should NOT exceed 30!!!");
            }
        }while (size > 30);
        //Enter point of student in list
        int count = 0;
        double [] pointStudent = new double[size];
        for (int i=0; i<size;i++){
            do {
                System.out.println("Enter Point of Student "+ (i+1)+" is: ");
                pointStudent[i] = scanner.nextDouble();
                if (pointStudent[i] > 10 || pointStudent[i]< 0){
                    System.out.println("Point should NOT exceed 10 and bigger 0!!!");
                }
            }while (pointStudent[i] > 10 || pointStudent[i]< 0);
            if (pointStudent[i] >= 5){
                count++;
            }
        }
        //Show list
        System.out.println("The Point of Student List is: ");
        for (int i=0; i<size; i++){
            System.out.println("Student "+(i+1)+" has point is: "+pointStudent[i]);
        }
        //Number of Students pass exam
        System.out.println("The List has "+ count+" student pass Exam.");

    }
}
