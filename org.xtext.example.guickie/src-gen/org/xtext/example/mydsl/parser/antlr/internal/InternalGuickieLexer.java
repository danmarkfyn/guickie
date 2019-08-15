package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuickieLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_END=8;
    public static final int RULE_CLOSE=5;
    public static final int RULE_START=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGuickieLexer() {;} 
    public InternalGuickieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGuickieLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGuickie.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:11:7: ( 'Title' )
            // InternalGuickie.g:11:9: 'Title'
            {
            match("Title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:12:7: ( 'title' )
            // InternalGuickie.g:12:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:13:7: ( ':' )
            // InternalGuickie.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:14:7: ( 'style:' )
            // InternalGuickie.g:14:9: 'style:'
            {
            match("style:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:15:7: ( 'style' )
            // InternalGuickie.g:15:9: 'style'
            {
            match("style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:16:7: ( 'style=' )
            // InternalGuickie.g:16:9: 'style='
            {
            match("style="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:17:7: ( 'Container' )
            // InternalGuickie.g:17:9: 'Container'
            {
            match("Container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:18:7: ( 'container' )
            // InternalGuickie.g:18:9: 'container'
            {
            match("container"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:19:7: ( 'alignment' )
            // InternalGuickie.g:19:9: 'alignment'
            {
            match("alignment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:20:7: ( 'h' )
            // InternalGuickie.g:20:9: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:21:7: ( 'horizontal' )
            // InternalGuickie.g:21:9: 'horizontal'
            {
            match("horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:22:7: ( 'v' )
            // InternalGuickie.g:22:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:23:7: ( 'vertical' )
            // InternalGuickie.g:23:9: 'vertical'
            {
            match("vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:24:7: ( 'neon' )
            // InternalGuickie.g:24:9: 'neon'
            {
            match("neon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:25:7: ( 'funky' )
            // InternalGuickie.g:25:9: 'funky'
            {
            match("funky"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:26:7: ( 'grey' )
            // InternalGuickie.g:26:9: 'grey'
            {
            match("grey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:27:7: ( 'bland' )
            // InternalGuickie.g:27:9: 'bland'
            {
            match("bland"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:28:7: ( 'element' )
            // InternalGuickie.g:28:9: 'element'
            {
            match("element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:29:7: ( '=' )
            // InternalGuickie.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:30:7: ( 'of type' )
            // InternalGuickie.g:30:9: 'of type'
            {
            match("of type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:31:7: ( 'type' )
            // InternalGuickie.g:31:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:32:7: ( 'link to' )
            // InternalGuickie.g:32:9: 'link to'
            {
            match("link to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:33:7: ( 'link' )
            // InternalGuickie.g:33:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:34:7: ( '->' )
            // InternalGuickie.g:34:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:35:7: ( '.' )
            // InternalGuickie.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:36:7: ( 'btn' )
            // InternalGuickie.g:36:9: 'btn'
            {
            match("btn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:37:7: ( 'button' )
            // InternalGuickie.g:37:9: 'button'
            {
            match("button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:38:7: ( 'lbl' )
            // InternalGuickie.g:38:9: 'lbl'
            {
            match("lbl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:39:7: ( 'label' )
            // InternalGuickie.g:39:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:40:7: ( 'tf' )
            // InternalGuickie.g:40:9: 'tf'
            {
            match("tf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:41:7: ( 'textfield' )
            // InternalGuickie.g:41:9: 'textfield'
            {
            match("textfield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:42:7: ( 'hyperlink' )
            // InternalGuickie.g:42:9: 'hyperlink'
            {
            match("hyperlink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:43:7: ( 'webpage' )
            // InternalGuickie.g:43:9: 'webpage'
            {
            match("webpage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_CLOSE"
    public final void mRULE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:901:12: ( ( ( '\\n' )+ | ';' ) )
            // InternalGuickie.g:901:14: ( ( '\\n' )+ | ';' )
            {
            // InternalGuickie.g:901:14: ( ( '\\n' )+ | ';' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\n') ) {
                alt2=1;
            }
            else if ( (LA2_0==';') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuickie.g:901:15: ( '\\n' )+
                    {
                    // InternalGuickie.g:901:15: ( '\\n' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\n') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGuickie.g:901:15: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalGuickie.g:901:21: ';'
                    {
                    match(';'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSE"

    // $ANTLR start "RULE_START"
    public final void mRULE_START() throws RecognitionException {
        try {
            int _type = RULE_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:903:12: ( '(' )
            // InternalGuickie.g:903:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_START"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:905:10: ( ')' )
            // InternalGuickie.g:905:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:907:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGuickie.g:907:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGuickie.g:907:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuickie.g:907:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGuickie.g:907:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGuickie.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:909:10: ( ( '0' .. '9' )+ )
            // InternalGuickie.g:909:12: ( '0' .. '9' )+
            {
            // InternalGuickie.g:909:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGuickie.g:909:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:911:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGuickie.g:911:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGuickie.g:911:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuickie.g:911:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGuickie.g:911:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGuickie.g:911:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGuickie.g:911:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:911:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGuickie.g:911:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalGuickie.g:911:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGuickie.g:911:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:913:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGuickie.g:913:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGuickie.g:913:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGuickie.g:913:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:915:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGuickie.g:915:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGuickie.g:915:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGuickie.g:915:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalGuickie.g:915:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuickie.g:915:41: ( '\\r' )? '\\n'
                    {
                    // InternalGuickie.g:915:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalGuickie.g:915:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:917:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGuickie.g:917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGuickie.g:917:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGuickie.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGuickie.g:919:16: ( . )
            // InternalGuickie.g:919:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGuickie.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_CLOSE | RULE_START | RULE_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalGuickie.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalGuickie.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalGuickie.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalGuickie.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalGuickie.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalGuickie.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalGuickie.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalGuickie.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalGuickie.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalGuickie.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalGuickie.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalGuickie.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalGuickie.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalGuickie.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalGuickie.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalGuickie.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalGuickie.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalGuickie.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalGuickie.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalGuickie.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalGuickie.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalGuickie.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalGuickie.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalGuickie.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalGuickie.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalGuickie.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalGuickie.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalGuickie.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalGuickie.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalGuickie.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalGuickie.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalGuickie.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalGuickie.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalGuickie.g:1:208: RULE_CLOSE
                {
                mRULE_CLOSE(); 

                }
                break;
            case 35 :
                // InternalGuickie.g:1:219: RULE_START
                {
                mRULE_START(); 

                }
                break;
            case 36 :
                // InternalGuickie.g:1:230: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 37 :
                // InternalGuickie.g:1:239: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalGuickie.g:1:247: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalGuickie.g:1:256: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalGuickie.g:1:268: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalGuickie.g:1:284: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalGuickie.g:1:300: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalGuickie.g:1:308: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\42\1\uffff\4\42\1\56\1\60\5\42\1\uffff\2\42\1\40\1\uffff\1\42\1\100\3\uffff\1\40\2\uffff\3\40\2\uffff\1\42\1\uffff\2\42\1\114\1\42\1\uffff\6\42\1\uffff\1\42\1\uffff\7\42\1\uffff\4\42\2\uffff\1\42\1\uffff\1\100\7\uffff\3\42\1\uffff\14\42\1\160\2\42\1\uffff\1\42\1\164\4\42\1\171\10\42\1\u0082\1\42\1\u0084\1\42\1\uffff\2\42\1\u0089\1\uffff\2\42\1\u008c\1\u008d\1\uffff\1\42\1\u0091\6\42\1\uffff\1\u0098\1\uffff\1\u0099\2\42\2\uffff\1\u009c\1\42\2\uffff\1\42\3\uffff\6\42\2\uffff\1\u00a5\1\42\1\uffff\10\42\1\uffff\1\u00af\1\u00b0\6\42\1\u00b7\2\uffff\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\42\1\u00bd\5\uffff\1\u00be\2\uffff";
    static final String DFA14_eofS =
        "\u00bf\uffff";
    static final String DFA14_minS =
        "\1\0\1\151\1\145\1\uffff\1\164\2\157\1\154\2\60\1\145\1\165\1\162\2\154\1\uffff\1\146\1\141\1\76\1\uffff\1\145\1\11\3\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\164\1\160\1\60\1\170\1\uffff\1\171\2\156\1\151\1\162\1\160\1\uffff\1\162\1\uffff\1\157\1\156\1\145\1\141\1\156\1\164\1\145\1\uffff\1\40\1\156\1\154\1\142\2\uffff\1\142\1\uffff\1\11\7\uffff\2\154\1\145\1\uffff\1\164\1\154\2\164\1\147\1\151\1\145\1\164\1\156\1\153\1\171\1\156\1\60\1\164\1\155\1\uffff\1\153\1\60\1\145\1\160\2\145\1\60\1\146\1\145\2\141\1\156\1\172\1\162\1\151\1\60\1\171\1\60\1\144\1\uffff\1\157\1\145\1\40\1\uffff\1\154\1\141\2\60\1\uffff\1\151\1\60\2\151\1\155\1\157\1\154\1\143\1\uffff\1\60\1\uffff\1\60\2\156\2\uffff\1\60\1\147\2\uffff\1\145\3\uffff\2\156\1\145\1\156\1\151\1\141\2\uffff\1\60\1\164\1\uffff\1\145\1\154\2\145\1\156\1\164\1\156\1\154\1\uffff\2\60\1\144\2\162\1\164\1\141\1\153\1\60\2\uffff\4\60\1\154\1\60\5\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\151\1\171\1\uffff\1\164\2\157\1\154\2\172\1\145\1\165\1\162\1\165\1\154\1\uffff\1\146\1\151\1\76\1\uffff\1\145\1\40\3\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\164\1\160\1\172\1\170\1\uffff\1\171\2\156\1\151\1\162\1\160\1\uffff\1\162\1\uffff\1\157\1\156\1\145\1\141\1\156\1\164\1\145\1\uffff\1\40\1\156\1\154\1\142\2\uffff\1\142\1\uffff\1\40\7\uffff\2\154\1\145\1\uffff\1\164\1\154\2\164\1\147\1\151\1\145\1\164\1\156\1\153\1\171\1\156\1\172\1\164\1\155\1\uffff\1\153\1\172\1\145\1\160\2\145\1\172\1\146\1\145\2\141\1\156\1\172\1\162\1\151\1\172\1\171\1\172\1\144\1\uffff\1\157\1\145\1\172\1\uffff\1\154\1\141\2\172\1\uffff\1\151\1\172\2\151\1\155\1\157\1\154\1\143\1\uffff\1\172\1\uffff\1\172\2\156\2\uffff\1\172\1\147\2\uffff\1\145\3\uffff\2\156\1\145\1\156\1\151\1\141\2\uffff\1\172\1\164\1\uffff\1\145\1\154\2\145\1\156\1\164\1\156\1\154\1\uffff\2\172\1\144\2\162\1\164\1\141\1\153\1\172\2\uffff\4\172\1\154\1\172\5\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\13\uffff\1\23\3\uffff\1\31\2\uffff\1\42\1\43\1\44\1\uffff\1\45\1\46\3\uffff\1\52\1\53\1\uffff\1\45\4\uffff\1\3\6\uffff\1\12\1\uffff\1\14\7\uffff\1\23\4\uffff\1\30\1\31\1\uffff\1\42\1\uffff\1\52\1\43\1\44\1\46\1\47\1\50\1\51\3\uffff\1\36\17\uffff\1\24\23\uffff\1\32\3\uffff\1\34\4\uffff\1\25\10\uffff\1\16\1\uffff\1\20\3\uffff\1\26\1\27\2\uffff\1\1\1\2\1\uffff\1\4\1\6\1\5\6\uffff\1\17\1\21\2\uffff\1\35\10\uffff\1\33\11\uffff\1\22\1\41\6\uffff\1\15\1\37\1\7\1\10\1\11\1\uffff\1\40\1\13";
    static final String DFA14_specialS =
        "\1\1\33\uffff\1\0\1\2\u00a1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\40\1\37\1\25\2\40\1\37\22\40\1\37\1\40\1\34\4\40\1\35\1\27\1\30\3\40\1\22\1\23\1\36\12\33\1\3\1\26\1\40\1\17\3\40\2\32\1\5\20\32\1\1\6\32\3\40\1\31\1\32\1\40\1\7\1\15\1\6\1\32\1\16\1\13\1\14\1\10\3\32\1\21\1\32\1\12\1\20\3\32\1\4\1\2\1\32\1\11\1\24\3\32\uff85\40",
            "\1\41",
            "\1\46\1\45\2\uffff\1\43\17\uffff\1\44",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\16\42\1\54\11\42\1\55\1\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\4\42\1\57\25\42",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65\1\66",
            "\1\67",
            "",
            "\1\71",
            "\1\74\1\73\6\uffff\1\72",
            "\1\75",
            "",
            "\1\77",
            "\1\102\1\101\2\uffff\1\102\22\uffff\1\102",
            "",
            "",
            "",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "\1\140",
            "",
            "\1\102\1\101\2\uffff\1\102\22\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0083",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\17\uffff\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u008a",
            "\1\u008b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u008e",
            "\12\42\1\u008f\2\uffff\1\u0090\3\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009d",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00bc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_CLOSE | RULE_START | RULE_END | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='T') ) {s = 1;}

                        else if ( (LA14_0=='t') ) {s = 2;}

                        else if ( (LA14_0==':') ) {s = 3;}

                        else if ( (LA14_0=='s') ) {s = 4;}

                        else if ( (LA14_0=='C') ) {s = 5;}

                        else if ( (LA14_0=='c') ) {s = 6;}

                        else if ( (LA14_0=='a') ) {s = 7;}

                        else if ( (LA14_0=='h') ) {s = 8;}

                        else if ( (LA14_0=='v') ) {s = 9;}

                        else if ( (LA14_0=='n') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='g') ) {s = 12;}

                        else if ( (LA14_0=='b') ) {s = 13;}

                        else if ( (LA14_0=='e') ) {s = 14;}

                        else if ( (LA14_0=='=') ) {s = 15;}

                        else if ( (LA14_0=='o') ) {s = 16;}

                        else if ( (LA14_0=='l') ) {s = 17;}

                        else if ( (LA14_0=='-') ) {s = 18;}

                        else if ( (LA14_0=='.') ) {s = 19;}

                        else if ( (LA14_0=='w') ) {s = 20;}

                        else if ( (LA14_0=='\n') ) {s = 21;}

                        else if ( (LA14_0==';') ) {s = 22;}

                        else if ( (LA14_0=='(') ) {s = 23;}

                        else if ( (LA14_0==')') ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='d'||(LA14_0>='i' && LA14_0<='k')||LA14_0=='m'||(LA14_0>='p' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='x' && LA14_0<='z')) ) {s = 26;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 27;}

                        else if ( (LA14_0=='\"') ) {s = 28;}

                        else if ( (LA14_0=='\'') ) {s = 29;}

                        else if ( (LA14_0=='/') ) {s = 30;}

                        else if ( (LA14_0=='\t'||LA14_0=='\r'||LA14_0==' ') ) {s = 31;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}