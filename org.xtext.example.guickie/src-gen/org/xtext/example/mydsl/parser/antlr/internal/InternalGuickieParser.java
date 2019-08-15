package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.GuickieGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuickieParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_CLOSE", "RULE_ID", "RULE_START", "RULE_END", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title'", "'title'", "':'", "'style:'", "'style'", "'style='", "'Container'", "'container'", "'alignment'", "'h'", "'horizontal'", "'v'", "'vertical'", "'neon'", "'funky'", "'grey'", "'bland'", "'element'", "'='", "'of type'", "'type'", "'link to'", "'link'", "'->'", "'.'", "'btn'", "'button'", "'lbl'", "'label'", "'tf'", "'textfield'", "'hyperlink'", "'webpage'"
    };
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


        public InternalGuickieParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuickieParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuickieParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuickie.g"; }



     	private GuickieGrammarAccess grammarAccess;

        public InternalGuickieParser(TokenStream input, GuickieGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GUI";
       	}

       	@Override
       	protected GuickieGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGUI"
    // InternalGuickie.g:64:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalGuickie.g:64:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalGuickie.g:65:2: iv_ruleGUI= ruleGUI EOF
            {
             newCompositeNode(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUI=ruleGUI();

            state._fsp--;

             current =iv_ruleGUI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalGuickie.g:71:1: ruleGUI returns [EObject current=null] : ( () ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )? ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_containers_11_0= ruleContainer ) )+ this_CLOSE_12= RULE_CLOSE ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token this_CLOSE_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_CLOSE_10=null;
        Token this_CLOSE_12=null;
        EObject lv_style_9_0 = null;

        EObject lv_containers_11_0 = null;



        	enterRule();

        try {
            // InternalGuickie.g:77:2: ( ( () ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )? ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_containers_11_0= ruleContainer ) )+ this_CLOSE_12= RULE_CLOSE ) )
            // InternalGuickie.g:78:2: ( () ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )? ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_containers_11_0= ruleContainer ) )+ this_CLOSE_12= RULE_CLOSE )
            {
            // InternalGuickie.g:78:2: ( () ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )? ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_containers_11_0= ruleContainer ) )+ this_CLOSE_12= RULE_CLOSE )
            // InternalGuickie.g:79:3: () ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )? ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )? ( (lv_containers_11_0= ruleContainer ) )+ this_CLOSE_12= RULE_CLOSE
            {
            // InternalGuickie.g:79:3: ()
            // InternalGuickie.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGUIAccess().getGUIAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:86:3: ( (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuickie.g:87:4: (otherlv_1= 'Title' | otherlv_2= 'title' ) (otherlv_3= ':' )? ( (lv_title_4_0= RULE_STRING ) ) this_CLOSE_5= RULE_CLOSE
                    {
                    // InternalGuickie.g:87:4: (otherlv_1= 'Title' | otherlv_2= 'title' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==14) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==15) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalGuickie.g:88:5: otherlv_1= 'Title'
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getGUIAccess().getTitleKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGuickie.g:93:5: otherlv_2= 'title'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getGUIAccess().getTitleKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalGuickie.g:98:4: (otherlv_3= ':' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==16) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalGuickie.g:99:5: otherlv_3= ':'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getGUIAccess().getColonKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalGuickie.g:104:4: ( (lv_title_4_0= RULE_STRING ) )
                    // InternalGuickie.g:105:5: (lv_title_4_0= RULE_STRING )
                    {
                    // InternalGuickie.g:105:5: (lv_title_4_0= RULE_STRING )
                    // InternalGuickie.g:106:6: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_title_4_0, grammarAccess.getGUIAccess().getTitleSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGUIRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    this_CLOSE_5=(Token)match(input,RULE_CLOSE,FOLLOW_6); 

                    				newLeafNode(this_CLOSE_5, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_1_3());
                    			

                    }
                    break;

            }

            // InternalGuickie.g:127:3: ( (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuickie.g:128:4: (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' ) ( (lv_style_9_0= ruleStyle ) ) this_CLOSE_10= RULE_CLOSE
                    {
                    // InternalGuickie.g:128:4: (otherlv_6= 'style:' | otherlv_7= 'style' | otherlv_8= 'style=' )
                    int alt4=3;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt4=1;
                        }
                        break;
                    case 18:
                        {
                        alt4=2;
                        }
                        break;
                    case 19:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // InternalGuickie.g:129:5: otherlv_6= 'style:'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_6, grammarAccess.getGUIAccess().getStyleKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGuickie.g:134:5: otherlv_7= 'style'
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getGUIAccess().getStyleKeyword_2_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalGuickie.g:139:5: otherlv_8= 'style='
                            {
                            otherlv_8=(Token)match(input,19,FOLLOW_7); 

                            					newLeafNode(otherlv_8, grammarAccess.getGUIAccess().getStyleKeyword_2_0_2());
                            				

                            }
                            break;

                    }

                    // InternalGuickie.g:144:4: ( (lv_style_9_0= ruleStyle ) )
                    // InternalGuickie.g:145:5: (lv_style_9_0= ruleStyle )
                    {
                    // InternalGuickie.g:145:5: (lv_style_9_0= ruleStyle )
                    // InternalGuickie.g:146:6: lv_style_9_0= ruleStyle
                    {

                    						newCompositeNode(grammarAccess.getGUIAccess().getStyleStyleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_style_9_0=ruleStyle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGUIRule());
                    						}
                    						set(
                    							current,
                    							"style",
                    							lv_style_9_0,
                    							"org.xtext.example.mydsl.Guickie.Style");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_CLOSE_10=(Token)match(input,RULE_CLOSE,FOLLOW_6); 

                    				newLeafNode(this_CLOSE_10, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalGuickie.g:168:3: ( (lv_containers_11_0= ruleContainer ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGuickie.g:169:4: (lv_containers_11_0= ruleContainer )
            	    {
            	    // InternalGuickie.g:169:4: (lv_containers_11_0= ruleContainer )
            	    // InternalGuickie.g:170:5: lv_containers_11_0= ruleContainer
            	    {

            	    					newCompositeNode(grammarAccess.getGUIAccess().getContainersContainerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_containers_11_0=ruleContainer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGUIRule());
            	    					}
            	    					add(
            	    						current,
            	    						"containers",
            	    						lv_containers_11_0,
            	    						"org.xtext.example.mydsl.Guickie.Container");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            this_CLOSE_12=(Token)match(input,RULE_CLOSE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_12, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleContainer"
    // InternalGuickie.g:195:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalGuickie.g:195:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalGuickie.g:196:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalGuickie.g:202:1: ruleContainer returns [EObject current=null] : ( () (otherlv_1= 'Container' | otherlv_2= 'container' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? ) this_START_7= RULE_START ( (lv_elements_8_0= ruleElement ) )+ this_END_9= RULE_END ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_START_7=null;
        Token this_END_9=null;
        EObject lv_align_6_1 = null;

        EObject lv_align_6_2 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalGuickie.g:208:2: ( ( () (otherlv_1= 'Container' | otherlv_2= 'container' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? ) this_START_7= RULE_START ( (lv_elements_8_0= ruleElement ) )+ this_END_9= RULE_END ) )
            // InternalGuickie.g:209:2: ( () (otherlv_1= 'Container' | otherlv_2= 'container' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? ) this_START_7= RULE_START ( (lv_elements_8_0= ruleElement ) )+ this_END_9= RULE_END )
            {
            // InternalGuickie.g:209:2: ( () (otherlv_1= 'Container' | otherlv_2= 'container' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? ) this_START_7= RULE_START ( (lv_elements_8_0= ruleElement ) )+ this_END_9= RULE_END )
            // InternalGuickie.g:210:3: () (otherlv_1= 'Container' | otherlv_2= 'container' ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? ) this_START_7= RULE_START ( (lv_elements_8_0= ruleElement ) )+ this_END_9= RULE_END
            {
            // InternalGuickie.g:210:3: ()
            // InternalGuickie.g:211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:217:3: (otherlv_1= 'Container' | otherlv_2= 'container' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuickie.g:218:4: otherlv_1= 'Container'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:223:4: otherlv_2= 'container'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGuickie.g:228:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalGuickie.g:229:4: (lv_name_3_0= RULE_ID )
            {
            // InternalGuickie.g:229:4: (lv_name_3_0= RULE_ID )
            // InternalGuickie.g:230:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGuickie.g:246:3: (otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )? )
            // InternalGuickie.g:247:4: otherlv_4= 'alignment' (otherlv_5= ':' )? ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )?
            {
            otherlv_4=(Token)match(input,22,FOLLOW_11); 

            				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAlignmentKeyword_3_0());
            			
            // InternalGuickie.g:251:4: (otherlv_5= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuickie.g:252:5: otherlv_5= ':'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getColonKeyword_3_1());
                    				

                    }
                    break;

            }

            // InternalGuickie.g:257:4: ( ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGuickie.g:258:5: ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) )
                    {
                    // InternalGuickie.g:258:5: ( (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal ) )
                    // InternalGuickie.g:259:6: (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal )
                    {
                    // InternalGuickie.g:259:6: (lv_align_6_1= ruleVertical | lv_align_6_2= ruleHorizontal )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_0>=23 && LA9_0<=24)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGuickie.g:260:7: lv_align_6_1= ruleVertical
                            {

                            							newCompositeNode(grammarAccess.getContainerAccess().getAlignVerticalParserRuleCall_3_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_align_6_1=ruleVertical();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getContainerRule());
                            							}
                            							set(
                            								current,
                            								"align",
                            								lv_align_6_1,
                            								"org.xtext.example.mydsl.Guickie.Vertical");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalGuickie.g:276:7: lv_align_6_2= ruleHorizontal
                            {

                            							newCompositeNode(grammarAccess.getContainerAccess().getAlignHorizontalParserRuleCall_3_2_0_1());
                            						
                            pushFollow(FOLLOW_13);
                            lv_align_6_2=ruleHorizontal();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getContainerRule());
                            							}
                            							set(
                            								current,
                            								"align",
                            								lv_align_6_2,
                            								"org.xtext.example.mydsl.Guickie.Horizontal");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            this_START_7=(Token)match(input,RULE_START,FOLLOW_14); 

            			newLeafNode(this_START_7, grammarAccess.getContainerAccess().getSTARTTerminalRuleCall_4());
            		
            // InternalGuickie.g:299:3: ( (lv_elements_8_0= ruleElement ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGuickie.g:300:4: (lv_elements_8_0= ruleElement )
            	    {
            	    // InternalGuickie.g:300:4: (lv_elements_8_0= ruleElement )
            	    // InternalGuickie.g:301:5: lv_elements_8_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_elements_8_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_8_0,
            	    						"org.xtext.example.mydsl.Guickie.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getContainerAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleHorizontal"
    // InternalGuickie.g:326:1: entryRuleHorizontal returns [EObject current=null] : iv_ruleHorizontal= ruleHorizontal EOF ;
    public final EObject entryRuleHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontal = null;


        try {
            // InternalGuickie.g:326:51: (iv_ruleHorizontal= ruleHorizontal EOF )
            // InternalGuickie.g:327:2: iv_ruleHorizontal= ruleHorizontal EOF
            {
             newCompositeNode(grammarAccess.getHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHorizontal=ruleHorizontal();

            state._fsp--;

             current =iv_ruleHorizontal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // InternalGuickie.g:333:1: ruleHorizontal returns [EObject current=null] : ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) ;
    public final EObject ruleHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:339:2: ( ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) )
            // InternalGuickie.g:340:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            {
            // InternalGuickie.g:340:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            // InternalGuickie.g:341:3: () (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            {
            // InternalGuickie.g:341:3: ()
            // InternalGuickie.g:342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:348:3: (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGuickie.g:349:4: otherlv_1= 'h'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHorizontalAccess().getHKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:354:4: otherlv_2= 'horizontal'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleVertical"
    // InternalGuickie.g:363:1: entryRuleVertical returns [EObject current=null] : iv_ruleVertical= ruleVertical EOF ;
    public final EObject entryRuleVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertical = null;


        try {
            // InternalGuickie.g:363:49: (iv_ruleVertical= ruleVertical EOF )
            // InternalGuickie.g:364:2: iv_ruleVertical= ruleVertical EOF
            {
             newCompositeNode(grammarAccess.getVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertical=ruleVertical();

            state._fsp--;

             current =iv_ruleVertical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // InternalGuickie.g:370:1: ruleVertical returns [EObject current=null] : ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) ;
    public final EObject ruleVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:376:2: ( ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) )
            // InternalGuickie.g:377:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            {
            // InternalGuickie.g:377:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            // InternalGuickie.g:378:3: () (otherlv_1= 'v' | otherlv_2= 'vertical' )
            {
            // InternalGuickie.g:378:3: ()
            // InternalGuickie.g:379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerticalAccess().getVerticalAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:385:3: (otherlv_1= 'v' | otherlv_2= 'vertical' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGuickie.g:386:4: otherlv_1= 'v'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerticalAccess().getVKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:391:4: otherlv_2= 'vertical'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getVerticalAccess().getVerticalKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleStyle"
    // InternalGuickie.g:400:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalGuickie.g:400:46: (iv_ruleStyle= ruleStyle EOF )
            // InternalGuickie.g:401:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalGuickie.g:407:1: ruleStyle returns [EObject current=null] : ( ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalGuickie.g:413:2: ( ( ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) ) ) )
            // InternalGuickie.g:414:2: ( ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) ) )
            {
            // InternalGuickie.g:414:2: ( ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) ) )
            // InternalGuickie.g:415:3: ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) )
            {
            // InternalGuickie.g:415:3: ( (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey ) )
            // InternalGuickie.g:416:4: (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey )
            {
            // InternalGuickie.g:416:4: (lv_type_0_1= ruleNeon | lv_type_0_2= ruleGrey )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=28)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalGuickie.g:417:5: lv_type_0_1= ruleNeon
                    {

                    					newCompositeNode(grammarAccess.getStyleAccess().getTypeNeonParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleNeon();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStyleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"org.xtext.example.mydsl.Guickie.Neon");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:433:5: lv_type_0_2= ruleGrey
                    {

                    					newCompositeNode(grammarAccess.getStyleAccess().getTypeGreyParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleGrey();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStyleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"org.xtext.example.mydsl.Guickie.Grey");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleNeon"
    // InternalGuickie.g:454:1: entryRuleNeon returns [EObject current=null] : iv_ruleNeon= ruleNeon EOF ;
    public final EObject entryRuleNeon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeon = null;


        try {
            // InternalGuickie.g:454:45: (iv_ruleNeon= ruleNeon EOF )
            // InternalGuickie.g:455:2: iv_ruleNeon= ruleNeon EOF
            {
             newCompositeNode(grammarAccess.getNeonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeon=ruleNeon();

            state._fsp--;

             current =iv_ruleNeon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeon"


    // $ANTLR start "ruleNeon"
    // InternalGuickie.g:461:1: ruleNeon returns [EObject current=null] : ( () (otherlv_1= 'neon' | otherlv_2= 'funky' ) ) ;
    public final EObject ruleNeon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:467:2: ( ( () (otherlv_1= 'neon' | otherlv_2= 'funky' ) ) )
            // InternalGuickie.g:468:2: ( () (otherlv_1= 'neon' | otherlv_2= 'funky' ) )
            {
            // InternalGuickie.g:468:2: ( () (otherlv_1= 'neon' | otherlv_2= 'funky' ) )
            // InternalGuickie.g:469:3: () (otherlv_1= 'neon' | otherlv_2= 'funky' )
            {
            // InternalGuickie.g:469:3: ()
            // InternalGuickie.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNeonAccess().getNeonAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:476:3: (otherlv_1= 'neon' | otherlv_2= 'funky' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGuickie.g:477:4: otherlv_1= 'neon'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getNeonAccess().getNeonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:482:4: otherlv_2= 'funky'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNeonAccess().getFunkyKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeon"


    // $ANTLR start "entryRuleGrey"
    // InternalGuickie.g:491:1: entryRuleGrey returns [EObject current=null] : iv_ruleGrey= ruleGrey EOF ;
    public final EObject entryRuleGrey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrey = null;


        try {
            // InternalGuickie.g:491:45: (iv_ruleGrey= ruleGrey EOF )
            // InternalGuickie.g:492:2: iv_ruleGrey= ruleGrey EOF
            {
             newCompositeNode(grammarAccess.getGreyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrey=ruleGrey();

            state._fsp--;

             current =iv_ruleGrey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrey"


    // $ANTLR start "ruleGrey"
    // InternalGuickie.g:498:1: ruleGrey returns [EObject current=null] : ( () (otherlv_1= 'grey' | otherlv_2= 'bland' ) ) ;
    public final EObject ruleGrey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:504:2: ( ( () (otherlv_1= 'grey' | otherlv_2= 'bland' ) ) )
            // InternalGuickie.g:505:2: ( () (otherlv_1= 'grey' | otherlv_2= 'bland' ) )
            {
            // InternalGuickie.g:505:2: ( () (otherlv_1= 'grey' | otherlv_2= 'bland' ) )
            // InternalGuickie.g:506:3: () (otherlv_1= 'grey' | otherlv_2= 'bland' )
            {
            // InternalGuickie.g:506:3: ()
            // InternalGuickie.g:507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGreyAccess().getGreyAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:513:3: (otherlv_1= 'grey' | otherlv_2= 'bland' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGuickie.g:514:4: otherlv_1= 'grey'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getGreyAccess().getGreyKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:519:4: otherlv_2= 'bland'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getGreyAccess().getBlandKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrey"


    // $ANTLR start "entryRuleElement"
    // InternalGuickie.g:528:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalGuickie.g:528:48: (iv_ruleElement= ruleElement EOF )
            // InternalGuickie.g:529:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalGuickie.g:535:1: ruleElement returns [EObject current=null] : ( () otherlv_1= 'element' (otherlv_2= ':' | otherlv_3= '=' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) ) ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) ) ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_type_9_1 = null;

        EObject lv_type_9_2 = null;

        EObject lv_type_9_3 = null;

        EObject lv_type_9_4 = null;



        	enterRule();

        try {
            // InternalGuickie.g:541:2: ( ( () otherlv_1= 'element' (otherlv_2= ':' | otherlv_3= '=' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) ) ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) ) ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )? ) )
            // InternalGuickie.g:542:2: ( () otherlv_1= 'element' (otherlv_2= ':' | otherlv_3= '=' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) ) ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) ) ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )? )
            {
            // InternalGuickie.g:542:2: ( () otherlv_1= 'element' (otherlv_2= ':' | otherlv_3= '=' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) ) ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) ) ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )? )
            // InternalGuickie.g:543:3: () otherlv_1= 'element' (otherlv_2= ':' | otherlv_3= '=' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) ) ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) ) ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )?
            {
            // InternalGuickie.g:543:3: ()
            // InternalGuickie.g:544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementAccess().getElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getElementKeyword_1());
            		
            // InternalGuickie.g:554:3: (otherlv_2= ':' | otherlv_3= '=' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalGuickie.g:555:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getColonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:560:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalGuickie.g:565:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalGuickie.g:566:4: (lv_name_4_0= RULE_ID )
            {
            // InternalGuickie.g:566:4: (lv_name_4_0= RULE_ID )
            // InternalGuickie.g:567:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_4_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGuickie.g:583:3: (otherlv_5= 'of type' | (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGuickie.g:584:4: otherlv_5= 'of type'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOfTypeKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:589:4: (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? )
                    {
                    // InternalGuickie.g:589:4: (otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )? )
                    // InternalGuickie.g:590:5: otherlv_6= 'type' (otherlv_7= ':' | otherlv_8= '=' )?
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_19); 

                    					newLeafNode(otherlv_6, grammarAccess.getElementAccess().getTypeKeyword_4_1_0());
                    				
                    // InternalGuickie.g:594:5: (otherlv_7= ':' | otherlv_8= '=' )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==16) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==32) ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalGuickie.g:595:6: otherlv_7= ':'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_18); 

                            						newLeafNode(otherlv_7, grammarAccess.getElementAccess().getColonKeyword_4_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalGuickie.g:600:6: otherlv_8= '='
                            {
                            otherlv_8=(Token)match(input,32,FOLLOW_18); 

                            						newLeafNode(otherlv_8, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalGuickie.g:607:3: ( ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) ) )
            // InternalGuickie.g:608:4: ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) )
            {
            // InternalGuickie.g:608:4: ( (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink ) )
            // InternalGuickie.g:609:5: (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink )
            {
            // InternalGuickie.g:609:5: (lv_type_9_1= ruleButton | lv_type_9_2= ruleLabel | lv_type_9_3= ruleTextField | lv_type_9_4= ruleHyperLink )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt20=1;
                }
                break;
            case 41:
            case 42:
                {
                alt20=2;
                }
                break;
            case 43:
            case 44:
                {
                alt20=3;
                }
                break;
            case 45:
            case 46:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalGuickie.g:610:6: lv_type_9_1= ruleButton
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getTypeButtonParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_type_9_1=ruleButton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_1,
                    							"org.xtext.example.mydsl.Guickie.Button");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:626:6: lv_type_9_2= ruleLabel
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getTypeLabelParserRuleCall_5_0_1());
                    					
                    pushFollow(FOLLOW_20);
                    lv_type_9_2=ruleLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_2,
                    							"org.xtext.example.mydsl.Guickie.Label");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalGuickie.g:642:6: lv_type_9_3= ruleTextField
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getTypeTextFieldParserRuleCall_5_0_2());
                    					
                    pushFollow(FOLLOW_20);
                    lv_type_9_3=ruleTextField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_3,
                    							"org.xtext.example.mydsl.Guickie.TextField");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 4 :
                    // InternalGuickie.g:658:6: lv_type_9_4= ruleHyperLink
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getTypeHyperLinkParserRuleCall_5_0_3());
                    					
                    pushFollow(FOLLOW_20);
                    lv_type_9_4=ruleHyperLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_4,
                    							"org.xtext.example.mydsl.Guickie.HyperLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalGuickie.g:676:3: ( (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=35 && LA22_0<=37)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGuickie.g:677:4: (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalGuickie.g:677:4: (otherlv_10= 'link to' | otherlv_11= 'link' | otherlv_12= '->' )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt21=1;
                        }
                        break;
                    case 36:
                        {
                        alt21=2;
                        }
                        break;
                    case 37:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalGuickie.g:678:5: otherlv_10= 'link to'
                            {
                            otherlv_10=(Token)match(input,35,FOLLOW_9); 

                            					newLeafNode(otherlv_10, grammarAccess.getElementAccess().getLinkToKeyword_6_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGuickie.g:683:5: otherlv_11= 'link'
                            {
                            otherlv_11=(Token)match(input,36,FOLLOW_9); 

                            					newLeafNode(otherlv_11, grammarAccess.getElementAccess().getLinkKeyword_6_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalGuickie.g:688:5: otherlv_12= '->'
                            {
                            otherlv_12=(Token)match(input,37,FOLLOW_9); 

                            					newLeafNode(otherlv_12, grammarAccess.getElementAccess().getHyphenMinusGreaterThanSignKeyword_6_0_2());
                            				

                            }
                            break;

                    }

                    // InternalGuickie.g:693:4: ( ( ruleQualifiedName ) )
                    // InternalGuickie.g:694:5: ( ruleQualifiedName )
                    {
                    // InternalGuickie.g:694:5: ( ruleQualifiedName )
                    // InternalGuickie.g:695:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getElementAccess().getLinkElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGuickie.g:714:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGuickie.g:714:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGuickie.g:715:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalGuickie.g:721:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:727:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGuickie.g:728:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGuickie.g:728:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGuickie.g:729:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGuickie.g:736:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGuickie.g:737:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleButton"
    // InternalGuickie.g:754:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalGuickie.g:754:47: (iv_ruleButton= ruleButton EOF )
            // InternalGuickie.g:755:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGuickie.g:761:1: ruleButton returns [EObject current=null] : ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:767:2: ( ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ) )
            // InternalGuickie.g:768:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) )
            {
            // InternalGuickie.g:768:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) )
            // InternalGuickie.g:769:3: () (otherlv_1= 'btn' | otherlv_2= 'button' )
            {
            // InternalGuickie.g:769:3: ()
            // InternalGuickie.g:770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:776:3: (otherlv_1= 'btn' | otherlv_2= 'button' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==40) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGuickie.g:777:4: otherlv_1= 'btn'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getBtnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:782:4: otherlv_2= 'button'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getButtonKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleLabel"
    // InternalGuickie.g:791:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalGuickie.g:791:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalGuickie.g:792:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalGuickie.g:798:1: ruleLabel returns [EObject current=null] : ( () (otherlv_1= 'lbl' | otherlv_2= 'label' ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:804:2: ( ( () (otherlv_1= 'lbl' | otherlv_2= 'label' ) ) )
            // InternalGuickie.g:805:2: ( () (otherlv_1= 'lbl' | otherlv_2= 'label' ) )
            {
            // InternalGuickie.g:805:2: ( () (otherlv_1= 'lbl' | otherlv_2= 'label' ) )
            // InternalGuickie.g:806:3: () (otherlv_1= 'lbl' | otherlv_2= 'label' )
            {
            // InternalGuickie.g:806:3: ()
            // InternalGuickie.g:807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:813:3: (otherlv_1= 'lbl' | otherlv_2= 'label' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( (LA25_0==42) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalGuickie.g:814:4: otherlv_1= 'lbl'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLblKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:819:4: otherlv_2= 'label'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLabelKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleTextField"
    // InternalGuickie.g:828:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalGuickie.g:828:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalGuickie.g:829:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalGuickie.g:835:1: ruleTextField returns [EObject current=null] : ( () (otherlv_1= 'tf' | otherlv_2= 'textfield' ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:841:2: ( ( () (otherlv_1= 'tf' | otherlv_2= 'textfield' ) ) )
            // InternalGuickie.g:842:2: ( () (otherlv_1= 'tf' | otherlv_2= 'textfield' ) )
            {
            // InternalGuickie.g:842:2: ( () (otherlv_1= 'tf' | otherlv_2= 'textfield' ) )
            // InternalGuickie.g:843:3: () (otherlv_1= 'tf' | otherlv_2= 'textfield' )
            {
            // InternalGuickie.g:843:3: ()
            // InternalGuickie.g:844:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextFieldAccess().getTextFieldAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:850:3: (otherlv_1= 'tf' | otherlv_2= 'textfield' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            else if ( (LA26_0==44) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGuickie.g:851:4: otherlv_1= 'tf'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getTfKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:856:4: otherlv_2= 'textfield'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getTextfieldKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleHyperLink"
    // InternalGuickie.g:865:1: entryRuleHyperLink returns [EObject current=null] : iv_ruleHyperLink= ruleHyperLink EOF ;
    public final EObject entryRuleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperLink = null;


        try {
            // InternalGuickie.g:865:50: (iv_ruleHyperLink= ruleHyperLink EOF )
            // InternalGuickie.g:866:2: iv_ruleHyperLink= ruleHyperLink EOF
            {
             newCompositeNode(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyperLink=ruleHyperLink();

            state._fsp--;

             current =iv_ruleHyperLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyperLink"


    // $ANTLR start "ruleHyperLink"
    // InternalGuickie.g:872:1: ruleHyperLink returns [EObject current=null] : ( () (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' ) ) ;
    public final EObject ruleHyperLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGuickie.g:878:2: ( ( () (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' ) ) )
            // InternalGuickie.g:879:2: ( () (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' ) )
            {
            // InternalGuickie.g:879:2: ( () (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' ) )
            // InternalGuickie.g:880:3: () (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' )
            {
            // InternalGuickie.g:880:3: ()
            // InternalGuickie.g:881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHyperLinkAccess().getHyperLinkAction_0(),
            					current);
            			

            }

            // InternalGuickie.g:887:3: (otherlv_1= 'hyperlink' | otherlv_2= 'webpage' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGuickie.g:888:4: otherlv_1= 'hyperlink'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHyperLinkAccess().getHyperlinkKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGuickie.g:893:4: otherlv_2= 'webpage'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHyperLinkAccess().getWebpageKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyperLink"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E0020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007810080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007800080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100010040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00007F8000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00007F8100010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000002L});

}