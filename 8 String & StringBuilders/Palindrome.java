public class Palindrome {
    public static void main(String args[]){
        String sr = "abcddcba";
        boolean pal = true;
        for(int i = 0; i < sr.length()/2; i++){
            if(sr.charAt(i) != sr.charAt(sr.length() - 1 - i)){
                pal = false;
                break;
            }
        }
        if(pal){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
//        for(int i = 0; i <= sr.length()/2; i++){
//            for(int j = sr.length(); j >= sr.length()/2; j--){
//                if(sr.charAt(i) == sr.charAt(j)){
//                    i++;
//                }else{
//                    System.out.println("String is not palindrome");
//                }
//            }
//        }
    }
}
