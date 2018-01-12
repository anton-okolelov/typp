package com.typpplugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.typpplugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TyppFile extends PsiFileBase {
    public TyppFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TyppLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TyppFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Typp File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}