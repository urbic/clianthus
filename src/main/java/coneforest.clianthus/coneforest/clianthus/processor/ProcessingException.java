package coneforest.clianthus.processor;

import coneforest.clianthus.i18n.Messages;

/**
*	Thrown when error occured during options processing.
*/
public class ProcessingException
	extends Exception
{
	/**
	*	Constructor.
	*
	*	@param message message text.
	*/
	public ProcessingException(final String message)
	{
		super(Messages.format("optProcExcpn", message));
	}
}
