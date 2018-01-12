package compiler;

import com.typpplugin.TyppLexerAdapter;

public class Compiler {
    public static void main(String[] args) {
        TyppLexerAdapter adapter = new TyppLexerAdapter();
        CharSequence seq = "test";

        adapter.start(seq);
    }
}
