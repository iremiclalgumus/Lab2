public class Student {

    private String name;
    private int age;
    private boolean isJunior;
    private char gender;

    public Student() {
        name = "";
        age = 0;
        isJunior = false;
        gender = 'M';
    }

    public Student(String name, int age, boolean isJunior, char gender) {
        this.name = name;
        this.age = age;
        this.isJunior = isJunior;
        this.gender = gender;
    }

    public void info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("isJunior: " + isJunior);
        System.out.println("gender: " + gender);
        System.out.println("----------");
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.info();

        Student s2 = new Student("Ayşe", 15, true, 'F');
        s2.info();
    }
}
