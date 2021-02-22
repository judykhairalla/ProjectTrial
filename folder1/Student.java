/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.io.IOException;
import java.util.*;
import java.io.*;

//import java.io.EOFException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;

/**
 *
 * @author judyk
 */
public class Student implements Serializable{
    private int id;
    private String name;
    private double[] grades;
    private ArrayList<Course> courses;
    
    public Student(){
        id =0; 
        name = "";
        grades = new double[5];
        courses = new ArrayList<>();
    }
    
    public Student (int id, String name, double[]grades){
        this.id = id; 
        this.name = name;
        this.grades = grades;
        courses = new ArrayList<>();
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
        
    }
    
    public double[]getGrade(){
        return grades;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public String getCoursen(int index) 
    {
        return courses.get(index).getCourseName();
    }
    
    public void addCourses(Course c) {
        courses.add(c);
    }
    
    public void write(){
        PrintWriter output;
        try {
            output = new PrintWriter("grades.txt");
            for(double grade: grades)
                output.print(grade + " ");
            output.close();
        }
        catch (IOException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void read(){
        File file = new File ("grades.txt");
        try {
            Scanner input = new Scanner(file);
            while(input.hasNextDouble())
            {
                System.out.println(input.nextDouble());
            }
        }
        catch (IOException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
