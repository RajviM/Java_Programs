import java.util.Scanner;

public class Solution {
   
   public static void main(String [] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter String");
	   String s=sc.next();
	   int count=0;
	   int start=0;
	   int end = s.length()-1;
	   for(int i=0;i<s.length();i++)
	   {
		   //For odd
		   int r=1;
		  count++;
		  System.out.println(s.charAt(i));
		  // for odd
		   while(true)
		   {
			   int startIndex=i-r;
			   int endIndex=i+r;
			   if(startIndex>=start && endIndex<=end)
			   {
				   r++;
				   if(s.charAt(startIndex)==s.charAt(endIndex))
				   {
					   System.out.println(s.substring(startIndex,endIndex+1));
					   count++;
				   }else break;
			   }
			   else break;
			   
			}
		   
		   r=1;
		   //for even
		   
		   while(true)
		   {
			   int startIndex=i-r+1;
			   int endIndex=i+r;
			   if(startIndex>=start && endIndex<=end)
			   {
				   r++;
				   if(s.charAt(startIndex)==s.charAt(endIndex))
				   {
					   System.out.println(s.substring(startIndex,endIndex+1));
					   count++;
				   }else break;
				   
			   } else break;
			   
		   }
		   
		   
		   
	   }
	   System.out.println(" No of Palindromes "+count);
   }
}
