package javahomework3;

import java.util.Arrays;

public class Solution13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {//测试程序
        Course course1 = new Course("Java");
        course1.addStudent("ChangSan");
        course1.addStudent("LiSi");
        System.out.println("course1的课程名："+course1.getCourseNameO());//输出course1的信息
        System.out.println("选了course1的学生数目："+course1.getNumberOfStudents());
        System.out.println("选了course1的学生姓名："+ Arrays.toString(course1.getStudents()));
        Course course2 = (Course)course1.clone();//深复制
        System.out.println("course2的课程名："+course2.getCourseNameO());//输出course2的信息
        System.out.println("选了course2的学生数目："+course2.getNumberOfStudents());
        System.out.println("选了course2的学生姓名："+ Arrays.toString(course2.getStudents()));
        course1.addStudent("WangWu");//修改course1里的students，观察course2里的studengts是否跟着变
        System.out.println("修改后course1的students："+Arrays.toString(course1.getStudents()));
        System.out.println("修改后course2的students："+Arrays.toString(course2.getStudents()));
    }
}
class Course implements Cloneable {
    private String courseName;
    private String[]students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents]= student;
        numberOfStudents++;
    }

    public String[]getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseNameO(){
        return courseName;
    }

    public void dropStudent(String student){
    //编程练习题10.9的作业
    }

    //本题要求写的clone方法：
    public Object clone() throws CloneNotSupportedException {
        Course courseClone=(Course)super.clone();//先浅复制，调用Object类里的clone方法
        courseClone.students=(String[])(students.clone());//再单独复制一遍students数组，实现深复制
        return courseClone;
    }
    //结束
}