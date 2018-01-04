package com.typpplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.typpplugin.psi.TyppTypes;
import com.intellij.psi.TokenType;

%%

%{
      public TyppLexer() {
        this((java.io.Reader)null);
      }
%}

%class TyppLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE=[\ \n\r\t]
PHP_TAG=<?php

%state WAITING_VALUE

%%

<YYINITIAL> {WHITE_SPACE}                           { yybegin(YYINITIAL); return TyppTypes.WHITESPACE; }

<YYINITIAL> {PHP_TAG}                                { yybegin(YYINITIAL); return TyppTypes.PHP_TAG; }

//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return TyppTypes.SEPARATOR; }

//
//<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//
//<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
//
//<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return TyppTypes.VALUE; }
//
//({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//
//.                                                           { return TokenType.BAD_CHARACTER; }
