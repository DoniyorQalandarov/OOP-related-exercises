package IELTSandAbiturient;

import java.time.LocalDate;

public class Abiturient extends Person {
    private LocalDate date;
    private String country;
    private int solved;

    public Abiturient(String name, String lastName, int age, double weight, double height, String country) {
        super(name, lastName, age, weight, height, country);
    }

    public Abiturient(String name, String lastName, int age, double weight, double height) {
        super(name, lastName, age, weight, height);
    }

    public int getSolved() {
        return solved;
    }

    public void setSolved(int solved) {
        this.solved = solved;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void examStart() {
        super.examStart();
    }

    @Override
    public void examFinish() {
        super.examFinish();
    }

    @Override
    public void endEnglish() {
        super.endEnglish();
    }

    @Override
    public void endHistory() {
        super.endHistory();
    }

    @Override
    public void endMath() {
        super.endMath();
    }

    @Override
    public void endMath2() {
        super.endMath2();
    }

    @Override
    public void endPyhsics() {
        super.endPyhsics();
    }
    public double scoreChooseScience(int solved) {
        return solved * 3.1;
    }
    public double scoreMandatoryScience(int solved) {
        return solved * 2.1;
    }
}
