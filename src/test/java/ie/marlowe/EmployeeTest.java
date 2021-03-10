package ie.marlowe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class EmployeeTest {

    private static Scanner scanner = new Scanner(System.in);
    private Employee e;
    private EmployeeList el;

    @BeforeEach
    void init(){
        e = new Employee();
        el = new EmployeeList();
    }

    @Test
    public void testEmployee(){
        e = new Employee();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter employee number");
        String number = scanner.nextLine();
    }

    @Test
    public void testEmployeeFailed(){

    }


}
