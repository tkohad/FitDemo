package com.test;

public class Course {
    private String name;
    private String category;
    private  int review;
    private int noOfStuent;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getReview() {
        return review;
    }

    public int getNoOfStuent() {
        return noOfStuent;
    }

    public Course(String name, String category, int review, int noOfStuent) {
        this.name = name;
        this.category = category;
        this.review = review;
        this.noOfStuent = noOfStuent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", review='" + review + '\'' +
                ", noOfStuent='" + noOfStuent + '\'' +
                '}';
    }
}
