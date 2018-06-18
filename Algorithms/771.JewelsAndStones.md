class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int counter = 0;
        for (char c : J.toCharArray()){
            for (char v : S.toCharArray()){
                if (c == v){
                    counter++;
                }
            }
        }
        return counter;
    }
}