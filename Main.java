class Main 
{
  public static void main(String[] args) 
  {
    String [] words2 = {"apple", "banana", "peach", "cherries", "blueberries"};

// for each loop printing each fruit

    for(String fruit : words2)
    {
      System.out.print(fruit + " ");
    }

  System.out.println(" ");

// for each loop printing only fruits with 5 letters
    for(String fruit : words2)
    {
      if(fruit.length() == 5)
      System.out.print(fruit + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    for(int i = 0; i<words2.length; i++)
    {
      String first = words2[i].substring(0,1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index Value " + i + ": " + words2[i] + " " + first + " " + last);
    }

    System.out.println(" ");
    System.out.println(" ");

// insertion shifting elements to the right in order to replace a value in a position
// you lose the last element in the array

    int [] nums = {12,65,80,70,34,22};

    for(int i = nums.length-1; i>3; i--){
      nums[i] = nums[i-1];
    }

    nums[3] = 99;

    for(int i = 0; i<nums.length; i++){
      System.out.print(nums[i] + " ");
    }

    System.out.println();
    System.out.println();

// deletion: moving a value from the middle of an array
// this shifts elements to the right and also keeps the last element still in its place (but you could replace the last element with a 0 or something)

    for(int i = 2; i<nums.length-1; i++){
      nums [i] = nums[i+1];
    }

    for(int i = 0; i<nums.length; i++){
      System.out.print(nums[i] + " ");
    }

    System.out.println();
    System.out.println();

//shifting to the left: moving the first element to the end of the array. uses a variable as a temporary holding spot

    int [] nums2 = {1, 2, 3, 4};

    int temp = nums2[0] ; 

    
    for(int i = 0; i < nums2.length - 1; i++)
    {
      nums2[i] = nums2[i +1 ];
    }

    nums2[nums2.length - 1] = temp ; 

    for( int i = 0 ; i < nums2.length ; i ++)
    {
      System.out.print(nums2[i] + " "); 
    }

// shifting to the right: like insertion but moving the last element to the front of the array
    
    System.out.println();
    System.out.println();

    int [] nums3 = {1, 2, 3, 4};

    int temp2 = nums3[nums3.length - 1] ; 

    for(int i = nums3.length - 1; i > 0 ; i--)
    {
      nums3[i] = nums3[i - 1];
    }

    nums3[0] = temp2 ; 

    for( int i = 0 ; i < nums3.length ; i ++)
    {
      System.out.print(nums3[i] + " "); 
    }

    // reversing the elements: think of a=b b=c so a=c. to switch around element in an array, you need a temporary variable. you use the swap algorithm inside a for loop

    System.out.println();
    System.out.println();

    int [] nums4 = {1, 2, 3, 4};

    for(int i = 0 ; i < nums4.length/2 ; i++)
    {

        int j = nums4.length - i - 1 ; 
        int temp3 = nums4[i] ; 
        nums4[i] = nums4[j] ; 
        nums4[j] = temp3 ; 

    }
    
    for( int i = 0 ; i < nums4.length ; i ++)
    {
      System.out.print(nums4[i] + " "); 
    }

    System.out.println();

// using the for-each loop to find an average
// here we also use the printf command. this is a way to print data in a specific format, like date and time or float and double

int [] numss = {12, 65, 80, 70, 34, 22} ;
int sum = 0 ;
for (int x : numss)
{
  sum += x ; 
}

System.out.print ("The average of nums is ");

System.out.printf("%.1f%n",((double)sum/nums.length));

// here, .1f represents how many decimal places we want on the output
  } 
}  



