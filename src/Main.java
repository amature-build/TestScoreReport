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
            } else if (i > gradeUnto && i < length) {
                output.append(" ");
            }
        }

        return output.toString();
    }
}