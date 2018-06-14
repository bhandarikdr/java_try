class Parking {
    public static int solution(String E, String L) {
        // write your code in Java SE 8
        int entranceCost = 2;
        int firstHourCost = 3;
        int afterFirstCost = 4;
        String[] eTime = E.split(":");
        String[] lTime = L.split(":");
        int eHour = Integer.parseInt(eTime[0]);
        int lHour = Integer.parseInt(lTime[0]);
        int eMin = Integer.parseInt(eTime[1]);
        int lMin = Integer.parseInt(lTime[1]);
        int hourDiff = lHour - eHour;
        System.out.println(hourDiff);
        int minDiff = lMin - eMin;
        System.out.println(minDiff);
        int totalHour;
        if(minDiff > 0) totalHour = (hourDiff + 1);
        else if(minDiff < 0) totalHour = (hourDiff - 1);
        else totalHour = hourDiff;
        System.out.println(totalHour);
        int cost;
        if (totalHour < 1) cost = entranceCost + firstHourCost;
        else if (totalHour < 2) cost = entranceCost + firstHourCost + (hourDiff*afterFirstCost);
        else cost = entranceCost + firstHourCost + ((totalHour-1)*afterFirstCost);
        return cost; 
    }

     public static void main(String[] args) {
        int ans = solution("10:00", "13:21");
        System.out.println(ans);
     }
}