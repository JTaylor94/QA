//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Random;


public class RandomArray {
	
	public int randomFill(Random rand){
		 int randomNum = rand.nextInt(9);
		 return randomNum;
}
	
	public int[] list() {
		
		int[] anArray = new int[4];
		Random rand = new Random();
		
		for(int i = 0; i < anArray.length; i++){
			anArray[i] = randomFill(rand);
			System.out.println(anArray[i]);
		}
		return anArray;	
	}
}