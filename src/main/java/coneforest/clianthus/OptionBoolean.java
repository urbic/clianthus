package coneforest.clianthus;

/**
*	An option holding a {@link Boolean} value.
*/
public class OptionBoolean extends OptionHolder<Boolean>
{
	public OptionBoolean(final String names)
	{
		super(names);
	}

	@Override
	public Boolean parseArg(final String arg)
	{
		return Boolean.parseBoolean(arg);
	}
}
