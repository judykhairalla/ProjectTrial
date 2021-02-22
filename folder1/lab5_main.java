/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;
import java.io.*;
import java.util.*;
import java.io.IOException;
/**
 *
 * @author judyk
 */
public class lab5_main {
    
    public static ArrayList <Student> students = new ArrayList<>();
    public static void main(String[] args){
        
        double []grades1 = {30,21,45,23,50};
        double []grades2 = {12,31,50,50,50};
        double []grades3 = {2,1,0,20,30};
       
        
        Student S1= new Student(20190384, "Jay", grades1);
        Student S2= new Student(20173924, "Alice", grades2);
        Student S3= new Student(201084632, "Celine", grades3);
        
        Course C1a = new Course("CSC240", "OOP");
        Course C1b = new Course("CSC220", "DLD");
        S1.addCourses(C1a);
        S1.addCourses(C1b);
        
        Course C2a = new Course("CSC210", "DS");
        Course C2b = new Course("BAs220", "Math");
        S2.addCourses(C2a);
        S2.addCourses(C2b);
        
        Course C3a = new Course("BAS115", "Stat");
        Course C3b = new Course("CSC105", "Problem solving");
        S3.addCourses(C3a);
        S3.addCourses(C3b);
        
        students.add(S1);
        students.add(S2);
        students.add(S3);
        
        write();
        
        students.clear();
        
        read();
        for(Student s: students)
            System.out.println(s.getName());
        
        S2.write();
        Student sNew = new Student();
        sNew.read();
        
        
    }
    
    public static void write(){
        try {
            ObjectOutputStream o = new ObjectOutputStream
        (new FileOutputStream("students.bin"));
            
            //o.writeObject(students);
            for(Student s: students)
                o.writeObject(s);
            
            o.close();
        } catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("");
        }
    }
    
    public static void read(){
            ObjectInputStream input;
        try{
            FileInputStream fis = new FileInputStream("students.bin");
            input = new ObjectInputStream(fis);
            while(fis.available()!= 0)
                students.add((Student)input.readObject());
                //students = (ArrayList<Student>) input.readObject();

            input.close();
        }
        catch(EOFException e){
            System.out.println("end of file");
        }catch(IOException ex){
            System.out.println(ex);
        } catch(ClassNotFoundException ce){
            System.out.println(ce);
        }

    }
 
}
