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

public class TyppPhpCodeImpl extends ASTWrapperPsiElement implements TyppPhpCode {

  public TyppPhpCodeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TyppVisitor visitor) {
    visitor.visitPhpCode(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TyppVisitor) accept((TyppVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TyppExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TyppExpression.class);
  }

}
