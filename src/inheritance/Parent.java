package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Parent {

    private int age;
    private String name;

    public void smoke(){
        System.out.println("아버지가 담배를 핍니다.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
