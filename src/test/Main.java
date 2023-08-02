package test;

public class Main {

	 public static void main(String[] args) {
		 
	        int var = 0;
	        System.out.println(var);
	        var += 10;
	        System.out.println(var);
	        
	       String[] arr1 = {"movie1", "movie2", "movie3"};
	       String movie1 = arr1[0];
	       int length = arr1.length;
	       String lastMovie = arr1[length - 1];
	       
	       for (String t : arr1) {
	           System.out.println(t);
	       }
	       
	       int[] arr2 = {1, 2, 3, 4, 5};
	       for (int i = 0; i < arr2.length; i++) {
	           arr2[i] += 3;
	       }
	       
	       int sum = 0;
	       for (int n : arr2) {
	           sum += n;
	       }
	       int average = sum / arr2.length;
	       System.out.println(average);
	     
	    }
	    
	    public static void subtract(int num1, int num2, int num3, int num4) {
	        System.out.println(num1 - num2 - num3 - num4);
	    }
	    
	    public static int remainder(int num1, int num2) {
	        return num1 % num2;
	    }
	    
	    public static void add(int num1, int num2) {
	        System.out.println(num1 + num2);
	    }
	    
	    public static void multiply(int num1, int num2, int num3) {
	        System.out.println(num1 * num2 * num3);
	    }
	    
	    public static int divide(int num1, int num2) {
	        return num1 / num2;
	    }
	    
	    public static int cToF(int num) {
	        return (num * 9) / 5 + 32;
	    }
	    
	    public static void condition1(int num1, int num2) {
	        int sum = num1 + num2;
	        if (sum > 50) {
	            System.out.println("Jumanji");
	        }
	    }
	    
	    public static void condition2(int num1, int num2, int num3) {
	        int total = num1 * num2 * num3;
	        if (total % 3 == 0) {
	            System.out.println("ZEBRA");
	        }
	    }
	
}
