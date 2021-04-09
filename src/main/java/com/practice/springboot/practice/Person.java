package com.practice.springboot.practice;

import com.practice.springboot.practice.config.Dog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 想获取配置信息，必须是容器中的bean，其实和bean初始化逻辑一种，配置文件的信息其实就是属性填充
 * @ConfigurationProperties 告诉Spring对象的值从配置文件中获取，prefix前缀表示从配置文件中哪个配置项下面获取属性值
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;

    private int age;

    private String address;

    private List<Object> like;

    private Map<String, Object> maps;

    private Dog dog;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Object> getLike() {
        return like;
    }

    public void setLike(List<Object> like) {
        this.like = like;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", like=" + like +
                ", maps=" + maps +
                ", dog=" + dog +
                '}';
    }
}
