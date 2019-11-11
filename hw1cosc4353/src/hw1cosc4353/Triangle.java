package hw1cosc4353;
import java.util.Scanner;
import java.lang.Math;
import java.awt.Point;

public class Triangle {

	int len1;
	int len2;
	int len3;
	double s;
	double areanum;
	public Triangle (int len1, int len2, int len3) {
		this.len1 = len1;
		this.len2 = len2;
		this.len3 = len3;
	}
	
	public void area() {
		s = (len1 + len2 + len3)/2;
		areanum = Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
		System.out.println("Semiperimeter: " + s);
		System.out.println("Area: " + areanum);
	}
	
	public void equilateral() {
		if (len1 == len2 && len1 == len3) {
			System.out.println("This triangle is an equilateral triangle!");
			System.exit(0);
		}
	}
	
	public void isosceles() {
		if (len1 == len2 || len1 == len3 || len2 == len3) {
			System.out.println("This triangle is an isosceles triangle!");
			System.exit(0);
		}
	}
	
	public void scalene() {
		if (len1 != len2 && len1 != len3 && len2 != len3) {
			System.out.println("This triangle is a scalene triangle!");
			System.exit(0);
		}
	}
	
	public void right() {
		int squ1 = len1 * len1;
		int squ2 = len2 * len2;
		int squ3 = len3 * len3;
		if (len1 > len2 && len1 > len3) {
			if (squ3 + squ2 == squ1) {
				System.out.println("This triangle is a right triangle!");
			}
		}
		if (len2 > len1 && len2 > len3) {
			if (squ3 + squ1 == squ2) {
				System.out.println("This triangle is a right triangle!");
			}
		}
		if (len3 > len1 && len3 > len2) {
			if (squ1 + squ2 == squ3) {
				System.out.println("This triangle is a right triangle!");
			}
		}
	}
	
	public static void display(String[][]s) {//declare coordinate plane
		for (int i=0; i<s.length;i++) {//help from youtube ManiProgramming
			System.out.println();
			for (int j=0; j<s.length;j++) {
				System.out.print(s[i][j]+ "\t");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the first side length of the triangle:");
		Scanner scanner = new Scanner(System.in);
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		if (scanner.hasNextInt()) {
			a1 = scanner.nextInt();
		} else {
			System.out.println("Error: Input is not an integer!");
			System.exit(0);
		}
		
		System.out.println("Enter the second side length of the triangle:");
		if (scanner.hasNextInt()) {
			a2 = scanner.nextInt();
		} else {
			System.out.println("Error: Input is not an integer!");
			System.exit(0);
		}
		
		System.out.println("Enter the third side length of the triangle:");
		if (scanner.hasNextInt()) {
			a3 = scanner.nextInt();
		} else {
			System.out.println("Error: Input is not an integer!");
			System.exit(0);
		}
		
		if (a1 == 0 || a2 == 0 || a3 == 0) {
			System.out.println("Error: One or more of the side lengths is 0!");
			System.exit(0);
		}
		if (a1 < 0 || a2 < 0 || a3 < 0) {
			System.out.println("Error: One or more of the side lengths are less than 0!");
			System.exit(0);
		}
		Triangle tri = new Triangle(a1,a2,a3);
		
		System.out.println("Enter first coordinate X value: ");
		int inx = scanner.nextInt();
		
		System.out.println("Enter first coordinate Y value: ");
		int inx2 = scanner.nextInt();
		
		Point p = new Point(inx2,inx);
		
		System.out.println("Enter second coordinate X value: ");
		int inx3 = scanner.nextInt();
		
		System.out.println("Enter second coordinate Y value: ");
		int inx4 = scanner.nextInt();
		
		Point p2 = new Point(inx4,inx3);
		
		System.out.println("Enter third coordinate X value: ");
		int inx5 = scanner.nextInt();
		
		System.out.println("Enter third coordinate Y value: ");
		int inx6 = scanner.nextInt();
		
		Point p3 = new Point(inx6,inx5);
		
		String [][] x = new String[10][10];
		for (int i=0; i<x.length;i++) {//help from youtube ManiProgramming
			for (int j=0; j<x.length; j++) {
				x[i][j] = "o";
				x[(int) p.getX()][(int) p.getY()] = "X";
				x[(int) p2.getX()][(int) p2.getY()] = "X";
				x[(int) p3.getX()][(int) p3.getY()] = "X";
			}
		}
		
		display(x);
		
		tri.area();
		
		tri.equilateral();
		tri.right();
		tri.isosceles();
		tri.scalene();
		
		
		scanner.close();
	}

}
