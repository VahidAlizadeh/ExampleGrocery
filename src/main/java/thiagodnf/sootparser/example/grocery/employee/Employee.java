->RefactoringNumber->89469<-ExtractSuperClass(thiagodnf.sootparser.example.grocery.employee.Employee;Class_1;[name];[printComplexReports|setName])
->RefactoringNumber->89483<-MoveField(thiagodnf.sootparser.example.grocery.employee.Employee;thiagodnf.sootparser.example.grocery.MainClass;[employeeId];[])
<-endRefactoring marker->
package thiagodnf.sootparser.example.grocery.employee;

import java.util.List;

import thiagodnf.sootparser.example.grocery.order.Order;
import thiagodnf.sootparser.example.grocery.report.ComplexReport;
import thiagodnf.sootparser.example.grocery.report.SimpleReport;
import thiagodnf.sootparser.example.grocery.util.UUIDUtil;

public class Employee {
	
	public long employeeId;
	
	protected String name;
	
	public Employee(String name){
		this.employeeId = UUIDUtil.getId();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printSimpleReports(List<Order> orders){
		System.out.println(new SimpleReport().print(orders));
	}
	
	public void printComplexReports(List<Order> orders){
		System.out.println(new ComplexReport().print(orders));
	}
}
