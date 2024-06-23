public class StringBuilderCapital {

    public static String Capitalize_first(String word){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(word.charAt(0));
        sb.append(ch);
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == ' ' && i < word.length() - 1){
                sb.append(' ');
                i ++;
                sb.append(Character.toUpperCase(word.charAt(i)));
            }else{
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String word = "this is anish.";
        System.out.println(Capitalize_first(word));
    }
}
