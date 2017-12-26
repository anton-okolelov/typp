package com.typpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.typpplugin.TyppLanguage;
import org.jetbrains.annotations.*;

public class TyppElementType extends IElementType {
    public TyppElementType(@NotNull @NonNls String debugName) {
        super(debugName, TyppLanguage.INSTANCE);
    }
}




