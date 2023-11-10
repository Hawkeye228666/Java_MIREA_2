package fifteen;

public class MVCDemo {
    public static void main(String[] args) {

        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);


        controller.updateView();
        
        controller.setHourlyRate(25.0);
        controller.setHoursWorked(50);
        controller.updateView();
    }
}