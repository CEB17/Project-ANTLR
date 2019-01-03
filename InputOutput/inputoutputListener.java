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
	 * Enter a parse tree produced by {@link inputoutputParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(inputoutputParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(inputoutputParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link inputoutputParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(inputoutputParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(inputoutputParser.CallContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(inputoutputParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(inputoutputParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(inputoutputParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(inputoutputParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(inputoutputParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(inputoutputParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#empty_arr}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_arr(inputoutputParser.Empty_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#empty_arr}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_arr(inputoutputParser.Empty_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link inputoutputParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(inputoutputParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link inputoutputParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(inputoutputParser.ArrContext ctx);
}