public class SB_count_letters {

    public static String countLetters(String word){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(word.charAt(0));
        sb.append(ch);
      
        for(int i = 1; i < word.length(); i ++){
            
        Integer count = 1;

            // if(word.charAt(i) == ' ' && i < word.length()){
            //     sb.append(' ');
            //     i ++;
            //     sb.append(Character.toUpperCase(word.charAt(i)));
            // }else{
            //     sb.append(word.charAt(i));
            // }

// Counting the number of repeated letters.

            while(i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count ++;
                i++;
            }

            sb.append(word.charAt(i));

            if(count > 1){
                sb.append(count);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "Balloon door aaaa hiieet";
        System.out.println(countLetters(word));
    }
}
