import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameIndexMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameIndexMap.put(name[i], yearning[i]);
        }
        int[]score = new int[photo.length];
        int i=0;
        for (String[] p : photo) {
            for(String s : p){
                if(nameIndexMap.get(s)!=null) score[i]+=nameIndexMap.get(s);
            }
            i++;
        }
        return score;
    }
}