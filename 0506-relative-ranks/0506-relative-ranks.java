class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        String answer[] = new String[score.length];
        for(int i=0;i<score.length;i++){
            pq.offer(new int[]{score[i],i});
        }
        int i=1;
        while(!pq.isEmpty()){
            int []temp = pq.poll();
            if(i==1){
                answer[temp[1]]="Gold Medal";
            }
            else if(i==2){
                answer[temp[1]]="Silver Medal";
            }
            else if(i==3){
                answer[temp[1]]="Bronze Medal";
            }
            else{
                answer[temp[1]]=Integer.toString(i);
            }
            i++;
        }
        return answer;
    }
}