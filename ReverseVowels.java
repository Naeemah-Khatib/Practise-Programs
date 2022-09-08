// Reverse order of vowels in strings

class Solution {
    public String reverseVowels(String s) {
        
        int l = 0, r = s.length()-1;
        Set<Character> set = new TreeSet<>();
        set.add('a'); set.add('e');
        set.add('i'); set.add('o');
        set.add('u'); 
        set.add('A'); set.add('E');
        set.add('I'); set.add('O');
        set.add('U'); 
        char[] c = s.toCharArray();
        
        while(l<r){
            if(set.contains(c[l]) && set.contains(c[r])){
                char t = c[l];
                c[l] = c[r];
                c[r] = t;
                l++; r--;
            }
            else if(set.contains(c[l])){
                r--;
            }
            else if(set.contains(c[r])){
                l++;
            }
            else{
                l++; r--;
            }
        }
        
        return String.valueOf(c);
    }
}
