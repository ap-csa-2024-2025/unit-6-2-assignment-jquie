import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int len = sc.nextInt();
    System.out.println("Enter a value for num:");
    int num = sc.nextInt();

    int[] arr = new int[len];
    System.out.println("Enter values");
    for (int i = 0; i < len; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Contains negative: " + containsNeg(arr));

    System.out.println("Number divisible by three: " + numDivisibleBy3(arr));

    System.out.println("Num divisible by " + num + ": " + numDivisible(arr, num));
  }
  // Problem 1
  public static boolean containsNeg(int[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      if (!(array[i] > 0))
      {
        return true;
      }
    }
    return false;
  }

  //Problem 2
  public static int numDivisibleBy3(int[] array){
    int count = 0;
    for (int i = 0; i < array.length; i++)
    {
      if ((array[i] % 3) == 0)
      {
        count++;
      }
    }
    return count;
  }

  //Problem 3
  public static int numDivisible(int[] array, int num){
    int count = 0;
    for (int i = 0; i < array.length; i++){
      if ((array[i] % num) == 0){
        count++;
      }
    }
    return count;
  }

}
