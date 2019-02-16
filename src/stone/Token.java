package stone;

public abstract class Token {
    public static final Token EOF= new Token(-1){};
    private int lineNumber;

    protected Token(int line)
    {
        lineNumber=line;
    }
}
