package exam.e9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import comparable.Person;

public class SortList {
	public static void main(String[] args) {
		Employee e1 = new Employee("001",10000,300);
        Employee e2 = new Employee("002",10000,200);
        Employee e3 = new Employee("003",20000,200);
        Employee e4 = new Employee("004",30000,200);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        System.out.println(list);
        //[Employee{員工編號='001', 薪水=10000, 傭金=300}, Employee{員工編號='002', 薪水=10000, 傭金=200}, 
        //Employee{員工編號='003', 薪水=20000, 傭金=200}, Employee{員工編號='004', 薪水=30000, 傭金=200}]
        
        
        //請利用List中的sort方法重新排序e1..e4，排序時薪水(salary)大的排前面，如果薪水一樣則commission大的排前面

        
        //comparator
        list.sort(Comparator.<Employee, Integer>comparing(emp -> emp.getSalary())
        .thenComparing(emp -> emp.getCommission()).reversed());

        //
        
        System.out.println(list);
        //[Employee{員工編號='004', 薪水=30000, 傭金=200}, Employee{員工編號='003', 薪水=20000, 傭金=200},
        //Employee{員工編號='001', 薪水=10000, 傭金=300}, Employee{員工編號='002', 薪水=10000, 傭金=200}]

    }

}
