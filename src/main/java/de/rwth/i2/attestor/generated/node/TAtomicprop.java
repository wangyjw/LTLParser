/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.rwth.i2.attestor.generated.node;

import de.rwth.i2.attestor.generated.analysis.*;

@SuppressWarnings("nls")
public final class TAtomicprop extends Token
{
    public TAtomicprop(String text)
    {
        setText(text);
    }

    public TAtomicprop(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAtomicprop(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAtomicprop(this);
    }
}
