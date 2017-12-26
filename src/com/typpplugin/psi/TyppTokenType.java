package com.typpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.typpplugin.TyppLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TyppTokenType extends IElementType {
    public TyppTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TyppLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TyppTokenType." + super.toString();
    }
}
