package eidi2.sose23.Siegner.Nick.sheet01.ex0102;

import org.junit.Test;
import org.junit.Assert;
import java.util.Random;


public class Tests {
    
	
	//testing what happens when i input null into sort
	//expecting that nothing happens
	@Test
	public void test0() {
		HelloWorld h = new HelloWorld();
		
		h.sort(null);
		
		
	}
	
	
	//testing an array with 0 entries
	//expecting that the array stays the same
	@Test
	public void test1() {
		HelloWorld h = new HelloWorld();
		
		int[] testArray = new int[0];
		
		int[] testArrayBefore = testArray;
		
		h.sort(testArray);
		
		Assert.assertEquals(testArray, testArrayBefore);
		
		
		
	}
	
	//testing a sorted array of 10 entries with the highest value on the most right position
	//expecting that the array stays the same
	@Test
	public void test2() {
		HelloWorld h = new HelloWorld();
		
		int[] testArray = new int[10];
		for(int i = 0; i < 10; i++) {
			testArray[i] = i+1;
		}
		int[] testArrayBefore = testArray;
		
		h.sort(testArray);
		
		Assert.assertEquals(testArray, testArrayBefore);
		
		
	}
	
	//testing a sorted array of 10 entries with the highest value on the most left position
	//expecting that the array stays the same
	@Test
	public void test3() {
		HelloWorld h = new HelloWorld();
		
		int[] testArray = new int[10];
		for(int i = 0; i < 10; i++) {
			testArray[i] = 10-i;
		}
		int[] testArrayBefore = testArray;
		
		h.sort(testArray);
		
		Assert.assertEquals(testArray, testArrayBefore);
		
	}
	
	
	//testing a unsorted array with 1000 random values between -2^31 and 2^31-1
	@Test
	public void test4() {
		HelloWorld h = new HelloWorld();
		int[] testArray = new int[1000];
		Random rnd = new Random();
		
		for(int i = 0;i<testArray.length;i++) {
			int num = rnd.nextInt((2^31-1)+2^31)-2^31; 
			testArray[i] = num;
			
		}
		
		h.sort(testArray);
		
		boolean sorted = true;
		
		for(int i = 0; i < testArray.length - 1; i++) {
			if(testArray[i] > testArray[i+1]) {
				sorted = false;
			}
		}
		
		Assert.assertEquals(sorted,true);
		
	}
	
}
