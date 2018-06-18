class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for (char move : moves.toCharArray()){
            if (move == 'U') y++;
            if (move == 'D') y--;
            if (move == 'L') x--;
            if (move == 'R') x++;
        }
        
        if (x == 0 && y == 0){
            return true;
        } else {
            return false;
        }
    }
}