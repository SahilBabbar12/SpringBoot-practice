package com.knoldus.springBootCRUD.model;

public class Employee {
    private Integer id;
    private String name;
    private String studio;

    public Employee(Integer id, String name, String studio) {
        this.id = id;
        this.name = name;
        this.studio = studio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studio='" + studio + '\'' +
                '}';
    }
}
