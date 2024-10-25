package Model;

import java.util.ArrayList;
import Model.Student.*;

public class StudentManager 
    {   
    
        private ArrayList<Student> studentList;

        public StudentManager() 
            {
                studentList = new ArrayList<>();
            }

        public ArrayList<Student> getStudentList() 
            {
                return studentList;
            }

        public void setStudentList(ArrayList<Student> studentList) 
            {
                this.studentList = studentList;
            }

        public void addStudent(Student student) 
            {
                studentList.add(student);
            }

//------------------------------------------------------------------------------

        public String titleNormalization(String studentName)
            {
                studentName.trim().toLowerCase();
                StringBuffer string = new StringBuffer(studentName);
                int j = 0;
                while(j < string.length() - 1)
                    {
                        if((string.charAt(j) == ' ') && (string.charAt(j + 1) == ' ')) 
                            {
                                string.delete(j, j + 1);
                                j--;
                            }	
                        j++;
                    }

                Character character = string.charAt(0);
                character = Character.toUpperCase(character);
                string.setCharAt(0, character);

                for(int i = 1; i < string.length(); i++ ) 
                    {
                        if(string.charAt(i - 1) == ' ' && string.charAt(i) != ' ') 
                            {
                                character = Character.toUpperCase(string.charAt(i));
                                string.setCharAt(i, character);
                            }
                    }
                studentName = new String(string);
                return studentName;
            }

//------------------------------------------------------------------------------

        public void displayStudent(Student student) 
            {
                System.out.println ("\n           STUDENT INFORMATION:");
                System.out.println ("________________________________________________");
                System.out.println ("Student ID: " +  student.studentID); 
                System.out.println ("Student name: " + titleNormalization(student.studentName)); 
                System.out.println ("Student Age: " + student.studentAge);
                System.out.println ("Student gender: " + student.studentGender);
                System.out.println ("Student phone number: " + student.studentPhone);
                System.out.println ("Student mail: " + student.studentMail + "@gmail.com");
                System.out.println ("________________________________________________");
            }
    }