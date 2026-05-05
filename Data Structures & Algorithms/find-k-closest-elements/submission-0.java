class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> {

                int diffA = Math.abs(a - x);
                int diffB = Math.abs(b - x);

                // Larger distance first
                if (diffA == diffB)
                    return b - a;   // larger value first
                return diffB - diffA;
            });

        // Add elements
        for (int num : arr) {
            maxHeap.offer(num);

            // keep only k elements
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Extract result
        List<Integer> result = new ArrayList<>(maxHeap);

        // Required sorted order
        Collections.sort(result);

        return result;
    }
}