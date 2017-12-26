// This is a generated file. Not intended for manual editing.
package com.typpplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.typpplugin.psi.impl.*;

public interface TyppTypes {

  IElementType EXPRESSION = new TyppElementType("EXPRESSION");
  IElementType PHP_CODE = new TyppElementType("PHP_CODE");

  IElementType HTML_CODE = new TyppTokenType("HTML_CODE");
  IElementType OPERATOR = new TyppTokenType("OPERATOR");
  IElementType PHP_END_TAG = new TyppTokenType("PHP_END_TAG");
  IElementType PHP_TAG = new TyppTokenType("PHP_TAG");
  IElementType SEMICOLON = new TyppTokenType("SEMICOLON");
  IElementType STRING_LITERAL = new TyppTokenType("STRING_LITERAL");
  IElementType WHITESPACE = new TyppTokenType("WHITESPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == EXPRESSION) {
        return new TyppExpressionImpl(node);
      }
      else if (type == PHP_CODE) {
        return new TyppPhpCodeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
