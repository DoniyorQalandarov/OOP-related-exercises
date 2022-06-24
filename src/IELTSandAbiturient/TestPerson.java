package IELTSandAbiturient;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) throws InterruptedException {
        Student ielts = new Student("Doniyor", "Qalandarov", 22, 66, 177, 4,
                0, 0, 0, 0);
        System.out.printf("Student name is %s\n", ielts.getName());
        System.out.printf("Student age is %d\n", ielts.getAge());
        System.out.printf("Student weight is %.1f\n", ielts.getWeight());
        System.out.printf("Student height is %.1f\n", ielts.getHeight());
        System.out.printf("Student course is %d\n", ielts.getCourse());
        ielts.examStart();
        ielts.listening();
        Thread.sleep(10000);
        System.out.println("Listening finished");
        ielts.setListening(6.5);
        System.out.printf("The student's listening score is: %.1f\n", ielts.getListening());
        System.out.println();
        ielts.speaking();
        Thread.sleep(10000);
        System.out.println("Speaking finished");
        ielts.setSpeaking(6.5);
        System.out.printf("The student's speaking score is: %.1f\n", ielts.getSpeaking());
        System.out.println();
        Thread.sleep(5000);
        ielts.writing();
        Thread.sleep(10000);
        System.out.println("Writing finished");
        ielts.setWriting(7);
        System.out.printf("The student's writing score is %.1f", ielts.getWriting());
        System.out.println();
        Thread.sleep(500);
        System.out.println();
        ielts.reading();
        Thread.sleep(10000);
        System.out.println("Reading finished");
        ielts.setReading(7);
        System.out.printf("The student reading score is %.1f\n", ielts.getReading());
        ielts.examFinish();
        Thread.sleep(400);
        System.out.println("Overall Band Score: " + ielts.overallBandScore(ielts.getWriting(), ielts.getListening(), ielts.getSpeaking(),
                ielts.getReading()));
        Abiturient abiturient = new Abiturient("Doniyor", "Qalandarov", 18, 66, 177, "Qo'shko'pir");
        System.out.printf("Abituriant name is %s\n", abiturient.getName());
        abiturient.setDate(LocalDate.of(1999, 7, 10));
        System.out.printf("Abiturient birthday %s\n", abiturient.getDate());
        abiturient.setCountry("Qo'shko'pir");
        System.out.printf("Abiturient country %s\n", abiturient.getCountry());
        System.out.println("");
        abiturient.examStart();
        abiturient.math();
        Thread.sleep(7500);
        abiturient.endMath();
        abiturient.setSolved(25);
        System.out.println("Abiturient solved" + abiturient.getSolved() + " in math");
        System.out.println("Abiturient recieve " + abiturient.scoreChooseScience(25) + " ball\n");
        abiturient.phisics();
        Thread.sleep(7500);
        abiturient.endPyhsics();
        abiturient.setSolved(20);
        System.out.println("Abiturient solved " + abiturient.getSolved() + " in physics");
        System.out.println("Abiturinet reciave " + abiturient.scoreChooseScience(20) + " ball\n");
        System.out.println("");
        abiturient.english();
        Thread.sleep(8000);
        abiturient.endEnglish();
        abiturient.setSolved(8);
        System.out.println("Abiturient solved " + abiturient.getSolved() + " in English");
        System.out.println("Abiturient recieve " + abiturient.scoreMandatoryScience(22) + " ball\n");
        abiturient.history();
        Thread.sleep(7000);
        abiturient.endHistory();
        abiturient.setSolved(8);
        System.out.println("Abiturient solved " + abiturient.getSolved() + " in History");
        System.out.println("Abiturient recieve " + abiturient.scoreMandatoryScience(abiturient.getSolved()) + " ball ");
        abiturient.math2();
        Thread.sleep(8500);
        abiturient.endMath2();
        abiturient.setSolved(10);
        System.out.println("Abiturient solved " + abiturient.getSolved() + " in Math2");
        System.out.println("Abiturient recieve " + abiturient.scoreMandatoryScience(abiturient.getSolved()) + " ball");


    }
}