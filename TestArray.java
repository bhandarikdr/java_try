public class TestArray {

   public static void main(String[] args) {
      int[] myList = {1,2,3};
      int ans = solution(myList);
      System.out.println("Ans is: " + ans);
   }

   public static int solution(int[] myList) {
      int checkValue = 1;
      for (int i = 0; i < myList.length+1; i++) {
         int bingo = checkArray(myList, checkValue);
         if(bingo == 0){
            return checkValue;
         }                        
         else checkValue = checkValue + 1; 
      }
      return 0;
   }

   public static int checkArray(int[] myList, int val) {
      int res = 0;
      for (int i = 0; i < myList.length; i++) {
         if(val == myList[i])
            res = 1;
      }
      return res;
   } 
}