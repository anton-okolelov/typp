package com.typpplugin;

import com.intellij.lang.Language;


public class TyppLanguage extends Language {
    public static final TyppLanguage INSTANCE = new TyppLanguage();

    private TyppLanguage() {
        super("Typp");
    }
}