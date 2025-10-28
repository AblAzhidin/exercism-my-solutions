import java.util.Map;

class SqueakyClean {

    private static Map<Character, Character> map = Map.of( '4', 'a', '3', 'e','0',
            'o', '1', 'l', '7', 't');
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean prevHyphen = false;
        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);
            if (ch == '-') {
                prevHyphen = true;
                continue;
            }
            ch = Character.isWhitespace(ch) ? '_' : ch;
            ch = map.getOrDefault(ch, ch);
            ch = prevHyphen ? Character.toUpperCase(ch) : ch;
            if (Character.isLetter(ch) || ch == '_') {
                sb.append(ch);
            }
            prevHyphen = false;
        }

        return sb.toString();
    }
}
