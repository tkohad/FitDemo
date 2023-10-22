import com.test.employee.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        int [] test =new int[10];






        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // HOW MANY MALES ND FEMALE

        Map<String, List<Employee>> list = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
        System.out.println(list.toString());

        Map<String, Long> listCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(listCount.toString());

        // GET DEPARTMENTS

        System.out.println("DEPARTMENT : ");
        List<String> deptList = employeeList.stream().map(x -> x.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println(deptList.toString());

        //AVERAGE AGE OF MALE AND FEMALE

        Map<String, Double> listAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("AVERAGE AGE OF MALE AND FEMALE "+listAge.toString());

        // HIGHEST PAID EMPLOYEE

        Optional<Employee> listMax = employeeList.stream().max(Comparator.comparing(Employee::getSalary));

        System.out.println("MAX SALARY : "+listMax.get().toString());

        //LIST EMPLOYEE JOINED AFTER 2015
        List<Employee> listEmp2015 = employeeList.stream().filter(employe -> employe.getYearOfJoining() > 2015).collect(Collectors.toList());

        System.out.println("EMPLOYEE JOINED AFTER 2015 : "+listEmp2015.toString());

        // COUNT THE NUMBER OF EMPLOYEE IN EACH DEPARTMENT

        Map<String, Long> countEmpDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Employee per dept "+countEmpDept.toString());

        // AVERAGE SALARY OF EACH DEPT

        Map<String, Double> avgSalaryDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("AVERAGE SALARY FOR EACH DEPT : "+avgSalaryDept.toString());

        // YOUNGEST MALE

        Optional<Employee> youngestEmp = employeeList.stream().filter(employe -> employe.getGender().equalsIgnoreCase("male") && employe.getDepartment()
                .equalsIgnoreCase("Product Development")).min(Comparator.comparing(Employee::getAge));
        System.out.println("YOUNGEST EMPLOYEE IN Product Development IS "+youngestEmp.get().toString());

        // MOST EXPERIENCE

        Optional<Employee> expEmployee = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining));

        System.out.println("THE MOST EXPERIENCE EMPLOYEE IS : "+expEmployee.get().toString());

        expEmployee=employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        System.out.println("THE MOST EXPERIENCE EMPLOYEE (METHOD 2) IS : "+expEmployee.get().toString());

        // HOW MANY MALES AND FEMALES IN Sales And Marketing

        Map<String, Long> salesMarkList = employeeList.stream().filter(employe -> employe.getDepartment().equalsIgnoreCase("sales And Marketing")).
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("EMPLOYEE IND Sales And Marketing "+salesMarkList.toString());

        Map<String, Double> listMale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("AVERAGE SALARY FOR MALE AND FEMALE : "+listMale.toString());

        System.out.println("-----------------------");
        Map<String, List<Employee>> empDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((key,value)->{
                System.out.println(" "+key +" : "+value.stream().map(Employee::getName).collect(Collectors.toList()).toString()
                );
        });
        System.out.println("-----------------------");
        System.out.println("EMPLIST "+empDept.toString());

        Map<Boolean, List<Employee>> listEmp25 = employeeList.stream().collect(Collectors.partitioningBy(x -> x.getAge() > 25));

        System.out.println("--> "+listEmp25);

    }
}
