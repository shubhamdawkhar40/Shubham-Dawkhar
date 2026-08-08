public class AtoZ {
    public static void main(String[] args) {
        String sr = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a'+ i);
            sr = sr + ch + " ";         //there is so much memory wastage is happening due to strings are immutable
//            System.out.println(ch);   //so every time there is new string created and previous one is deleted
        }                               //by garbage collection java so     "there is wastage of memory"
        System.out.println(sr);
    }
}
