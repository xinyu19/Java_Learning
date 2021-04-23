package exam.e6;

public class People {
    private String id;
    private int age;

    public People(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return id;
    }

    public void setName(String name) {
        this.id = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
