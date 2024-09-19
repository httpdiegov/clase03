package Controller;

import Model.Employee;
import Model.EmployeeModel;

import java.util.List;

public class EmployeeController {

    public static List<Employee> getEmployees(){
        return EmployeeModel.getEmployees();
    }
    public static boolean addEmployee(Employee empleado){
        return EmployeeModel.addEmployee(empleado);
    }
}
