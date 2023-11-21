package inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Inside Person:Constructor");
    }

    public Person(String name) {
        System.out.println("Inside Person:2nd Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
