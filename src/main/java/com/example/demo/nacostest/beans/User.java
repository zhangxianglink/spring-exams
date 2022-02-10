package com.example.demo.nacostest.beans;

/**
 * @author xiangzhang
 * @since 2022-02-10 11:47
 */
public class User {

    private String name;

    private String age;

    private String magic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", magic='" + magic + '\'' +
                '}';
    }
}
