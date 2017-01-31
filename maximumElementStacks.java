import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maximumElementStacks {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s = new Scanner(System.in);
    Stack smoke = new Stack();
    int numQuery = s.nextInt();
    int max = 0;
    for (int i = 0; i < numQuery; i++) {
      int cat = s.nextInt();
      if (cat == 1) {
        
        smoke.push(s.nextInt());
        if ((int)smoke.peek() > max) {
          max = (int)smoke.peek();
        }
      } else if (cat == 2) {
        if (max == (int)smoke.peek()) {
          smoke.pop();
          max = 0;
          for (int j = 0; j < smoke.size(); j++) {
            if ((int)smoke.elementAt(j) > max) {
              max = (int)smoke.elementAt(j);
            }
          }
        } else {
          smoke.pop();
        }
        //System.out.println(smoke.peek());
      } else {
        
        System.out.println(max);
      }
    }
  }
}