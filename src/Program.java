import java.util.Scanner;

public class Program extends School{
    Program(String name){
        super(name);
    }
    void Courses(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1.BSIT");
        System.out.println("2.BSBA");
        System.out.println("3.TEP");
        System.out.println(name + "Enter number: ");
        
        String selectedCourse = scan.nextLine();
            
        if (selectedCourse.equals("1")) {
            System.out.println(name + ".Bachelor of Science in Information Technology");    
        }
        else if (selectedCourse.equals("2")) {
            System.out.println(name + ".Bachelor of Science Business Administration");     
        }
        else if (selectedCourse.equals("3")) {
            System.out.println(name + ".Teacher Education Program");     
        }
        else {
            System.out.println("Invalid input!");
        }  
        
        scan.close();
    }
}
       
