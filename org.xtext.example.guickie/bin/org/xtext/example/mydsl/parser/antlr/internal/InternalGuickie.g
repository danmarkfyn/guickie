/*
 * generated by Xtext 2.18.0.M3
 */
grammar InternalGuickie;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGUI
entryRuleGUI returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGUIRule()); }
	iv_ruleGUI=ruleGUI
	{ $current=$iv_ruleGUI.current; }
	EOF;

// Rule GUI
ruleGUI returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGUIAccess().getGUIAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='Title'
				{
					newLeafNode(otherlv_1, grammarAccess.getGUIAccess().getTitleKeyword_1_0_0());
				}
				    |
				otherlv_2='title'
				{
					newLeafNode(otherlv_2, grammarAccess.getGUIAccess().getTitleKeyword_1_0_1());
				}
			)
			(
				otherlv_3=':'
				{
					newLeafNode(otherlv_3, grammarAccess.getGUIAccess().getColonKeyword_1_1());
				}
			)?
			(
				(
					lv_title_4_0=RULE_STRING
					{
						newLeafNode(lv_title_4_0, grammarAccess.getGUIAccess().getTitleSTRINGTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGUIRule());
						}
						setWithLastConsumed(
							$current,
							"title",
							lv_title_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			this_CLOSE_5=RULE_CLOSE
			{
				newLeafNode(this_CLOSE_5, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_1_3());
			}
		)?
		(
			(
				otherlv_6='style:'
				{
					newLeafNode(otherlv_6, grammarAccess.getGUIAccess().getStyleKeyword_2_0_0());
				}
				    |
				otherlv_7='style'
				{
					newLeafNode(otherlv_7, grammarAccess.getGUIAccess().getStyleKeyword_2_0_1());
				}
				    |
				otherlv_8='style='
				{
					newLeafNode(otherlv_8, grammarAccess.getGUIAccess().getStyleKeyword_2_0_2());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getGUIAccess().getStyleStyleParserRuleCall_2_1_0());
					}
					lv_style_9_0=ruleStyle
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGUIRule());
						}
						set(
							$current,
							"style",
							lv_style_9_0,
							"org.xtext.example.mydsl.Guickie.Style");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_CLOSE_10=RULE_CLOSE
			{
				newLeafNode(this_CLOSE_10, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGUIAccess().getContainersContainerParserRuleCall_3_0());
				}
				lv_containers_11_0=ruleContainer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGUIRule());
					}
					add(
						$current,
						"containers",
						lv_containers_11_0,
						"org.xtext.example.mydsl.Guickie.Container");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_CLOSE_12=RULE_CLOSE
		{
			newLeafNode(this_CLOSE_12, grammarAccess.getGUIAccess().getCLOSETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContainerAccess().getContainerAction_0(),
					$current);
			}
		)
		(
			otherlv_1='Container'
			{
				newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1_0());
			}
			    |
			otherlv_2='container'
			{
				newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getContainerKeyword_1_1());
			}
		)
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='alignment'
			{
				newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAlignmentKeyword_3_0());
			}
			(
				otherlv_5=':'
				{
					newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getColonKeyword_3_1());
				}
			)?
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getContainerAccess().getAlignVerticalParserRuleCall_3_2_0_0());
						}
						lv_align_6_1=ruleVertical
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContainerRule());
							}
							set(
								$current,
								"align",
								lv_align_6_1,
								"org.xtext.example.mydsl.Guickie.Vertical");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getContainerAccess().getAlignHorizontalParserRuleCall_3_2_0_1());
						}
						lv_align_6_2=ruleHorizontal
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContainerRule());
							}
							set(
								$current,
								"align",
								lv_align_6_2,
								"org.xtext.example.mydsl.Guickie.Horizontal");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		this_START_7=RULE_START
		{
			newLeafNode(this_START_7, grammarAccess.getContainerAccess().getSTARTTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getElementsElementParserRuleCall_5_0());
				}
				lv_elements_8_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					add(
						$current,
						"elements",
						lv_elements_8_0,
						"org.xtext.example.mydsl.Guickie.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_9=RULE_END
		{
			newLeafNode(this_END_9, grammarAccess.getContainerAccess().getENDTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleHorizontal
entryRuleHorizontal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHorizontalRule()); }
	iv_ruleHorizontal=ruleHorizontal
	{ $current=$iv_ruleHorizontal.current; }
	EOF;

// Rule Horizontal
ruleHorizontal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
					$current);
			}
		)
		(
			otherlv_1='h'
			{
				newLeafNode(otherlv_1, grammarAccess.getHorizontalAccess().getHKeyword_1_0());
			}
			    |
			otherlv_2='horizontal'
			{
				newLeafNode(otherlv_2, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleVertical
entryRuleVertical returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerticalRule()); }
	iv_ruleVertical=ruleVertical
	{ $current=$iv_ruleVertical.current; }
	EOF;

// Rule Vertical
ruleVertical returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVerticalAccess().getVerticalAction_0(),
					$current);
			}
		)
		(
			otherlv_1='v'
			{
				newLeafNode(otherlv_1, grammarAccess.getVerticalAccess().getVKeyword_1_0());
			}
			    |
			otherlv_2='vertical'
			{
				newLeafNode(otherlv_2, grammarAccess.getVerticalAccess().getVerticalKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleStyle
entryRuleStyle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStyleRule()); }
	iv_ruleStyle=ruleStyle
	{ $current=$iv_ruleStyle.current; }
	EOF;

// Rule Style
ruleStyle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStyleAccess().getTypeNeonParserRuleCall_0_0());
				}
				lv_type_0_1=ruleNeon
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStyleRule());
					}
					set(
						$current,
						"type",
						lv_type_0_1,
						"org.xtext.example.mydsl.Guickie.Neon");
					afterParserOrEnumRuleCall();
				}
				    |
				{
					newCompositeNode(grammarAccess.getStyleAccess().getTypeGreyParserRuleCall_0_1());
				}
				lv_type_0_2=ruleGrey
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStyleRule());
					}
					set(
						$current,
						"type",
						lv_type_0_2,
						"org.xtext.example.mydsl.Guickie.Grey");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNeon
entryRuleNeon returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNeonRule()); }
	iv_ruleNeon=ruleNeon
	{ $current=$iv_ruleNeon.current; }
	EOF;

// Rule Neon
ruleNeon returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNeonAccess().getNeonAction_0(),
					$current);
			}
		)
		(
			otherlv_1='neon'
			{
				newLeafNode(otherlv_1, grammarAccess.getNeonAccess().getNeonKeyword_1_0());
			}
			    |
			otherlv_2='funky'
			{
				newLeafNode(otherlv_2, grammarAccess.getNeonAccess().getFunkyKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleGrey
entryRuleGrey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreyRule()); }
	iv_ruleGrey=ruleGrey
	{ $current=$iv_ruleGrey.current; }
	EOF;

// Rule Grey
ruleGrey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGreyAccess().getGreyAction_0(),
					$current);
			}
		)
		(
			otherlv_1='grey'
			{
				newLeafNode(otherlv_1, grammarAccess.getGreyAccess().getGreyKeyword_1_0());
			}
			    |
			otherlv_2='bland'
			{
				newLeafNode(otherlv_2, grammarAccess.getGreyAccess().getBlandKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getElementAccess().getElementAction_0(),
					$current);
			}
		)
		otherlv_1='element'
		{
			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getElementKeyword_1());
		}
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getColonKeyword_2_0());
			}
			    |
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getEqualsSignKeyword_2_1());
			}
		)?
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_5='of type'
			{
				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOfTypeKeyword_4_0());
			}
			    |
			(
				otherlv_6='type'
				{
					newLeafNode(otherlv_6, grammarAccess.getElementAccess().getTypeKeyword_4_1_0());
				}
				(
					otherlv_7=':'
					{
						newLeafNode(otherlv_7, grammarAccess.getElementAccess().getColonKeyword_4_1_1_0());
					}
					    |
					otherlv_8='='
					{
						newLeafNode(otherlv_8, grammarAccess.getElementAccess().getEqualsSignKeyword_4_1_1_1());
					}
				)?
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getTypeButtonParserRuleCall_5_0_0());
					}
					lv_type_9_1=ruleButton
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						set(
							$current,
							"type",
							lv_type_9_1,
							"org.xtext.example.mydsl.Guickie.Button");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getElementAccess().getTypeLabelParserRuleCall_5_0_1());
					}
					lv_type_9_2=ruleLabel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						set(
							$current,
							"type",
							lv_type_9_2,
							"org.xtext.example.mydsl.Guickie.Label");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getElementAccess().getTypeTextFieldParserRuleCall_5_0_2());
					}
					lv_type_9_3=ruleTextField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						set(
							$current,
							"type",
							lv_type_9_3,
							"org.xtext.example.mydsl.Guickie.TextField");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getElementAccess().getTypeHyperLinkParserRuleCall_5_0_3());
					}
					lv_type_9_4=ruleHyperLink
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						set(
							$current,
							"type",
							lv_type_9_4,
							"org.xtext.example.mydsl.Guickie.HyperLink");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				otherlv_10='link to'
				{
					newLeafNode(otherlv_10, grammarAccess.getElementAccess().getLinkToKeyword_6_0_0());
				}
				    |
				otherlv_11='link'
				{
					newLeafNode(otherlv_11, grammarAccess.getElementAccess().getLinkKeyword_6_0_1());
				}
				    |
				otherlv_12='->'
				{
					newLeafNode(otherlv_12, grammarAccess.getElementAccess().getHyphenMinusGreaterThanSignKeyword_6_0_2());
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getElementAccess().getLinkElementCrossReference_6_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getButtonAccess().getButtonAction_0(),
					$current);
			}
		)
		(
			otherlv_1='btn'
			{
				newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getBtnKeyword_1_0());
			}
			    |
			otherlv_2='button'
			{
				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getButtonKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLabelAccess().getLabelAction_0(),
					$current);
			}
		)
		(
			otherlv_1='lbl'
			{
				newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLblKeyword_1_0());
			}
			    |
			otherlv_2='label'
			{
				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getLabelKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleTextField
entryRuleTextField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextFieldRule()); }
	iv_ruleTextField=ruleTextField
	{ $current=$iv_ruleTextField.current; }
	EOF;

// Rule TextField
ruleTextField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTextFieldAccess().getTextFieldAction_0(),
					$current);
			}
		)
		(
			otherlv_1='tf'
			{
				newLeafNode(otherlv_1, grammarAccess.getTextFieldAccess().getTfKeyword_1_0());
			}
			    |
			otherlv_2='textfield'
			{
				newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getTextfieldKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleHyperLink
entryRuleHyperLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHyperLinkRule()); }
	iv_ruleHyperLink=ruleHyperLink
	{ $current=$iv_ruleHyperLink.current; }
	EOF;

// Rule HyperLink
ruleHyperLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getHyperLinkAccess().getHyperLinkAction_0(),
					$current);
			}
		)
		(
			otherlv_1='hyperlink'
			{
				newLeafNode(otherlv_1, grammarAccess.getHyperLinkAccess().getHyperlinkKeyword_1_0());
			}
			    |
			otherlv_2='webpage'
			{
				newLeafNode(otherlv_2, grammarAccess.getHyperLinkAccess().getWebpageKeyword_1_1());
			}
		)
	)
;

RULE_CLOSE : ('\n'+|';');

RULE_START : '(';

RULE_END : ')';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;