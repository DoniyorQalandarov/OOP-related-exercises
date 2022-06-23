package IELTSandAbiturient;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private String country;

    public Person(String name, String lastName, int age, double weight, double height, String country) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.country = country;
    }

    public Person(String name, String lastName, int age, double weight, double height) {
    }

    public void examStart() {
        System.out.print("Exam started\n");
    }

    public void examFinish() {
        System.out.print("Exam finished\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", country='" + country + '\'' +
                '}';
    }

    public void writing() {
        System.out.println("Student is writing");
    }

    public void listening() {
        System.out.println("Student is listening");
    }

    public void speaking() {
        System.out.println("Student is speaking");
    }

    public void reading() {
        System.out.println("Student is  reading");
    }

    public void math() {
        System.out.println("Abiturient is solving at math");
    }

    public void phisics() {
        System.out.println("Abiturient is solving at physics");
    }

    public void english() {
        System.out.println("Abiturient is solving at English");
    }

    public void history() {
        System.out.println("Abiturient is solving at History");
    }

    public void math2() {
        System.out.println("Abiturient is solving at math2");
    }

    public void endMath() {
        System.out.println("Abiturient solved at math");
    }
    public void endEnglish() {
        System.out.println("Abiturient solved at English");
    }
    public void endHistory() {
        System.out.println("Abiturient solved at History");
    }
    public void endMath2() {
        System.out.println("Abitrient solved at Math2");
    }
    public void endPyhsics() {
        System.out.println("Abiturient solved at Pyhsics");
    }
}
