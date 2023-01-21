package String;
import java.util.*;
import java.io.*;
public class StringRotation {// Java program for Left Rotation and Right
	// Rotation of a String
			
		// function that rotates s towards left by d
		static String leftrotate(String str, int d)
		{
				String ans = str.substring(d) + str.substring(0, d)+str.substring(0,4);
				return ans;
		}

		// function that rotates s towards right by d
		static String rightrotate(String str, int d)
		{
				return leftrotate(str, str.length() - d);
		}

		// Driver code
		public static void main(String args[])
		{
				String str1 = "keshav is a goog";
				//String[] st = str1.split(" ");
				System.out.println(leftrotate(str1, 2));

				String str2 = "apeksha";
				System.out.println(rightrotate(str2, 2));
		}
}
