package Model;

public class Student 
    {
        int studentID;
        String studentName;
        int studentAge;
        String studentGender;
        String studentPhone;
        String studentMail;

        public Student(int studentID, String studentName, int studentAge, String studentGender, String studentPhone, String studentMail) 
            {
                this.studentName = studentName;
                this.studentAge = studentAge;
                this.studentGender = studentGender;
                this.studentPhone = studentPhone;
                this.studentMail = studentMail;
                this.studentID = studentID;
            }

        public Student() 
            {
            }

        public int getStudentID() 
            {
                return studentID;
            }

        public void setStudentID(int studentID) 
            {
                this.studentID = studentID;
            }

        public String getStudentName() 
            {
                return studentName;
            }

        public void setStudentName(String studentName) 
            {
                this.studentName = studentName;
            }

        public int getStudentAge() 
            {
                return studentAge;
            }

        public void setStudentAge(int studentAge) 
            {
                this.studentAge = studentAge;
            }

        public String getStudentGender() 
            {
                return studentGender;
            }

        public void setStudentGender(String studentGender) 
            {
                this.studentGender = studentGender;
            }   

        public String getStudentPhone() 
            {
                return studentPhone;
            }

        public void setStudentPhone(String studentPhone) 
            {
                this.studentPhone = studentPhone;
            }

        public String getStudentMail() 
            {
                return studentMail;
            }

        public void setStudentMail(String studentMail) 
            {
                this.studentMail = studentMail;
            }
    }