class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: s1.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        int need = freq.size();
        for(int i = 0; i < s2.length(); i++){
            HashMap<Character,Integer> windowFreq = new HashMap<>();
            int cur = 0;
            for(int j = i; j < s2.length(); j++){
                char c = s2.charAt(j);
                windowFreq.put(c,windowFreq.getOrDefault(c,0) + 1);
                if(freq.getOrDefault(c,0) < windowFreq.get(c)){
                    break;
                }
                if(freq.getOrDefault(c,0) == windowFreq.get(c)){
                    cur++;
                }
                if(cur == need){
                    return true;
                }
            }
        }
        return false;
    }
}
