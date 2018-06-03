import java.util.HashSet;
public class Solution {

   public static void main(String[] args) {
      int[] myList = {1,2,3};
      int ans = solution(myList);
      System.out.println("Ans is: " + ans);
   }

   public static int solution(int[] myList) {
      int checkValue = 1;
      HashSet<Integer> list = new HashSet<Integer>();
      for(int i=0;i<myList.length;i++) list.add(myList[i]);

      while (list.contains(checkValue)) {
         checkValue++;
      }
      return checkValue;
   }
}