package com.workintech.Company;

import java.util.HashMap;
import java.util.LinkedList;

public class ArrEmployee {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Kadir","Aydin"));
        employees.add(new Employee(2,"Ali","Veli"));
        employees.add(new Employee(3,"Doğancan","Kinik"));
        employees.add(new Employee(1,"Kadir","Aydin"));
        employees.add(new Employee(4,"Burak","Cevizli"));
        employees.add(new Employee(5,"Müge","Anli"));
        employees.add(new Employee(6,"Mehmet","Selim"));
        employees.add(new Employee(6,"Mehmet","Selim"));
        employees.add(new Employee(7,"Anil","Ensari"));

        LinkedList<Employee> arremployee = new LinkedList<>();

        HashMap<Integer , Employee> tekraretmeyen = new HashMap<>();

        for(Employee employee : employees){
            if(tekraretmeyen.containsKey(employee.getId())){
                arremployee.add(employee);
            }else {
                tekraretmeyen.put(employee.getId(), employee);
            }
        }
        employees.removeAll(arremployee);

        System.out.println("Tekrar eden Employee: ");
        for (Employee employee : arremployee){
            System.out.println(employee);
        }
        System.out.println(" Tekrar etmeyen Employee: ");
        for (Employee employee : tekraretmeyen.values()){
            System.out.println(employee);
        }



    }
}
