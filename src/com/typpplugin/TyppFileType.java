package com.typpplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.typpplugin.icons.TyppIcons;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class TyppFileType extends LanguageFileType {
    public static final TyppFileType INSTANCE = new TyppFileType();

    private TyppFileType() {
        super(TyppLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Typp file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Typp language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "typp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TyppIcons.FILE;
    }
}