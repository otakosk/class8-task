public class Test {
  public static void main(String[] args) {
    int i = Integer.parseInt(args[0]);
    for (int j = 1; j < i; j++) {
    if ((j % 3 == 0) && (j % 5 == 0)) {
      System.out.print("FizzBuzz ");
    } else if (j % 3 == 0) {
         System.out.print("Fizz ");
     }
      else if (j % 5 == 0) {
        System.out.print("Buzz ");
      }
      else {
        System.out.print(j+" ");
      }
    }
    System.out.print(args[0]);
 }
  }