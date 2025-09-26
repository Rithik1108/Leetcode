class Solution {
    public String frequencySort(String s) {
        TreeMap<String,Integer> map = new TreeMap<>();
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<s.length();i++){
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                map.put(String.valueOf(s.charAt(i)),map.get(String.valueOf(s.charAt(i)))+1);
            }
            else{
                map.put(String.valueOf(s.charAt(i)),1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){

            result.append(pq.peek().getKey().repeat(pq.poll().getValue()));
        }
        return result.toString();
    }
}