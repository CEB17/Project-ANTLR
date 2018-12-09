// Generated from inputoutput.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link inputoutputParser}.
 */
public interface inputoutputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#struktur}.
	 * @param ctx the parse tree
	 */
	void enterStruktur(inputoutputParser.StrukturContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#struktur}.
	 * @param ctx the parse tree
	 */
	void exitStruktur(inputoutputParser.StrukturContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(inputoutputParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(inputoutputParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#d_type}.
	 * @param ctx the parse tree
	 */
	void enterD_type(inputoutputParser.D_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#d_type}.
	 * @param ctx the parse tree
	 */
	void exitD_type(inputoutputParser.D_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(inputoutputParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(inputoutputParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(inputoutputParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(inputoutputParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(inputoutputParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(inputoutputParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#input_d}.
	 * @param ctx the parse tree
	 */
	void enterInput_d(inputoutputParser.Input_dContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#input_d}.
	 * @param ctx the parse tree
	 */
	void exitInput_d(inputoutputParser.Input_dContext ctx);
}