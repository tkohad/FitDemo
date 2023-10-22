package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Course> list=new ArrayList<Course>();
        list.add(new Course("JAVA 8","JAVA",90,500));
        list.add(new Course("Threads","JAVA",98,7500));
        list.add(new Course("Collections","JAVA",98,9876));
        list.add(new Course("Spring Boot","Spring",90,5120));
        list.add(new Course("Spring Integration","Spring",80,200));
        list.add(new Course("AWS","Cloud",90,500));
        list.add(new Course("AZURE","Cloud",99,1287));
        list.add(new Course("GCP","Cloud",97,6789));
        list.add(new Course("Kafka","MQ",90,500));
        list.add(new Course("Rabbit","MQ",34,50230));
        list.add(new Course("Message Queue","MQ",93,5030));

        Predicate<Course> gt95=course -> { return course.getReview() >95; };
        Predicate<Course> ls90=course -> course.getReview() <90;
        Consumer<Course> printCon= course -> {System.out.println(course.toString());};
        Comparator<Course> byStudent=Comparator.comparing(Course::getNoOfStuent);
        Comparator<Course> byStudentRev=Comparator.comparing(Course::getNoOfStuent).reversed();

        list.stream().filter(gt95).forEach(printCon);

        System.out.println(list.stream().allMatch(ls90));

        System.out.println(list.stream().anyMatch(ls90));

        System.out.println(list.stream().filter(ls90).findFirst());

        System.out.println(list.stream().sorted(byStudent.thenComparing(byStudentRev)).collect(Collectors.toList()));

        System.out.println("REVERSED .....");
        System.out.println(list.stream().sorted(byStudentRev).collect(Collectors.toList()));

        System.out.println(list.stream());
        System.out.println("MAX .....");
        System.out.println(list.stream().max(byStudent).toString());

       // Utility.course.and(Utility.course12).test()



    }



    private static Predicate<Course> getCoursePredicate() {
        return item -> item.getReview() > 90;
    }
}
