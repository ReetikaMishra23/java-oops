import java.util.*;
public class StudentMarks {

    public static void addMarks(List<Integer> marks, int mark) {
        // Write your code
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        // Write your code
        int sum=0;
        for(int i=0;i<marks.size();i++){
            sum=sum+marks.get(i);
        }
        return (double)sum/marks.size();
    }

    public static int findHighest(List<Integer> marks) {
       int max=marks.get(0);
       for(int i=0;i<marks.size();i++){
         if(marks.get(i)>max){
            max=marks.get(i);
         }
       }
        return max;
    }

    public static void displayMarks(List<Integer> marks) {
        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}