public class TestArray {

   public static void main(String[] args) {
      int[] myList = {-100,-5,-2100,-2,-1,-4};
      solution(myList);
   }

   public static void solution(int[] myList) {
      int checkValue = 1;
      for (int i = 1; i < myList.length; i++) {
         int bingo = checkArray(myList, checkValue);
         if(bingo == 0) {
            System.out.println("Ans is: " + checkValue);
            break;
         }
         else checkValue = checkValue + 1; 
      }
   }

   public static int checkArray(int[] myList, int val) {
      int res = 0;
      for (int i = 1; i < myList.length; i++) {
         if(val == myList[i])
            res = 1;
      }
      return res;
   } 
}