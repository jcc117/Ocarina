/* The following code was generated by JFlex 1.6.1 */

import java_cup.runtime.*;
import java.math.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./OcarinaLexer.flex</tt>
 */
class OcarinaLexer extends sym implements java_cup.runtime.Scanner {

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
    "\11\0\1\16\1\13\2\0\1\16\23\0\1\53\1\17\1\12\1\0"+
    "\1\71\1\0\1\14\1\63\1\64\1\15\1\47\1\70\1\50\1\7"+
    "\1\55\1\2\7\6\2\1\1\66\1\65\1\56\1\51\1\52\1\11"+
    "\1\67\6\5\21\10\1\4\2\10\1\57\1\0\1\60\1\54\1\10"+
    "\1\0\1\22\1\32\1\27\1\26\1\24\1\36\1\42\1\37\1\34"+
    "\1\10\1\45\1\30\1\40\1\25\1\33\1\41\1\44\1\23\1\20"+
    "\1\21\1\31\1\35\1\43\1\3\1\46\1\10\1\61\1\0\1\62"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\6\1\1"+
    "\1\7\1\1\22\4\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\0\1\3"+
    "\1\33\1\0\1\3\1\6\2\0\1\34\23\4\1\35"+
    "\13\4\1\36\1\4\1\37\13\4\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\0\7\4\1\46\4\4\1\47"+
    "\6\4\1\50\3\4\1\51\1\52\15\4\1\53\1\54"+
    "\3\4\1\55\7\4\1\0\2\4\1\56\3\4\1\57"+
    "\1\4\1\60\5\4\1\61\1\4\1\62\1\63\1\4"+
    "\1\64\16\4\1\65\10\4\1\66\1\4\1\0\1\67"+
    "\2\4\1\70\1\4\1\71\7\4\1\72\1\4\1\73"+
    "\1\4\1\74\1\75\2\4\1\76\1\77\1\4\1\100"+
    "\1\101\1\4\1\102\1\103\3\4\1\104\2\4\1\105"+
    "\1\0\1\106\2\4\1\107\1\110\1\111\1\112\2\4"+
    "\1\113\1\4\1\114\2\4\1\115\1\116\5\4\1\117"+
    "\1\6\2\4\1\120\1\4\1\121\2\4\1\122\1\123"+
    "\1\124\1\4\1\125\1\6\4\4\1\126\2\4\1\127"+
    "\1\130\1\4\1\131\1\132\1\4\1\133";

  private static int [] zzUnpackAction() {
    int [] result = new int[294];
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
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\72\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2\0\u032c"+
    "\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc"+
    "\0\u0536\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692\0\u06cc"+
    "\0\u0706\0\72\0\72\0\72\0\u0740\0\72\0\72\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\72\0\72\0\72"+
    "\0\u0122\0\u077a\0\u07b4\0\u07ee\0\u0122\0\72\0\u0828\0\u020a"+
    "\0\72\0\u0862\0\u089c\0\u08d6\0\u0910\0\u094a\0\u0984\0\u09be"+
    "\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e"+
    "\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\350\0\u0cb0\0\u0cea\0\u0d24"+
    "\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4"+
    "\0\350\0\u0f2e\0\350\0\u0f68\0\u0fa2\0\u0fdc\0\u1016\0\u1050"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u11ac\0\72\0\72"+
    "\0\72\0\72\0\72\0\u07ee\0\u11e6\0\u1220\0\u125a\0\u1294"+
    "\0\u12ce\0\u1308\0\u1342\0\u137c\0\350\0\u13b6\0\u13f0\0\u142a"+
    "\0\u1464\0\350\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586\0\u15c0"+
    "\0\350\0\u15fa\0\u1634\0\u166e\0\350\0\350\0\u16a8\0\u16e2"+
    "\0\u171c\0\u1756\0\u1790\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2"+
    "\0\u18ec\0\u1926\0\u1960\0\350\0\350\0\u199a\0\u19d4\0\u1a0e"+
    "\0\350\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30\0\u1b6a\0\u1ba4"+
    "\0\u1bde\0\u1c18\0\u1c52\0\350\0\u1c8c\0\u1cc6\0\u1d00\0\350"+
    "\0\u1d3a\0\350\0\u1d74\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\350"+
    "\0\u1e96\0\350\0\350\0\u1ed0\0\350\0\u1f0a\0\u1f44\0\u1f7e"+
    "\0\u1fb8\0\u1ff2\0\u202c\0\u2066\0\u20a0\0\u20da\0\u2114\0\u214e"+
    "\0\u2188\0\u21c2\0\u21fc\0\350\0\u2236\0\u2270\0\u22aa\0\u22e4"+
    "\0\u231e\0\u2358\0\u2392\0\u23cc\0\350\0\u2406\0\u2440\0\350"+
    "\0\u247a\0\u24b4\0\350\0\u24ee\0\350\0\u2528\0\u2562\0\u259c"+
    "\0\u25d6\0\u2610\0\u264a\0\u2684\0\350\0\u26be\0\350\0\u26f8"+
    "\0\350\0\u2732\0\u276c\0\u27a6\0\350\0\350\0\u27e0\0\350"+
    "\0\350\0\u281a\0\350\0\350\0\u2854\0\u288e\0\u28c8\0\350"+
    "\0\u2902\0\u293c\0\350\0\u2976\0\350\0\u29b0\0\u29ea\0\350"+
    "\0\350\0\350\0\350\0\u2a24\0\u2a5e\0\350\0\u2a98\0\350"+
    "\0\u2ad2\0\u2b0c\0\350\0\350\0\u2b46\0\u2b80\0\u2bba\0\u2bf4"+
    "\0\u2c2e\0\350\0\u2c68\0\u2ca2\0\u2cdc\0\350\0\u2d16\0\350"+
    "\0\u2d50\0\u2d8a\0\350\0\350\0\350\0\u2dc4\0\350\0\u2dfe"+
    "\0\u2e38\0\u2e72\0\u2eac\0\u2ee6\0\350\0\u2f20\0\u2f5a\0\350"+
    "\0\350\0\u2f94\0\350\0\350\0\u2fce\0\350";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[294];
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
    "\1\2\1\3\1\4\3\5\1\3\1\6\1\5\1\2"+
    "\1\7\1\10\1\11\1\12\1\10\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\5\1\34"+
    "\1\5\1\35\3\5\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\73\0\2\3"+
    "\3\0\1\3\1\61\63\0\1\62\1\63\2\64\1\0"+
    "\1\63\1\61\63\0\6\5\1\0\2\5\6\0\27\5"+
    "\24\0\2\65\3\0\1\65\63\0\13\7\1\66\56\7"+
    "\13\0\1\10\2\0\1\10\67\0\1\67\55\0\17\70"+
    "\1\71\52\70\1\0\6\5\1\0\2\5\6\0\1\5"+
    "\1\72\1\73\6\5\1\74\2\5\1\75\12\5\24\0"+
    "\6\5\1\0\2\5\6\0\3\5\1\76\13\5\1\77"+
    "\6\5\1\100\24\0\6\5\1\0\2\5\6\0\1\101"+
    "\4\5\1\102\21\5\24\0\6\5\1\0\2\5\6\0"+
    "\2\5\1\103\1\5\1\104\22\5\24\0\2\5\1\105"+
    "\3\5\1\0\2\5\6\0\5\5\1\106\2\5\1\107"+
    "\13\5\1\110\2\5\24\0\6\5\1\0\2\5\6\0"+
    "\2\5\1\111\10\5\1\112\1\113\12\5\24\0\6\5"+
    "\1\0\2\5\6\0\4\5\1\114\6\5\1\115\1\116"+
    "\12\5\24\0\6\5\1\0\2\5\6\0\2\5\1\117"+
    "\1\120\4\5\1\121\2\5\1\122\13\5\24\0\6\5"+
    "\1\0\2\5\6\0\4\5\1\123\22\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\124\4\5\1\125\21\5\24\0"+
    "\6\5\1\0\2\5\6\0\3\5\1\126\1\127\6\5"+
    "\1\130\13\5\24\0\6\5\1\0\2\5\6\0\3\5"+
    "\1\131\23\5\24\0\6\5\1\0\2\5\6\0\5\5"+
    "\1\132\10\5\1\133\10\5\24\0\6\5\1\0\2\5"+
    "\6\0\2\5\1\134\10\5\1\135\13\5\24\0\6\5"+
    "\1\0\2\5\6\0\2\5\1\136\5\5\1\137\2\5"+
    "\1\140\1\141\12\5\24\0\6\5\1\0\2\5\6\0"+
    "\2\5\1\142\24\5\24\0\6\5\1\0\2\5\6\0"+
    "\3\5\1\143\5\5\1\144\15\5\24\0\6\5\1\0"+
    "\2\5\6\0\14\5\1\145\2\5\1\146\7\5\72\0"+
    "\1\147\72\0\1\150\73\0\1\151\70\0\1\152\71\0"+
    "\1\153\21\0\2\62\3\0\1\62\1\61\63\0\1\62"+
    "\1\63\3\0\1\63\1\61\63\0\2\154\2\0\2\154"+
    "\13\0\1\154\1\0\1\154\1\0\2\154\2\0\1\154"+
    "\3\0\1\154\47\0\1\155\56\0\6\5\1\0\2\5"+
    "\6\0\2\5\1\156\1\157\23\5\24\0\6\5\1\0"+
    "\2\5\6\0\22\5\1\160\4\5\24\0\6\5\1\0"+
    "\2\5\6\0\12\5\1\161\6\5\1\162\5\5\24\0"+
    "\6\5\1\0\2\5\6\0\5\5\1\163\21\5\24\0"+
    "\6\5\1\0\2\5\6\0\11\5\1\164\14\5\1\165"+
    "\24\0\6\5\1\0\2\5\6\0\3\5\1\166\10\5"+
    "\1\167\12\5\24\0\6\5\1\0\2\5\6\0\21\5"+
    "\1\170\5\5\24\0\6\5\1\0\2\5\6\0\1\171"+
    "\26\5\24\0\6\5\1\0\2\5\6\0\6\5\1\172"+
    "\20\5\24\0\6\5\1\0\2\5\6\0\1\5\1\173"+
    "\25\5\24\0\6\5\1\0\2\5\6\0\1\5\1\174"+
    "\25\5\24\0\6\5\1\0\2\5\6\0\1\5\1\175"+
    "\2\5\1\176\2\5\1\177\4\5\1\200\12\5\24\0"+
    "\6\5\1\0\2\5\6\0\6\5\1\201\20\5\24\0"+
    "\6\5\1\0\2\5\6\0\1\202\26\5\24\0\6\5"+
    "\1\0\2\5\6\0\11\5\1\203\15\5\24\0\6\5"+
    "\1\0\2\5\6\0\5\5\1\204\21\5\24\0\6\5"+
    "\1\0\2\5\6\0\3\5\1\205\23\5\24\0\6\5"+
    "\1\0\2\5\6\0\10\5\1\206\16\5\24\0\6\5"+
    "\1\0\2\5\6\0\12\5\1\207\14\5\24\0\6\5"+
    "\1\0\2\5\6\0\16\5\1\210\10\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\5\1\211\25\5\24\0\6\5"+
    "\1\0\2\5\6\0\4\5\1\212\22\5\24\0\6\5"+
    "\1\0\2\5\6\0\2\5\1\213\24\5\24\0\6\5"+
    "\1\0\2\5\6\0\5\5\1\214\21\5\24\0\6\5"+
    "\1\0\2\5\6\0\5\5\1\215\21\5\24\0\6\5"+
    "\1\0\2\5\6\0\14\5\1\216\12\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\5\1\217\6\5\1\220\16\5"+
    "\24\0\6\5\1\0\2\5\6\0\4\5\1\221\22\5"+
    "\24\0\6\5\1\0\2\5\6\0\22\5\1\222\4\5"+
    "\24\0\6\5\1\0\2\5\6\0\13\5\1\223\13\5"+
    "\24\0\6\5\1\0\2\5\6\0\1\5\1\224\25\5"+
    "\24\0\6\5\1\0\2\5\6\0\3\5\1\225\23\5"+
    "\24\0\6\5\1\0\2\5\6\0\14\5\1\226\12\5"+
    "\24\0\6\5\1\0\2\5\6\0\10\5\1\227\16\5"+
    "\24\0\6\5\1\0\2\5\6\0\13\5\1\230\13\5"+
    "\24\0\6\5\1\0\2\5\6\0\3\5\1\231\23\5"+
    "\24\0\6\5\1\0\2\5\6\0\5\5\1\232\21\5"+
    "\24\0\6\5\1\0\2\5\6\0\1\233\26\5\24\0"+
    "\6\5\1\0\2\5\6\0\13\5\1\234\1\235\12\5"+
    "\24\0\6\5\1\0\2\5\6\0\12\5\1\236\14\5"+
    "\24\0\6\5\1\0\2\5\6\0\1\5\1\237\25\5"+
    "\24\0\6\5\1\0\2\5\6\0\14\5\1\240\12\5"+
    "\23\0\15\241\1\0\54\241\1\0\6\5\1\0\2\5"+
    "\6\0\3\5\1\242\23\5\24\0\6\5\1\0\2\5"+
    "\6\0\14\5\1\243\12\5\24\0\6\5\1\0\2\5"+
    "\6\0\4\5\1\244\22\5\24\0\6\5\1\0\2\5"+
    "\6\0\3\5\1\245\23\5\24\0\6\5\1\0\2\5"+
    "\6\0\4\5\1\246\22\5\24\0\6\5\1\0\2\5"+
    "\6\0\22\5\1\247\4\5\24\0\6\5\1\0\2\5"+
    "\6\0\4\5\1\250\22\5\24\0\6\5\1\0\2\5"+
    "\6\0\13\5\1\251\13\5\24\0\6\5\1\0\2\5"+
    "\6\0\1\252\26\5\24\0\6\5\1\0\2\5\6\0"+
    "\4\5\1\253\22\5\24\0\6\5\1\0\2\5\6\0"+
    "\4\5\1\254\22\5\24\0\6\5\1\0\2\5\6\0"+
    "\17\5\1\255\7\5\24\0\6\5\1\0\2\5\6\0"+
    "\11\5\1\256\15\5\24\0\6\5\1\0\2\5\6\0"+
    "\4\5\1\257\22\5\24\0\6\5\1\0\2\5\6\0"+
    "\7\5\1\260\17\5\24\0\6\5\1\0\2\5\6\0"+
    "\4\5\1\261\22\5\24\0\6\5\1\0\2\5\6\0"+
    "\1\5\1\262\25\5\24\0\6\5\1\0\2\5\6\0"+
    "\4\5\1\263\22\5\24\0\6\5\1\0\2\5\6\0"+
    "\2\5\1\264\24\5\24\0\6\5\1\0\2\5\6\0"+
    "\6\5\1\265\20\5\24\0\6\5\1\0\2\5\6\0"+
    "\11\5\1\266\15\5\24\0\6\5\1\0\2\5\6\0"+
    "\16\5\1\267\10\5\24\0\6\5\1\0\2\5\6\0"+
    "\7\5\1\270\17\5\24\0\6\5\1\0\2\5\6\0"+
    "\2\5\1\271\24\5\24\0\6\5\1\0\2\5\6\0"+
    "\1\272\26\5\24\0\6\5\1\0\2\5\6\0\1\273"+
    "\1\274\25\5\24\0\6\5\1\0\2\5\6\0\22\5"+
    "\1\275\4\5\24\0\6\5\1\0\2\5\6\0\5\5"+
    "\1\276\21\5\24\0\6\5\1\0\2\5\6\0\14\5"+
    "\1\277\12\5\24\0\6\5\1\0\2\5\6\0\4\5"+
    "\1\300\22\5\24\0\6\5\1\0\2\5\6\0\2\5"+
    "\1\301\24\5\24\0\6\5\1\0\2\5\6\0\14\5"+
    "\1\302\12\5\24\0\6\5\1\0\2\5\6\0\10\5"+
    "\1\303\16\5\24\0\6\5\1\0\2\5\6\0\6\5"+
    "\1\304\20\5\24\0\6\5\1\0\2\5\6\0\1\305"+
    "\26\5\24\0\6\5\1\0\2\5\6\0\2\5\1\306"+
    "\24\5\24\0\6\5\1\0\2\5\6\0\2\5\1\307"+
    "\24\5\24\0\6\5\1\0\2\5\6\0\17\5\1\310"+
    "\7\5\24\0\6\5\1\0\2\5\6\0\1\5\1\311"+
    "\25\5\24\0\6\5\1\0\2\5\6\0\5\5\1\312"+
    "\7\5\1\313\11\5\24\0\6\5\1\0\2\5\6\0"+
    "\10\5\1\314\16\5\24\0\6\5\1\0\2\5\6\0"+
    "\17\5\1\315\7\5\24\0\6\5\1\0\2\5\6\0"+
    "\10\5\1\316\16\5\23\0\14\241\1\317\55\241\1\0"+
    "\6\5\1\0\2\5\6\0\1\5\1\320\25\5\24\0"+
    "\6\5\1\0\2\5\6\0\5\5\1\321\21\5\24\0"+
    "\6\5\1\0\2\5\6\0\13\5\1\322\13\5\24\0"+
    "\6\5\1\0\2\5\6\0\3\5\1\323\23\5\24\0"+
    "\6\5\1\0\2\5\6\0\10\5\1\324\16\5\24\0"+
    "\6\5\1\0\2\5\6\0\23\5\1\325\3\5\24\0"+
    "\6\5\1\0\2\5\6\0\13\5\1\326\13\5\24\0"+
    "\6\5\1\0\2\5\6\0\3\5\1\327\23\5\24\0"+
    "\6\5\1\0\2\5\6\0\4\5\1\330\22\5\24\0"+
    "\6\5\1\0\2\5\6\0\3\5\1\331\23\5\24\0"+
    "\6\5\1\0\2\5\6\0\5\5\1\332\21\5\24\0"+
    "\6\5\1\0\2\5\6\0\21\5\1\333\5\5\24\0"+
    "\6\5\1\0\2\5\6\0\10\5\1\334\16\5\24\0"+
    "\6\5\1\0\2\5\6\0\22\5\1\335\4\5\24\0"+
    "\6\5\1\0\2\5\6\0\4\5\1\336\22\5\24\0"+
    "\6\5\1\0\2\5\6\0\17\5\1\337\7\5\24\0"+
    "\6\5\1\0\2\5\6\0\1\5\1\340\25\5\24\0"+
    "\6\5\1\0\2\5\6\0\1\341\26\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\5\1\342\25\5\24\0\6\5"+
    "\1\0\2\5\6\0\14\5\1\343\12\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\5\1\344\25\5\24\0\6\5"+
    "\1\0\2\5\6\0\22\5\1\345\4\5\24\0\6\5"+
    "\1\0\2\5\6\0\10\5\1\346\16\5\24\0\6\5"+
    "\1\0\2\5\6\0\1\347\26\5\24\0\6\5\1\0"+
    "\2\5\6\0\25\5\1\350\1\5\24\0\6\5\1\0"+
    "\2\5\6\0\5\5\1\351\21\5\24\0\6\5\1\0"+
    "\2\5\6\0\4\5\1\352\22\5\24\0\6\5\1\0"+
    "\2\5\6\0\4\5\1\353\22\5\24\0\6\5\1\0"+
    "\2\5\6\0\1\5\1\354\25\5\24\0\6\5\1\0"+
    "\2\5\6\0\10\5\1\355\16\5\24\0\6\5\1\0"+
    "\2\5\6\0\20\5\1\356\6\5\24\0\6\5\1\0"+
    "\2\5\6\0\4\5\1\357\22\5\24\0\6\5\1\0"+
    "\2\5\6\0\1\5\1\360\25\5\24\0\6\5\1\0"+
    "\2\5\6\0\2\5\1\361\24\5\24\0\6\5\1\0"+
    "\2\5\6\0\14\5\1\362\12\5\24\0\6\5\1\0"+
    "\2\5\6\0\4\5\1\363\22\5\23\0\14\241\1\364"+
    "\55\241\1\0\6\5\1\0\2\5\6\0\22\5\1\365"+
    "\4\5\24\0\6\5\1\0\2\5\6\0\11\5\1\366"+
    "\15\5\24\0\6\5\1\0\2\5\6\0\4\5\1\367"+
    "\22\5\24\0\6\5\1\0\2\5\6\0\16\5\1\370"+
    "\10\5\24\0\6\5\1\0\2\5\6\0\1\5\1\371"+
    "\25\5\24\0\6\5\1\0\2\5\6\0\3\5\1\372"+
    "\23\5\24\0\6\5\1\0\2\5\6\0\5\5\1\373"+
    "\21\5\24\0\6\5\1\0\2\5\6\0\6\5\1\374"+
    "\20\5\24\0\6\5\1\0\2\5\6\0\1\5\1\375"+
    "\25\5\24\0\6\5\1\0\2\5\6\0\1\376\26\5"+
    "\24\0\6\5\1\0\2\5\6\0\3\5\1\377\23\5"+
    "\24\0\6\5\1\0\2\5\6\0\4\5\1\u0100\22\5"+
    "\24\0\6\5\1\0\2\5\6\0\3\5\1\u0101\23\5"+
    "\24\0\6\5\1\0\2\5\6\0\5\5\1\u0102\21\5"+
    "\24\0\6\5\1\0\2\5\6\0\17\5\1\u0103\7\5"+
    "\24\0\6\5\1\0\2\5\6\0\1\u0104\26\5\24\0"+
    "\6\5\1\0\2\5\6\0\2\5\1\u0105\24\5\24\0"+
    "\6\5\1\0\2\5\6\0\10\5\1\u0106\16\5\24\0"+
    "\6\5\1\0\2\5\6\0\2\5\1\u0107\24\5\24\0"+
    "\6\5\1\0\2\5\6\0\7\5\1\u0108\17\5\24\0"+
    "\6\5\1\0\2\5\6\0\1\5\1\u0109\25\5\24\0"+
    "\6\5\1\0\2\5\6\0\7\5\1\u010a\17\5\23\0"+
    "\14\241\1\u010b\55\241\1\0\6\5\1\0\2\5\6\0"+
    "\1\5\1\u010c\25\5\24\0\6\5\1\0\2\5\6\0"+
    "\1\5\1\u010d\25\5\24\0\6\5\1\0\2\5\6\0"+
    "\1\u010e\26\5\24\0\6\5\1\0\2\5\6\0\14\5"+
    "\1\u010f\12\5\24\0\6\5\1\0\2\5\6\0\1\u0110"+
    "\26\5\24\0\6\5\1\0\2\5\6\0\11\5\1\u0111"+
    "\15\5\24\0\6\5\1\0\2\5\6\0\11\5\1\u0112"+
    "\15\5\24\0\6\5\1\0\2\5\6\0\5\5\1\u0113"+
    "\21\5\24\0\6\5\1\0\2\5\6\0\26\5\1\u0114"+
    "\24\0\6\5\1\0\2\5\6\0\21\5\1\u0115\5\5"+
    "\24\0\6\5\1\0\2\5\6\0\1\5\1\u0116\25\5"+
    "\24\0\6\5\1\0\2\5\6\0\4\5\1\u0117\22\5"+
    "\37\0\1\u0118\56\0\6\5\1\0\2\5\6\0\14\5"+
    "\1\u0119\12\5\24\0\6\5\1\0\2\5\6\0\13\5"+
    "\1\u011a\13\5\24\0\6\5\1\0\2\5\6\0\13\5"+
    "\1\u011b\13\5\24\0\6\5\1\0\2\5\6\0\7\5"+
    "\1\u011c\17\5\24\0\6\5\1\0\2\5\6\0\4\5"+
    "\1\u011d\22\5\24\0\6\5\1\0\2\5\6\0\4\5"+
    "\1\u011e\22\5\37\0\1\66\56\0\6\5\1\0\2\5"+
    "\6\0\5\5\1\u011f\21\5\24\0\6\5\1\0\2\5"+
    "\6\0\5\5\1\u0120\21\5\24\0\6\5\1\0\2\5"+
    "\6\0\5\5\1\u0121\21\5\24\0\6\5\1\0\2\5"+
    "\6\0\1\5\1\u0122\25\5\24\0\6\5\1\0\2\5"+
    "\6\0\6\5\1\u0123\20\5\24\0\6\5\1\0\2\5"+
    "\6\0\4\5\1\u0124\22\5\24\0\6\5\1\0\2\5"+
    "\6\0\13\5\1\u0125\13\5\24\0\6\5\1\0\2\5"+
    "\6\0\3\5\1\u0126\23\5\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12296];
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
    "\1\0\1\11\7\1\1\11\27\1\3\11\1\1\13\11"+
    "\1\0\2\1\1\0\1\1\1\11\2\0\1\11\55\1"+
    "\5\11\1\1\1\0\63\1\1\0\55\1\1\0\44\1"+
    "\1\0\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[294];
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

  /* user code: */
	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
    }

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  OcarinaLexer(java.io.Reader in) {
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
    while (i < 174) {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
          { 	return symbol(EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*Return an error message*/
            }
          case 92: break;
          case 2: 
            { return symbol(INTLITERAL, new BigInteger(yytext()));
            }
          case 93: break;
          case 3: 
            { return symbol(FLOATLITERAL, new BigDecimal(yytext()));
            }
          case 94: break;
          case 4: 
            { return symbol(IDENTIFIER, yytext());
            }
          case 95: break;
          case 5: 
            { return symbol(DOT);
            }
          case 96: break;
          case 6: 
            { /*Do nothing*/
            }
          case 97: break;
          case 7: 
            { return symbol(MULT);
            }
          case 98: break;
          case 8: 
            { return symbol(PLUS);
            }
          case 99: break;
          case 9: 
            { return symbol(MINUS);
            }
          case 100: break;
          case 10: 
            { return symbol(EQUAL);
            }
          case 101: break;
          case 11: 
            { return symbol(GTHAN);
            }
          case 102: break;
          case 12: 
            { return symbol(BANG);
            }
          case 103: break;
          case 13: 
            { return symbol(POWER);
            }
          case 104: break;
          case 14: 
            { return symbol(DIV);
            }
          case 105: break;
          case 15: 
            { return symbol(LTHAN);
            }
          case 106: break;
          case 16: 
            { return symbol(LBRACKET);
            }
          case 107: break;
          case 17: 
            { return symbol(RBRACKET);
            }
          case 108: break;
          case 18: 
            { return symbol(LBRACE);
            }
          case 109: break;
          case 19: 
            { return symbol(RBRACE);
            }
          case 110: break;
          case 20: 
            { return symbol(LPAREN);
            }
          case 111: break;
          case 21: 
            { return symbol(RPAREN);
            }
          case 112: break;
          case 22: 
            { return symbol(SEMICOLON);
            }
          case 113: break;
          case 23: 
            { return symbol(COLON);
            }
          case 114: break;
          case 24: 
            { return symbol(AT);
            }
          case 115: break;
          case 25: 
            { return symbol(COMMA);
            }
          case 116: break;
          case 26: 
            { return symbol(MOD);
            }
          case 117: break;
          case 27: 
            { return symbol(INTLITERAL, new BigInteger(yytext(), 8));
            }
          case 118: break;
          case 28: 
            { return symbol(STRINGLITERAL, yytext());
            }
          case 119: break;
          case 29: 
            { return symbol(DO);
            }
          case 120: break;
          case 30: 
            { return symbol(OR);
            }
          case 121: break;
          case 31: 
            { return symbol(IF);
            }
          case 122: break;
          case 32: 
            { return symbol(INCREMENT);
            }
          case 123: break;
          case 33: 
            { return symbol(DECREMENT);
            }
          case 124: break;
          case 34: 
            { return symbol(POINTER);
            }
          case 125: break;
          case 35: 
            { return symbol(GTHANE);
            }
          case 126: break;
          case 36: 
            { return symbol(LTHANE);
            }
          case 127: break;
          case 37: 
            { return symbol(INTLITERAL, new BigInteger(yytext().substring(2), 16));
            }
          case 128: break;
          case 38: 
            { return symbol(TRY);
            }
          case 129: break;
          case 39: 
            { return symbol(AND);
            }
          case 130: break;
          case 40: 
            { return symbol(END);
            }
          case 131: break;
          case 41: 
            { return symbol(NOR);
            }
          case 132: break;
          case 42: 
            { return symbol(NIL);
            }
          case 133: break;
          case 43: 
            { return symbol(INT);
            }
          case 134: break;
          case 44: 
            { return symbol(VAR);
            }
          case 135: break;
          case 45: 
            { return symbol(FOR);
            }
          case 136: break;
          case 46: 
            { return symbol(SAGE);
            }
          case 137: break;
          case 47: 
            { return symbol(TRUE);
            }
          case 138: break;
          case 48: 
            { return symbol(THIS);
            }
          case 139: break;
          case 49: 
            { return symbol(EXEC);
            }
          case 140: break;
          case 50: 
            { return symbol(EXIT);
            }
          case 141: break;
          case 51: 
            { return symbol(ELSE);
            }
          case 142: break;
          case 52: 
            { return symbol(NAND);
            }
          case 143: break;
          case 53: 
            { return symbol(VOID);
            }
          case 144: break;
          case 54: 
            { return symbol(WITH);
            }
          case 145: break;
          case 55: 
            { return symbol(START);
            }
          case 146: break;
          case 56: 
            { return symbol(SUPER);
            }
          case 147: break;
          case 57: 
            { return symbol(THROW);
            }
          case 148: break;
          case 58: 
            { return symbol(DEBUG);
            }
          case 149: break;
          case 59: 
            { return symbol(CATCH);
            }
          case 150: break;
          case 60: 
            { return symbol(CLASS);
            }
          case 151: break;
          case 61: 
            { return symbol(CONST);
            }
          case 152: break;
          case 62: 
            { return symbol(USING);
            }
          case 153: break;
          case 63: 
            { return symbol(UNTIL);
            }
          case 154: break;
          case 64: 
            { return symbol(BREAK);
            }
          case 155: break;
          case 65: 
            { return symbol(BEGIN);
            }
          case 156: break;
          case 66: 
            { return symbol(FALSE);
            }
          case 157: break;
          case 67: 
            { return symbol(FLOAT);
            }
          case 158: break;
          case 68: 
            { return symbol(PRINT);
            }
          case 159: break;
          case 69: 
            { return symbol(WHILE);
            }
          case 160: break;
          case 70: 
            { return symbol(STRING);
            }
          case 161: break;
          case 71: 
            { return symbol(TYPEOF);
            }
          case 162: break;
          case 72: 
            { return symbol(ASSERT);
            }
          case 163: break;
          case 73: 
            { return symbol(RATHER);
            }
          case 164: break;
          case 74: 
            { return symbol(RETURN);
            }
          case 165: break;
          case 75: 
            { return symbol(EQUALS);
            }
          case 166: break;
          case 76: 
            { return symbol(CREATE);
            }
          case 167: break;
          case 77: 
            { return symbol(LENGTH);
            }
          case 168: break;
          case 78: 
            { return symbol(UNLESS);
            }
          case 169: break;
          case 79: 
            { return symbol(PUBLIC);
            }
          case 170: break;
          case 80: 
            { return symbol(EXTENDS);
            }
          case 171: break;
          case 81: 
            { return symbol(DIFFERS);
            }
          case 172: break;
          case 82: 
            { return symbol(BOOLEAN);
            }
          case 173: break;
          case 83: 
            { return symbol(FINALLY);
            }
          case 174: break;
          case 84: 
            { return symbol(HASHMAP);
            }
          case 175: break;
          case 85: 
            { return symbol(PRIVATE);
            }
          case 176: break;
          case 86: 
            { return symbol(CONTINUE);
            }
          case 177: break;
          case 87: 
            { return symbol(SINGLETON);
            }
          case 178: break;
          case 88: 
            { return symbol(EXCEPTION);
            }
          case 179: break;
          case 89: 
            { return symbol(PROTECTED);
            }
          case 180: break;
          case 90: 
            { return symbol(SUBROUTINE);
            }
          case 181: break;
          case 91: 
            { return symbol(CONSTRUCTOR);
            }
          case 182: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
