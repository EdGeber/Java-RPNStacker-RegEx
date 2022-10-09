package stacker.rpn.lexer;

public class Regex {
    private static final String OP_REGEX = "(\\+|-|\\*|/)";
    private static final String PLUS_REGEX = "(\\+)";
    private static final String MINUS_REGEX = "(-)";
    private static final String STAR_REGEX = "(\\*)";
    private static final String SLASH_REGEX = "(/)";
    private static final String NUM_REGEX = "(\\d)+";

    public static boolean isOp(String s) {
        return s.matches(OP_REGEX);
    }
    public static boolean isPlus(String s) {
        return s.matches(PLUS_REGEX);
    }
    public static boolean isMinus(String s) {
        return s.matches(MINUS_REGEX);
    }
    public static boolean isStar(String s) {
        return s.matches(STAR_REGEX);
    }
    public static boolean isSlash(String s) {
        return s.matches(SLASH_REGEX);
    }
    public static boolean isNum(String s) {
        return s.matches(NUM_REGEX);
    }
}
