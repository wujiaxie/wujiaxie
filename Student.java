import java.io.Serializable;

    public class Student implements Serializable {
private String name;

private char sex;

private int year;

private double gpa;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
