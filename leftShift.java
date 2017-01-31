import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftShift {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums = s.nextInt();
        int shifts = s.nextInt();
        int[] arr = new int[nums];
        for (int i = 0; i < nums; i++) {
            arr[i] = s.nextInt();
        }
        int[] temparr = new int[nums];
        if (shifts < nums/2) {
        for (int b = 0; b < shifts; b++) {
            for (int c = 0; c < nums-1; c++) {
                temparr[c] = arr[c+1];
            }
            temparr[nums-1] = arr[0];
            for (int i = 0; i < nums; i++) {
              arr[i] = temparr[i];
            }
          }
        } else {
            shifts = nums-shifts;
            // right shifts instead
          for (int b = 0; b < shifts; b++) {
            for (int c = 1; c < nums; c++) {
              temparr[c] = arr[c-1];
            }
            temparr[0] = arr[nums-1];
            for (int i = 0; i < nums; i++) {
              arr[i] = temparr[i];
            }
          }
        }
        for (int j = 0; j < nums; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
