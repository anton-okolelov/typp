package com.typpplugin;

import com.intellij.lexer.FlexAdapter;

public class TyppLexerAdapter extends FlexAdapter {
    public TyppLexerAdapter() {
        super(new TyppLexer());
    }
}
