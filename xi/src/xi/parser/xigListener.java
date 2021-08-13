// Generated from xig.g4 by ANTLR 4.9.2

package xi.parser;
import xi.expinterface.*;
import xi.enums.*;
import xi.operations.*;
import xi.literals.*;
import xi.expandstatements.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.AbstractMap;
import java.util.HashMap;
import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xigParser}.
 */
public interface xigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xigParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(xigParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link xigParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(xigParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link xigParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(xigParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link xigParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(xigParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link xigParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(xigParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xigParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(xigParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xigParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(xigParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link xigParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(xigParser.ExpContext ctx);
}