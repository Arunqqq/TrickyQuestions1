1.Take 10 integer inputs from user and store them in an array and print them on screen
Ans 1. import java.util.Scanner;
       class PracticeArray1 {

	    public static void main(String[] args) {
		int user;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of user inputs:");
        user=scn.nextInt();
        if(user<=0) {
        	System.out.println("Not valid");
        }
        int array[] = new int[10];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<user;i++) {
        array[i]=scn.nextInt();
        }
        System.out.print("Elements of the array are:");
        for(int i=0;i<user;i++)
        {
            System.out.print(array[i]+"\t");
        }
       
	}

}

2.Take 10 integer inputs from user and store them in an array.
Again ask user to enter a number and Now, tell user to check whether that number is
present in array or not ?
Ans 2:import java.util.Scanner;
      class PracticeArray2 {

	  public static void main(String[] args) {
		int user,num;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of user inputs:");
	    user=scn.nextInt();
	    int array[] = new int[10];
	    System.out.print("Enter the elements of the array:");
	    for( int i=0;i<user;i++) {
	    array[i]=scn.nextInt();
	    }
        System.out.println("Enter a number:");
        num=scn.nextInt(); 
        for(int i=0;i<user;i++)
        {
       if( array[i] == num) {
        System.out.println("Number is present in array");
       }
       else {
    	   System.out.println("Number is not  present in array");
        }
      
}
	}
}

3.Take 20 integer inputs from user and put them in array and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
Ans 3:import java.util.Scanner;
      class PracticeArray3 {

	   public static void main(String[] args) {
		int user;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of user inputs:");
        user=scn.nextInt();
        int[] array = new int[20];
        int pos=0;
        int neg=0;
        int odd=0;
        int even=0;
        int zero=0;
	    System.out.print("Enter the elements of the array:");
	    for( int i=0;i<user;i++) {
		    array[i]=scn.nextInt();
        if(array[i]>0) {
        	pos++;
        }
        else if(array[i]<0) {
        	neg++;
        }
        else {
        	zero++;
        }
        if(array[i]%2==0) {
        	even++;
        }
        else {
        	odd++;
        }
	    }
	    System.out.println("Positive numbers are:"+pos+"\nNegative numbers are:"+neg+"\nZero's are:"
	    +zero+"\nNumber of even numbers are:"+even+"\nNumber of odd numbers are:"+odd);
	}
}

4.Take 10 integer inputs from user and store them in an array. Now, copy all the elements
is an another array but in reverse order.
Ans 4:  import java.util.Scanner;
        public class PracticeArray4 {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] rev = new int[10];
		System.out.print("Enter the elements of the array:");
	    for( int i=0;i<arr.length;i++) {
	    arr[i]=sc.nextInt();
	    }
	    System.out.print("Elements of the array are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
		int j=0;
		for(int i=rev.length-1;i>=0;i--) {
			rev[i] = arr[j];
			j++;
		}
		System.out.print("\nElements after reversing are:");
		 for(int i=0;i<rev.length;i++)
	        {
	            System.out.print(rev[i]+"\t");
	        }
		}

	}

5.Write a program to check if elements of an array are same or not it read from front or back
Ans 5:int[] a = {2,3,15,14,3,2}
      class PracticeArray5 {
	  public static void main(String[] args) {
		int[] a = {2,3,15,15,3,2};
		boolean read = true;
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			if(a[i]!=a[j]) {
				read=false;
				break;
			}
			else
				j--;
		}
			System.out.println(read);
	
	}

}
