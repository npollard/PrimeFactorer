import java.util.*;

public class PrimeFactorer {

  public static ArrayList<Integer> generate(int n) {
    ArrayList<Integer> res = new ArrayList();
    boolean pf;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        pf = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            pf = false;
          }
        }
        if (pf) { 
          res.add(i);
        }
      }
    }
    return res;
  }

  public static void main(String args[]) {
    ArrayList<Integer> result = PrimeFactorer.generate(1);
    ArrayList<Integer> answer = new ArrayList();
    if (result.equals(answer)) {
      System.out.println("generate(1) PASSES!");
    } else {
      System.out.println("generate(1) FAILS:");
      System.out.println(result);
    }

    result = PrimeFactorer.generate(30);
    answer.add(2);
    answer.add(3);
    answer.add(5);
     if (result.equals(answer)) {
      System.out.println("generate(30) PASSES!\n\n");
    } else {
      System.out.println("generate(30) FAILS:");
      System.out.println(result);
    }
  }

}
