package IELTSandAbiturient;

public class Student extends Person {
    private int course;
    private double listening;
    private double speaking;
    private double writing;
    private double reading;

    public Student(String name, String lastName, int age, double weight, double height) {
        super(name, lastName, age, weight, height);
    }

    public Student(String name, String lastName, int age, double weight, double height, int course,
                   double listening, double speaking, double writing, double reading) {
        super(name, lastName, age, weight, height);
        this.course = course;
        this.listening = listening;
        this.writing = writing;
        this.reading = reading;
        this.speaking = speaking;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void writing() {
        super.writing();
    }

    @Override
    public void listening() {
        super.listening();
    }

    @Override
    public void speaking() {
        super.speaking();
    }

    @Override
    public void reading() {
        super.reading();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public double getListening() {
        return listening;
    }

    public double getReading() {
        return reading;
    }

    public double getSpeaking() {
        return speaking;
    }
    public double getWriting() {
        return writing;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void examStart() {
        super.examStart();
    }

    @Override
    public void examFinish() {
        super.examFinish();
    }

    public void setListening(double listening) {
        this.listening = listening;
    }

    public void setReading(double reading) {
        this.reading = reading;
    }

    public void setSpeaking(double speaking) {
        this.speaking = speaking;
    }

    public void setWriting(double writing) {
        this.writing = writing;
    }
    public double overallBandScore(double writing,double listening, double speaking,double reading) {
        return (writing + listening + speaking + reading)/4;
    }
}