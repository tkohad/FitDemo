package com.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Utility {

    public static Predicate<Course> course=course -> course.getReview() < 95;

    public static Predicate<Course> course12=course -> course.getReview() < 90;

    public static Consumer<Course> cons=new Consumer<Course>() {
        @Override
        public void accept(Course course) {
            System.out.println(course.toString());
        }
    };

    Supplier<Course> supp=new Supplier<Course>() {
        @Override
        public Course get() {
            return null;
        }
    };

    Function<Course,Course> fun = new Function<Course, Course>() {
        @Override
        public Course apply(Course course) {
            return null;
        }
    };

    };

