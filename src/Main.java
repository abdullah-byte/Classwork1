import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student student = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.println("Please enter your department ");
        String department = scanner.nextLine();
        student.setDepartment(department);

        System.out.println("Please enter your level ");
        String level = scanner.nextLine();
        student.setLevel(level);

        System.out.println("Please enter your matric number ");
        String matricNumber = scanner.nextLine();
        student.setMatricNumber(matricNumber);

        System.out.println("Please enter your age ");
        int age = scanner.nextInt();
        student.setAge(age);

        System.out.println("Your full name is "+ student.getName());
        System.out.println("Your department is "+ student.getDepartment());
        System.out.println("Your level is "+ student.getLevel());
        System.out.println("Your matric number is "+ student.getMatricNumber());
        System.out.println("You are "+ student.getAge() +" years old");

    }
}