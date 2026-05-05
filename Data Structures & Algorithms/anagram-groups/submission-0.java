class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str:strs){
            String code = hash(str);
            if(map.containsKey(code)){
                map.get(code).add(str);
            }
            else{
            List<String> innerList = new ArrayList<>();
            innerList.add(str);
            list.add(innerList);
            map.put(code, innerList);
            }
        }
        return list;
    }
        static String hash(String s){
            int[] freq = new int[26];
            for(char c:s.toCharArray())
                freq[c-'a']++;
                return Arrays.toString(freq);
        }
    }
