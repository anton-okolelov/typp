// This is a generated file. Not intended for manual editing.
package com.typpplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.typpplugin.psi.TyppTypes.*;
import static com.typpplugin.parser.TyppParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TyppParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == PHP_CODE) {
      r = php_code(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return typpFile(b, l + 1);
  }

  /* ********************************************************** */
  // WHITESPACE? ECHO WHITESPACE STRING_LITERAL WHITESPACE? SEMICOLON
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    if (!nextTokenIs(b, "<expression>", ECHO, WHITESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    r = r && consumeTokens(b, 0, ECHO, WHITESPACE, STRING_LITERAL);
    r = r && expression_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHITESPACE?
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  // WHITESPACE?
  private static boolean expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_4")) return false;
    consumeToken(b, WHITESPACE);
    return true;
  }

  /* ********************************************************** */
  // PHP_TAG expression* PHP_END_TAG?
  public static boolean php_code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "php_code")) return false;
    if (!nextTokenIs(b, PHP_TAG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PHP_TAG);
    r = r && php_code_1(b, l + 1);
    r = r && php_code_2(b, l + 1);
    exit_section_(b, m, PHP_CODE, r);
    return r;
  }

  // expression*
  private static boolean php_code_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "php_code_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "php_code_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // PHP_END_TAG?
  private static boolean php_code_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "php_code_2")) return false;
    consumeToken(b, PHP_END_TAG);
    return true;
  }

  /* ********************************************************** */
  // (HTML_CODE|php_code)*
  static boolean typpFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typpFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!typpFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typpFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // HTML_CODE|php_code
  private static boolean typpFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typpFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HTML_CODE);
    if (!r) r = php_code(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
