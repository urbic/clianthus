package coneforest.clianthus.option;

import coneforest.clianthus.i18n.Messages;
import coneforest.clianthus.processor.ProcessingException;

/**
*	An abstract option holding a list of objects.
*
*	@param <T> a type of containing object
*/
abstract public class OptionCollector<T>
	extends OptionWithArg
{
	/**
	*	Creates new option with given names.
	*
	*	@param names space-delimited names.
	*/
	public OptionCollector(final String names)
	{
		super(names);
	}

	/**
	*	Returns a list containing collected objects.
	*
	*	@return a list.
	*/
	@Override
	public java.util.List<T> getValue()
	{
		return argList;
	}

	/**
	*	Add parsed argument to list. Argument is parsed by {@link
	*	#parseArg(String)}.
	*
	*	@param arg an argument.
	*	@throws ProcessingException when parse error occurs.
	*/
	@Override
	public void handle(final String arg)
		throws ProcessingException
	{
		argList.add(parseArg(arg));
	}

	/**
	*	Parses an argument and returns an object.
	*
	*	@param arg an argument.
	*	@return an object.
	*	@throws ProcessingException when parse error occurs.
	*/
	abstract protected T parseArg(final String arg)
		throws ProcessingException;

	private final java.util.ArrayList<T> argList
		=new java.util.ArrayList<T>();
}
