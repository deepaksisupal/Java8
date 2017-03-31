package sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import data.pojos.Employee;
import data.pojos.EmployeeUtil;

public class SortUsingComparator {
	
	public static void main(String[] args){
		List<Employee> employees  = EmployeeUtil.getEmployees();
		
		/** Before Starts **/
		Comparator<Employee> byNameOld = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2){
				return e1.getFirstName().compareTo(e2.getFirstName());
			}
		};
		/** Before Ends**/
		
		/** After Starts **/
		/** Method 1 **/
		
		Comparator<Employee> byName =
				(Employee o1, Employee o2)->o1.getFirstName().compareTo(o2.getFirstName());
				
		Comparator<Employee> byAge =
						(Employee o1, Employee o2)->o1.getAge().compareTo(o2.getAge());
						
		Comparator<Employee> byId =
								(Employee o1, Employee o2)->o1.getId().compareTo(o2.getId());
								
		//employees.sort(byName);
		
		/** Method 2 **/
		//employees.sort(Comparator.comparing(Employee::getFirstName));
		employees.sort(Comparator.comparing(Employee::getAge));//merge sort
		
		Collections.sort(employees, 
	            Comparator.comparing(p1 -> p1.getAge()));//log(n) //binary search algorithm
		
		employees.sort(Comparator.comparing(Employee::getAge));
		//employees.sort(Comparator.comparing(Employee::getId));	
								
								
		/** Method 3 **/		
		//employees.sort(Comparator.comparing(e -> e.getFirstName()));
		
		System.out.println(employees);
	}
	


}
