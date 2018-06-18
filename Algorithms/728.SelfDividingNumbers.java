class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<Integer>();
           
        while (left <= right){
            
            String number = String.valueOf(left);
            char[] digits = number.toCharArray();
            boolean temp = false;
            for (char c : digits){
                int digit = Character.getNumericValue(c);
                if (digit == 0){
                    temp = false;
                    break;
                } else if (left % digit != 0){
                    temp = false;
                    break;
                }
                temp = true;
            }
            if (temp){
                result.add(left);
            }
            left++;
        }
        
        return result;
    }
}