// This is a generated file. Not intended for manual editing.
package com.typpplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.typpplugin.psi.TyppTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.typpplugin.psi.*;

public class TyppExpressionImpl extends ASTWrapperPsiElement implements TyppExpression {

  public TyppExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TyppVisitor visitor) {
    visitor.visitExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TyppVisitor) accept((TyppVisitor)visitor);
    else super.accept(visitor);
  }

}
