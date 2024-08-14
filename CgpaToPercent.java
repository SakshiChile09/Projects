
package Projects;
import java.util.Scanner;
public class CgpaToPercent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your CGPA: ");
		float cgpa=sc.nextFloat();
		char grade;
		
		if(cgpa>=9.50 && cgpa>9.50) {
			System.out.println("Grade is O");
			System.out.println(cgpa*20-100+"%");
			
		}
		else if(cgpa>=8.25 && cgpa<=9.50) {
			System.out.println("Grade is A+");
			System.out.println(cgpa*12-25+"%");
			
		}
		else if(cgpa>=6.75 && cgpa<=8.25) {
			System.out.println("Grade is A");
			System.out.println(cgpa*10-7.5+"%");
			
		}
		else if(cgpa>=5.75 && cgpa<=6.75) {
			System.out.println("Grade is B+");
			System.out.println(cgpa*5+26.25+"%");
			
		}
		else if(cgpa>=5.25 && cgpa<=5.75) {
			System.out.println("Grade is B");
			System.out.println(cgpa*10-2.5+"%");
			
		}
		else if(cgpa>=4.75 && cgpa<=5.25) {
			System.out.println("Grade is C");
			System.out.println(cgpa*10-2.50+"%");
			
		}
		else if(cgpa>=4.00 && cgpa<=4.75) {
			System.out.println("Grade is D");
			System.out.println(cgpa*10-2.5+"%");
			
		}
		else {
			System.out.println("F");
		}
		
		

	}

}
