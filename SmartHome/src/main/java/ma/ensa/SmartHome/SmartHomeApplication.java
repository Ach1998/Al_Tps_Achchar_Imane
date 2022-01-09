package ma.ensa.SmartHome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmartHomeApplication {

	public static void main(String[] args) {


	List<Integer> argument= new ArrayList<>();
        argument.add(7);
        argument.add(9);
        argument.add(10);
        argument.add(8);
        argument.add(7);
        argument.add(20);
	List<Integer> list=returnLesNombresPremiers(argument);
        System.out.println(list);
}

	public static String inverseString(String chaine){
		Stack<Character> stack=new Stack<>();
		String result="";
		for (char c:chaine.toCharArray()) {
			stack.push(c);
		}
		while(!stack.isEmpty()){
			result=result+stack.pop();
		}
		return  result;
	}

	public static List<Integer> returnLesNombresPremiers(List<Integer> nombres){

		List<Integer> nombrePremier=new ArrayList<>();
		for (int n:nombres) {
			boolean isPremier=true;
			for(int i = 2; i<=n/2; i++){
				System.out.println("n"+n+"==="+n % i );
				if( n%i  ==0) {
					isPremier=false;
					break;
				}

			}
			if(isPremier)
				nombrePremier.add(n);
		}
		return nombrePremier;
	}
}
