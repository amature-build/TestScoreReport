public class Main {
    public static void main(String[] args) {
        getHeader();

        StudentGradeData sg = new StudentGradeData();
        for (StudentGrade student : sg.getAllStudentGrades()) {
            String name = student.getFullName();
            int score = student.getScore();
            String grade = student.getGrade();
            String row = generateRow(name, score, grade);
            System.out.println(row);
        }

        System.out.println();
        displayHighestGrade(sg);
        System.out.println();
        displayStudentsHighestGrade(sg);
    }

    public static void getHeader(){
        String msg = "Student Name                 Score Grade";
        System.out.println(msg);
    }
    public static String generateRow(String name, int score, String grade){
        StringBuilder output = new StringBuilder();
        int length = 40;
        int nameStart = 0;
        int nameUnto = nameStart + name.length();
        int scoreStart = 32;
        int scoreUnto = scoreStart + String.valueOf(score).length();
        int gradeStart = 39;
        int gradeUnto = gradeStart + 1;

        for (int i = 0; i < length; i++) {
            if (i == nameStart){
                output.append(name);
            } else if (i > nameUnto && i < scoreStart) {
                output.append(" ");
            } else if (i == scoreStart) {
                output.append(score);
            } else if (i > scoreUnto && i < gradeStart){
                output.append(" ");
            } else if (i == gradeStart) {
                output.append(grade);
            } else if (i > gradeUnto) {
                output.append(" ");
            }
        }

        return output.toString();
    }
    public static void displayHighestGrade(StudentGradeData studentGradeData){
        int highGrade = studentGradeData.getHighestGrade();
        String msg = "Highest Test Score: ";
        System.out.println(msg + highGrade);
    }
    public static void displayStudentsHighestGrade(StudentGradeData studentGradeData){
        int highGrade = studentGradeData.getHighestGrade();
        String msg = "Student(s) having the highest test score:";
        System.out.println(msg);
        for (StudentGrade student: studentGradeData.getAllStudentGrades()) {
            if (student.getScore() == highGrade){
                System.out.println(student.getFullName());
            }
        }
    }
}