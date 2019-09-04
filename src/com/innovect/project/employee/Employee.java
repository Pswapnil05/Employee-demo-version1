package com.innovect.project.employee;
import java.util.*;

public class Employee {

   static List <Employee> Emp = new ArrayList<Employee>();
  static List <Employee> RemEmp = new ArrayList<Employee>();

   private int EmpID;
   private String Fname;
   private String Lname;
   private String DOB;
   private String contact;
   private String Email;
   private String Address1;
   private String Depart;
   private String Design;

   public String setFname() {
     return Fname;
   }

   public int setEmpID() {
    return EmpID;
   }

    @Override
    public String toString() {
        return "Employee{" + '\n'+
        "EmpID=" + EmpID + '\n'+
        "Fname= " + Fname + '\n' +
        " Lname= " + Lname + '\n' +
        " DOB= " + DOB + '\n' +
        " contact= " + contact + '\n' +
        " Email= " + Email + '\n' +
        " Address1= " + Address1 + '\n' +
        " Depart= " + Depart + '\n' +
        " Design= " + Design + '\n' +
        '}';
    }

   public void display() {
     System.out.println("--------------------------------------------");
     System.out.println("Emplyee ID: "+ EmpID);
     System.out.println("First Name: "+ Fname);
     System.out.println("Last Name: "+ Lname);
     System.out.println("Date of Birth: "+ DOB);
     System.out.println("contact no.: "+ contact);
     System.out.println("Email Id: "+ Email);
     System.out.println("Address line1: "+ Address1 );
     System.out.println("Department: "+ Depart);
     System.out.println("Designation: "+ Design);

   }


 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int index=0;
  while(true) {
    System.out.println("--------------------------------------------");
    System.out.println("1.Home");
    System.out.println("2.Exit");
    System.out.println("--------------------------------------------");
    System.out.println("Enter your choice:");

    int choice = sc.nextInt();

   switch (choice) {
     case 1:
       System.out.println("-------------------------------------------");
       System.out.println("1: Add new Employee");
       System.out.println("2: View Employees ");
       System.out.println("3: Update Employee");
       System.out.println("4: Search Employee by Id");
       System.out.println("5: Remove Employee");
       System.out.println("6: View all removed Employees");
       System.out.println("0: Exit");
       System.out.println("--------------------------------------------");
       System.out.println("Enter your choice:");

       choice = sc.nextInt();

       switch (choice) {
         case 1:
           Employee obj=new Employee();
           System.out.println("Add new Employee");
           sc.nextLine();
           obj.EmpID=index+1;
           System.out.println("Enter your First Name: ");
           obj.Fname = sc.nextLine();
           System.out.println("Enter your Last Name: ");
           obj.Lname = sc.nextLine();
           System.out.println("Enter your Date of Birth: ");
           obj.DOB = sc.nextLine();
           System.out.println("Enter your contact no.: ");
           obj.contact = sc.nextLine();
           System.out.println("Enter your Email Id: ");
           obj.Email = sc.nextLine();
           System.out.println("Enter your Address Line 1: ");
           obj.Address1 = sc.nextLine();
           System.out.println("Enter your Department: ");
           obj.Depart = sc.nextLine();
           System.out.println("Enter your Designation: ");
           obj.Design = sc.nextLine();
           Emp.add(obj);
           index++;
           break;
         case 2:
           System.out.println("View Employees ");
           //Emp.get(0).display();
           for (Employee i: Emp)
             i.display();
         break;

         case 3:
           System.out.println("Update Employee");
           System.out.println("To update Enter the Employee Id: ");
           int id=sc.nextInt();
           Employee temp= null;
           for (Employee i: Emp) {
             if (i.EmpID == id) {
               temp=i;
               break;
             }
           }
           if (temp!=null) {
             temp.display();
             System.out.println("--------------------------------------------");
             System.out.println("Enter First Name to be changed: ");
             sc.nextLine();
             temp.Fname = sc.nextLine();
             System.out.println("First Name has been changed to: " + temp.Fname );
           }
           else System.out.println("Employee with Id " + id + " does'nt exist");
         break;

         case 4:
           System.out.println("Search Employee by Id");
           System.out.println("Enter the Employee Id: ");
           id=sc.nextInt();
           temp= null;
           for (Employee i: Emp) {
             if (i.EmpID == id) {
                 temp=i;
               // System.out.println(i);
               // i.display();
               break;
             }
           }
           if (temp!=null) temp.display();
           else System.out.println("Employee with Id " + id + " does'nt exist");
         break;

         case 5:
           System.out.println("Remove Employee");
           System.out.println("Enter the Employee Id to be removed: ");
           sc.nextLine();
           id =sc.nextInt();
           temp= null;
           for (Employee i : Emp) {
              if (i.EmpID==id) {
                 temp = i;
                 break;
              }
           }
           if (temp!=null) {
              RemEmp.add(temp);
              Emp.remove(temp);
              System.out.println("Employee with Id " + id + " is removed");
           }
           else System.out.println("Employee with Id " + id + " does'nt exist");
         break;

         case 6:
           System.out.println("View all Removed Employees");
            for (Employee i: RemEmp) i.display();
            if (RemEmp.size()==0) System.out.println("Non of the Employees have been Removed.");
         break;

       }
     break;

     case 2:
       System.out.println("Exit");
       System.exit(0);
       break;

     default:
       System.out.println("Please select correct choice");
   }
  }
 }
}

