/* The following code was generated by JFlex 1.6.1 */

package co.edu.eafit.dis.st0270.s20172.w7.lexer;

import java_cup.runtime.*;
import co.edu.eafit.dis.st0270.s20172.w7.parser.W7Sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/Jquiro12/Documents/Compilator_Project/W7/w7/src/main/jflex/lexer.jflex</tt>
 */
class W7Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\17\1\1\1\2\1\36\1\36\1\3\16\17\4\0\1\1\3\0"+
    "\1\16\3\0\1\34\1\35\1\32\1\30\1\0\1\31\1\0\1\33"+
    "\1\5\11\4\2\0\1\25\1\27\1\26\2\0\2\16\1\24\11\16"+
    "\1\23\2\16\1\21\1\16\1\22\1\20\7\16\4\0\1\16\1\0"+
    "\1\10\7\16\1\14\3\16\1\12\1\15\1\16\1\11\2\16\1\6"+
    "\3\16\1\7\1\13\2\16\4\0\6\17\1\37\32\17\2\0\4\16"+
    "\4\0\1\16\2\0\1\17\7\0\1\16\4\0\1\16\5\0\27\16"+
    "\1\0\37\16\1\0\u01ca\16\4\0\14\16\16\0\5\16\7\0\1\16"+
    "\1\0\1\16\21\0\160\17\5\16\1\0\2\16\2\0\4\16\10\0"+
    "\1\16\1\0\3\16\1\0\1\16\1\0\24\16\1\0\123\16\1\0"+
    "\213\16\1\0\5\17\2\0\236\16\11\0\46\16\2\0\1\16\7\0"+
    "\47\16\7\0\1\16\1\0\55\17\1\0\1\17\1\0\2\17\1\0"+
    "\2\17\1\0\1\17\10\0\33\16\5\0\3\16\15\0\5\17\6\0"+
    "\1\16\4\0\13\17\5\0\53\16\37\17\4\0\2\16\1\17\143\16"+
    "\1\0\1\16\10\17\1\0\6\17\2\16\2\17\1\0\4\17\2\16"+
    "\12\17\3\16\2\0\1\16\17\0\1\17\1\16\1\17\36\16\33\17"+
    "\2\0\131\16\13\17\1\16\16\0\12\17\41\16\11\17\2\16\4\0"+
    "\1\16\5\0\26\16\4\17\1\16\11\17\1\16\3\17\1\16\5\17"+
    "\22\0\31\16\3\17\104\0\1\16\1\0\13\16\67\0\33\17\1\0"+
    "\4\17\66\16\3\17\1\16\22\17\1\16\7\17\12\16\2\17\2\0"+
    "\12\17\1\0\7\16\1\0\7\16\1\0\3\17\1\0\10\16\2\0"+
    "\2\16\2\0\26\16\1\0\7\16\1\0\1\16\3\0\4\16\2\0"+
    "\1\17\1\16\7\17\2\0\2\17\2\0\3\17\1\16\10\0\1\17"+
    "\4\0\2\16\1\0\3\16\2\17\2\0\12\17\4\16\7\0\1\16"+
    "\5\0\3\17\1\0\6\16\4\0\2\16\2\0\26\16\1\0\7\16"+
    "\1\0\2\16\1\0\2\16\1\0\2\16\2\0\1\17\1\0\5\17"+
    "\4\0\2\17\2\0\3\17\3\0\1\17\7\0\4\16\1\0\1\16"+
    "\7\0\14\17\3\16\1\17\13\0\3\17\1\0\11\16\1\0\3\16"+
    "\1\0\26\16\1\0\7\16\1\0\2\16\1\0\5\16\2\0\1\17"+
    "\1\16\10\17\1\0\3\17\1\0\3\17\2\0\1\16\17\0\2\16"+
    "\2\17\2\0\12\17\1\0\1\16\17\0\3\17\1\0\10\16\2\0"+
    "\2\16\2\0\26\16\1\0\7\16\1\0\2\16\1\0\5\16\2\0"+
    "\1\17\1\16\7\17\2\0\2\17\2\0\3\17\10\0\2\17\4\0"+
    "\2\16\1\0\3\16\2\17\2\0\12\17\1\0\1\16\20\0\1\17"+
    "\1\16\1\0\6\16\3\0\3\16\1\0\4\16\3\0\2\16\1\0"+
    "\1\16\1\0\2\16\3\0\2\16\3\0\3\16\3\0\14\16\4\0"+
    "\5\17\3\0\3\17\1\0\4\17\2\0\1\16\6\0\1\17\16\0"+
    "\12\17\11\0\1\16\7\0\3\17\1\0\10\16\1\0\3\16\1\0"+
    "\27\16\1\0\12\16\1\0\5\16\3\0\1\16\7\17\1\0\3\17"+
    "\1\0\4\17\7\0\2\17\1\0\2\16\6\0\2\16\2\17\2\0"+
    "\12\17\22\0\2\17\1\0\10\16\1\0\3\16\1\0\27\16\1\0"+
    "\12\16\1\0\5\16\2\0\1\17\1\16\7\17\1\0\3\17\1\0"+
    "\4\17\7\0\2\17\7\0\1\16\1\0\2\16\2\17\2\0\12\17"+
    "\1\0\2\16\17\0\2\17\1\0\10\16\1\0\3\16\1\0\51\16"+
    "\2\0\1\16\7\17\1\0\3\17\1\0\4\17\1\16\10\0\1\17"+
    "\10\0\2\16\2\17\2\0\12\17\12\0\6\16\2\0\2\17\1\0"+
    "\22\16\3\0\30\16\1\0\11\16\1\0\1\16\2\0\7\16\3\0"+
    "\1\17\4\0\6\17\1\0\1\17\1\0\10\17\22\0\2\17\15\0"+
    "\60\16\1\17\2\16\7\17\4\0\10\16\10\17\1\0\12\17\47\0"+
    "\2\16\1\0\1\16\2\0\2\16\1\0\1\16\2\0\1\16\6\0"+
    "\4\16\1\0\7\16\1\0\3\16\1\0\1\16\1\0\1\16\2\0"+
    "\2\16\1\0\4\16\1\17\2\16\6\17\1\0\2\17\1\16\2\0"+
    "\5\16\1\0\1\16\1\0\6\17\2\0\12\17\2\0\4\16\40\0"+
    "\1\16\27\0\2\17\6\0\12\17\13\0\1\17\1\0\1\17\1\0"+
    "\1\17\4\0\2\17\10\16\1\0\44\16\4\0\24\17\1\0\2\17"+
    "\5\16\13\17\1\0\44\17\11\0\1\17\71\0\53\16\24\17\1\16"+
    "\12\17\6\0\6\16\4\17\4\16\3\17\1\16\3\17\2\16\7\17"+
    "\3\16\4\17\15\16\14\17\1\16\17\17\2\0\46\16\1\0\1\16"+
    "\5\0\1\16\2\0\53\16\1\0\u014d\16\1\0\4\16\2\0\7\16"+
    "\1\0\1\16\1\0\4\16\2\0\51\16\1\0\4\16\2\0\41\16"+
    "\1\0\4\16\2\0\7\16\1\0\1\16\1\0\4\16\2\0\17\16"+
    "\1\0\71\16\1\0\4\16\2\0\103\16\2\0\3\17\40\0\20\16"+
    "\20\0\125\16\14\0\u026c\16\2\0\21\16\1\0\32\16\5\0\113\16"+
    "\3\0\3\16\17\0\15\16\1\0\4\16\3\17\13\0\22\16\3\17"+
    "\13\0\22\16\2\17\14\0\15\16\1\0\3\16\1\0\2\17\14\0"+
    "\64\16\40\17\3\0\1\16\3\0\2\16\1\17\2\0\12\17\41\0"+
    "\3\17\2\0\12\17\6\0\130\16\10\0\51\16\1\17\1\16\5\0"+
    "\106\16\12\0\35\16\3\0\14\17\4\0\14\17\12\0\12\17\36\16"+
    "\2\0\5\16\13\0\54\16\4\0\21\17\7\16\2\17\6\0\12\17"+
    "\46\0\27\16\5\17\4\0\65\16\12\17\1\0\35\17\2\0\13\17"+
    "\6\0\12\17\15\0\1\16\130\0\5\17\57\16\21\17\7\16\4\0"+
    "\12\17\21\0\11\17\14\0\3\17\36\16\15\17\2\16\12\17\54\16"+
    "\16\17\14\0\44\16\24\17\10\0\12\17\3\0\3\16\12\17\44\16"+
    "\122\0\3\17\1\0\25\17\4\16\1\17\4\16\3\17\2\16\11\0"+
    "\300\16\47\17\25\0\4\17\u0116\16\2\0\6\16\2\0\46\16\2\0"+
    "\6\16\2\0\10\16\1\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\37\16\2\0\65\16\1\0\7\16\1\0\1\16\3\0\3\16\1\0"+
    "\7\16\3\0\4\16\2\0\6\16\4\0\15\16\5\0\3\16\1\0"+
    "\7\16\16\0\5\17\30\0\1\36\1\36\5\17\20\0\2\16\23\0"+
    "\1\16\13\0\5\17\5\0\6\17\1\0\1\16\15\0\1\16\20\0"+
    "\15\16\3\0\33\16\25\0\15\17\4\0\1\17\3\0\14\17\21\0"+
    "\1\16\4\0\1\16\2\0\12\16\1\0\1\16\3\0\5\16\6\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\4\16\1\0\13\16\2\0"+
    "\4\16\5\0\5\16\4\0\1\16\21\0\51\16\u0a77\0\57\16\1\0"+
    "\57\16\1\0\205\16\6\0\4\16\3\17\2\16\14\0\46\16\1\0"+
    "\1\16\5\0\1\16\2\0\70\16\7\0\1\16\17\0\1\17\27\16"+
    "\11\0\7\16\1\0\7\16\1\0\7\16\1\0\7\16\1\0\7\16"+
    "\1\0\7\16\1\0\7\16\1\0\7\16\1\0\40\17\57\0\1\16"+
    "\u01d5\0\3\16\31\0\11\16\6\17\1\0\5\16\2\0\5\16\4\0"+
    "\126\16\2\0\2\17\2\0\3\16\1\0\132\16\1\0\4\16\5\0"+
    "\51\16\3\0\136\16\21\0\33\16\65\0\20\16\u0200\0\u19b6\16\112\0"+
    "\u51cd\16\63\0\u048d\16\103\0\56\16\2\0\u010d\16\3\0\20\16\12\17"+
    "\2\16\24\0\57\16\1\17\4\0\12\17\1\0\31\16\7\0\1\17"+
    "\120\16\2\17\45\0\11\16\2\0\147\16\2\0\4\16\1\0\4\16"+
    "\14\0\13\16\115\0\12\16\1\17\3\16\1\17\4\16\1\17\27\16"+
    "\5\17\20\0\1\16\7\0\64\16\14\0\2\17\62\16\21\17\13\0"+
    "\12\17\6\0\22\17\6\16\3\0\1\16\4\0\12\17\34\16\10\17"+
    "\2\0\27\16\15\17\14\0\35\16\3\0\4\17\57\16\16\17\16\0"+
    "\1\16\12\17\46\0\51\16\16\17\11\0\3\16\1\17\10\16\2\17"+
    "\2\0\12\17\6\0\27\16\3\0\1\16\1\17\4\0\60\16\1\17"+
    "\1\16\3\17\2\16\2\17\5\16\2\17\1\16\1\17\1\16\30\0"+
    "\3\16\2\0\13\16\5\17\2\0\3\16\2\17\12\0\6\16\2\0"+
    "\6\16\2\0\6\16\11\0\7\16\1\0\7\16\221\0\43\16\10\17"+
    "\1\0\2\17\2\0\12\17\6\0\u2ba4\16\14\0\27\16\4\0\61\16"+
    "\u2104\0\u016e\16\2\0\152\16\46\0\7\16\14\0\5\16\5\0\1\16"+
    "\1\17\12\16\1\0\15\16\1\0\5\16\1\0\1\16\1\0\2\16"+
    "\1\0\2\16\1\0\154\16\41\0\u016b\16\22\0\100\16\2\0\66\16"+
    "\50\0\15\16\3\0\20\17\20\0\7\17\14\0\2\16\30\0\3\16"+
    "\31\0\1\16\6\0\5\16\1\0\207\16\2\0\1\17\4\0\1\16"+
    "\13\0\12\17\7\0\32\16\4\0\1\16\1\0\32\16\13\0\131\16"+
    "\3\0\6\16\2\0\6\16\2\0\6\16\2\0\3\16\3\0\2\16"+
    "\3\0\2\16\22\0\3\17\4\0\14\16\1\0\32\16\1\0\23\16"+
    "\1\0\2\16\1\0\17\16\2\0\16\16\42\0\173\16\105\0\65\16"+
    "\210\0\1\17\202\0\35\16\3\0\61\16\57\0\37\16\21\0\33\16"+
    "\65\0\36\16\2\0\44\16\4\0\10\16\1\0\5\16\52\0\236\16"+
    "\2\0\12\17\u0356\0\6\16\2\0\1\16\1\0\54\16\1\0\2\16"+
    "\3\0\1\16\2\0\27\16\252\0\26\16\12\0\32\16\106\0\70\16"+
    "\6\0\2\16\100\0\1\16\3\17\1\0\2\17\5\0\4\17\4\16"+
    "\1\0\3\16\1\0\33\16\4\0\3\17\4\0\1\17\40\0\35\16"+
    "\203\0\66\16\12\0\26\16\12\0\23\16\215\0\111\16\u03b7\0\3\17"+
    "\65\16\17\17\37\0\12\17\20\0\3\17\55\16\13\17\2\0\1\17"+
    "\22\0\31\16\7\0\12\17\6\0\3\17\44\16\16\17\1\0\12\17"+
    "\100\0\3\17\60\16\16\17\4\16\13\0\12\17\u04a6\0\53\16\15\17"+
    "\10\0\12\17\u0936\0\u036f\16\221\0\143\16\u0b9d\0\u042f\16\u33d1\0\u0239\16"+
    "\u04c7\0\105\16\13\0\1\16\56\17\20\0\4\17\15\16\u4060\0\2\16"+
    "\u2163\0\5\17\3\0\26\17\2\0\7\17\36\0\4\17\224\0\3\17"+
    "\u01bb\0\125\16\1\0\107\16\1\0\2\16\2\0\1\16\2\0\2\16"+
    "\2\0\4\16\1\0\14\16\1\0\1\16\1\0\7\16\1\0\101\16"+
    "\1\0\4\16\2\0\10\16\1\0\7\16\1\0\34\16\1\0\4\16"+
    "\1\0\5\16\1\0\1\16\3\0\7\16\1\0\u0154\16\2\0\31\16"+
    "\1\0\31\16\1\0\37\16\1\0\31\16\1\0\37\16\1\0\31\16"+
    "\1\0\37\16\1\0\31\16\1\0\37\16\1\0\31\16\1\0\10\16"+
    "\2\0\62\17\u1600\0\4\16\1\0\33\16\1\0\2\16\1\0\1\16"+
    "\2\0\1\16\1\0\12\16\1\0\4\16\1\0\1\16\1\0\1\16"+
    "\6\0\1\16\4\0\1\16\1\0\1\16\1\0\1\16\1\0\3\16"+
    "\1\0\2\16\1\0\1\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\2\16\1\0\1\16\2\0\4\16"+
    "\1\0\7\16\1\0\4\16\1\0\4\16\1\0\1\16\1\0\12\16"+
    "\1\0\21\16\5\0\3\16\1\0\5\16\1\0\21\16\u1144\0\ua6d7\16"+
    "\51\0\u1035\16\13\0\336\16\u3fe2\0\u021e\16\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\17\36\0\140\17\200\0\360\17\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\2\4\3\5\1\6\1\7"+
    "\1\10\1\11\1\12\2\1\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\3\5\1\22\1\23\1\5\1\24";

  private static int [] zzUnpackAction() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\40\0\40\0\40\0\100\0\140\0\40\0\200"+
    "\0\240\0\300\0\240\0\240\0\240\0\240\0\240\0\340"+
    "\0\u0100\0\40\0\40\0\40\0\40\0\40\0\40\0\40"+
    "\0\u0120\0\u0140\0\u0160\0\40\0\40\0\u0180\0\240";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\11"+
    "\1\12\4\11\1\2\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\44\0\1\4\41\0\2\6\36\0\3\11\1\31"+
    "\15\11\12\0\1\11\4\0\21\11\12\0\1\11\4\0"+
    "\4\11\1\32\3\11\1\33\10\11\12\0\1\11\25\0"+
    "\1\34\40\0\1\35\15\0\4\11\1\36\14\11\12\0"+
    "\1\11\4\0\7\11\1\37\11\11\12\0\1\11\4\0"+
    "\11\11\1\37\7\11\12\0\1\11\4\0\5\11\1\37"+
    "\13\11\12\0\1\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[416];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\11\2\1\1\11\12\1\7\11\3\1\2\11"+
    "\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[31];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  W7Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2832) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(W7Sym.EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(W7Sym.error);
            }
          case 21: break;
          case 2: 
            { 
            }
          case 22: break;
          case 3: 
            { return new Symbol(W7Sym.EOL);
            }
          case 23: break;
          case 4: 
            { return new Symbol(W7Sym.NUMBER);
            }
          case 24: break;
          case 5: 
            { return new Symbol(W7Sym.IDENTIFIER);
            }
          case 25: break;
          case 6: 
            { return new Symbol(W7Sym.S);
            }
          case 26: break;
          case 7: 
            { return new Symbol(W7Sym.P);
            }
          case 27: break;
          case 8: 
            { return new Symbol(W7Sym.R);
            }
          case 28: break;
          case 9: 
            { return new Symbol(W7Sym.M);
            }
          case 29: break;
          case 10: 
            { return new Symbol(W7Sym.C);
            }
          case 30: break;
          case 11: 
            { return new Symbol(W7Sym.IGUAL);
            }
          case 31: break;
          case 12: 
            { return new Symbol(W7Sym.SUMA);
            }
          case 32: break;
          case 13: 
            { return new Symbol(W7Sym.RESTA);
            }
          case 33: break;
          case 14: 
            { return new Symbol(W7Sym.MULTI);
            }
          case 34: break;
          case 15: 
            { return new Symbol(W7Sym.DIV);
            }
          case 35: break;
          case 16: 
            { return new Symbol(W7Sym.IPARENTESIS);
            }
          case 36: break;
          case 17: 
            { return new Symbol(W7Sym.DPARENTESIS);
            }
          case 37: break;
          case 18: 
            { return new Symbol(W7Sym.DESPLIZQ);
            }
          case 38: break;
          case 19: 
            { return new Symbol(W7Sym.DESPLDER);
            }
          case 39: break;
          case 20: 
            { return new Symbol(W7Sym.IDENTIFIERFUNC);
            }
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
