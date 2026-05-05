class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:stones){
            minHeap.offer(-num);
        }
        while(minHeap.size() > 1){
            int firstL  = minHeap.poll();
            int secondL = minHeap.poll();
            if(secondL > firstL){
                minHeap.offer(firstL - secondL);
            }
        }
        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
