import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] A) {
      int[] counters = new int[N];
      int k = 0;
      int currentMax = 0;
      int allMax = 0;
      for(int i = 0; i< A.length; i++) {
          k = A[i];
          if (k == N + 1){
              allMax = currentMax;
          }else{
              int newCounterValue = (counters[k - 1] < allMax) ? allMax + 1 : counters[k - 1] + 1;
              counters[k - 1] = newCounterValue;
              if (newCounterValue  > currentMax){
                  currentMax = newCounterValue;
              }
          }
      }
      return maximizeCounter(counters, allMax);
    }
    public int[] maximizeCounter(int[] counters, int currentMax){
      for(int i = 0; i < counters.length; i++){
          if(counters[i] < currentMax) {
              counters[i] = currentMax;
          }
      }
      return counters;
    }
}
