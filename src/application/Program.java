package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;
import model.entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Course a = new Course("A");
		Course b = new Course("B");
		Course c = new Course("C");

		
		System.out.print("How many students for course A? ");
		int amount = sc.nextInt();
		for(int i=0; i<amount;i++) {
			int id = sc.nextInt();
			a.addStudent(new Student(id));
		}
		
		System.out.print("How many students for course B? ");
		amount = sc.nextInt();
		for(int i=0; i<amount;i++) {
			int id = sc.nextInt();
			b.addStudent(new Student(id));
		}
		
		System.out.print("How many students for course C? ");
		amount = sc.nextInt();
		for(int i=0; i<amount;i++) {
			int id = sc.nextInt();
			c.addStudent(new Student(id));
		}
		
		Set<Student> set = new HashSet<>();
		
		for(Student s : a.getStudents()) {
			set.add(s);
		}
		
		for(Student s : b.getStudents()) {
			set.add(s);
		}
		
		for(Student s : c.getStudents()) {
			set.add(s);
		}
		
		sc.close();
		
		System.out.println("Total amount of students: " + set.size());
		
	}

}
