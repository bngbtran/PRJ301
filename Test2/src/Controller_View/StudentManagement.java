package Controller_View;

import Model.*;
import java.util.Scanner;

public class StudentManagement 
    {
        private static StudentManager studentList;

        public static void main(String[] args) 
            {
                StudentManager manager = new StudentManager();
                Student studentInfo = new Student();

//------------------------------------------------------------------------------

                Scanner scanner = new Scanner(System.in);

                while(true) 
                    {
                        System.out.println ("________________________________________________");
                        System.out.println ("\n            CHOOSE FROM 1 TO 4");
                        System.out.println ("------------------------------------------------");
                        System.out.println ("1. Add student");
                        System.out.println ("2. Display students at age 20");
                        System.out.println ("3. Display the number of female students at age 22");
                        System.out.println ("4. Exit");
                        System.out.println ("________________________________________________");
                        System.out.print("Your choice is: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        switch (choice) 
                            {
                                case 1:
                                    Student student;
                                    int studentID;
                                    String studentName;
                                    int studentAge;
                                    String studentGender = null;
                                    String studentPhone;
                                    String studentMail;
                                    String genderTypeIn = null;

                                    System.out.println ("\n              INPUT NEW STUDENT");
                                    System.out.println ("________________________________________________");
                                    
                                    System.out.print ("Student ID: ");
                                    studentID = (int) (Math.random() * 100); 
                                    System.out.println(studentID);

//------------------------------------------------------------------------------
                                    
                                    do
                                        {
                                            System.out.print ("Input student name: ");
                                            studentName = scanner.nextLine();
                                        }
                                    while(studentName.length() <= 4 || studentName.matches(".*[^a-z 0-9].*"));
                                    
//------------------------------------------------------------------------------

                                    do
                                        {
                                            System.out.print ("Input student age (in range [18 - 60]): ");
                                            studentAge = scanner.nextInt();
                                            scanner.nextLine();
                                        }
                                    while(studentAge < 18 || studentAge > 60);

//------------------------------------------------------------------------------

                                    do
                                        {
                                            System.out.print ("Input student gender ('F' for 'Female', 'M' for 'Male'): ");
                                            genderTypeIn = scanner.nextLine().toUpperCase();   
                                        }
                                    while(!(genderTypeIn.contains("F")) && !(genderTypeIn.contains("M")) || genderTypeIn.isEmpty());
                                    if ("F".equals(genderTypeIn))
                                        studentGender = "Female";
                                    else if ("M".equals(genderTypeIn))
                                        studentGender = "Male";
                                    
//------------------------------------------------------------------------------
                                    
                                    do
                                        {
                                            System.out.print ("Input student phone number (10 digits): ");
                                            studentPhone = scanner.nextLine();
                                        }
                                    while(studentPhone.length() != 10 || studentPhone.contains(" "));

//------------------------------------------------------------------------------
                                    
                                    do  
                                        {
                                            System.out.print("Email (Just input username): ");
                                            studentMail = scanner.nextLine();
                                        }
                                    while(studentMail.length() <= 0 || studentMail.matches(".*[^a-z 0-9].*") || studentMail.contains(" "));

//------------------------------------------------------------------------------
                                    
                                    student = new Student(studentID, studentName, studentAge, studentGender, studentPhone, studentMail);
                                    manager.addStudent(student);

                                    System.out.println ("\nSuccessfully !!!");
                                    manager.displayStudent(student);
                                    break;
                                    
//------------------------------------------------------------------------------

                                case 2:
                                    System.out.println ("\nStudents at age 20: ");
                                    for (Student hs2 : manager.getStudentList()) 
                                        {
                                            if (hs2.getStudentAge() == 20) 
                                                {
                                                    manager.displayStudent(hs2);
                                                }
                                        }
                                    break;

//------------------------------------------------------------------------------

                                case 3:
                                    int count = 0;
                                    for (Student hs3 : manager.getStudentList()) 
                                        {
                                            if (hs3.getStudentAge() == 22 && hs3.getStudentGender().equals("Female")) 
                                                {
                                                    count++;
                                                }
                                            System.out.println("\nThe number of female students at age 22 is: " + count);
                                        }
                                    break;
                                    
//------------------------------------------------------------------------------
                                    
                                case 4:
                                    System.exit(0);
                                    
//------------------------------------------------------------------------------

                                default:
                                    System.out.println("\nInvalid !!!");
                            }
                    }
            }
    }