package L7_Json.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class Cat7 {
    @JSONField(name ="ID")
    public String name;
    private String lastName;
    public int age;
    static int count=0;

    public Cat7(String name, String lastName, int age) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        System.out.println( this.toString()+ ++count);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
