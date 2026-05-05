class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> count = new HashMap<>();
        for(char c:text.toCharArray()){
            if("balon".indexOf(c) != -1){
            count.put(c,count.getOrDefault(c,0)+1);
            }
        }
        if(count.size() < 5){
            return 0;
        }
        count.put('l', count.get('l')/2);
        count.put('o', count.get('o')/2);
        return Collections.min(count.values());
    }
}