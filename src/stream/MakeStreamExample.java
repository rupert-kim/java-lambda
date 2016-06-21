package stream;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MakeStreamExample {


    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("donemin",31));
        employeeList.add(new Employee("employee",29));
        employeeList.add(new Employee("rupert",27));

        employeeList.add(new Employee("bot",99));
        employeeList.add(new Employee("kimteamup",99));

        employeeList.add(new Employee("intern1",19));
        employeeList.add(new Employee("intern2",18));

        employeeList.stream()                                           // 스트림 생성
                .filter(employee -> employee.isAdult())                 // 중개 연산 (스트림 데이터의 변화)
                .forEach(adultEmployee->adultEmployee.setBonus(100));   // 종단 연산 (스트림 데이터의 활용)


        //직원의 나이가 1명이라도 3살 미만이 있는지
        employeeList.stream()
                .anyMatch(employee -> employee.getAge()<3); // false

        //직원의 이름이 모두 2글자 이상인지
        employeeList.stream()
                .allMatch(employee -> employee.getName().length()>2);//true

        //직원의 나이리스트만 뽑아내기
        //[31, 29, 27, 99, 99, 19, 18]
        List<Integer> emplyeeAgeList = employeeList.stream()
                .map(employee -> employee.getAge())
                .collect(Collectors.toList());



        //이름에 intern이 포함된 직원의 숫자
        int internCount = (int) employeeList.stream()
                .filter(employee -> employee.getName().contains("intern"))
                .count();


        //나이순으로 정렬된 직원 리스트를 받기
        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getAge(),emp2.getAge()))
                .collect(Collectors.toList());

    }

}
