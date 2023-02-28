import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeData implements StudentGradeDao {
    private List<StudentGrade> students;
    public StudentGradeData() {
        String filename = "Data.txt";
        File file = new File(filename);

        try {
            Scanner scan = new Scanner(file);
            students = new ArrayList<StudentGrade>();
            int counter = 0;
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String[] lineSplit = line.split(" ");
                counter++;
                StudentGrade student = new StudentGrade(counter);
                student.setFirstName(lineSplit[0]);
                student.setLastName(lineSplit[1]);
                int score = Integer.parseInt(lineSplit[2]);
                student.setScore(score);
                this.students.add(student);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<StudentGrade> getAllStudentGrades() {
        return this.students;
    }

    @Override
    public StudentGrade getStudentGrade(int rollID) {
        return this.students.get(rollID);
    }

    @Override
    public int getHighestGrade() {
        int highGrade = 0;
        for (StudentGrade s : this.students) {
            if (s.getScore() > highGrade){
                highGrade = s.getScore();
            }
        }
        return highGrade;
    }
}
