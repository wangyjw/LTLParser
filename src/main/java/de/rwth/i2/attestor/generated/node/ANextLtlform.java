/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.rwth.i2.attestor.generated.node;

import de.rwth.i2.attestor.generated.analysis.*;

@SuppressWarnings("nls")
public final class ANextLtlform extends PLtlform
{
    private TNext _next_;
    private PLtlform _ltlform_;

    public ANextLtlform()
    {
        // Constructor
    }

    public ANextLtlform(
        @SuppressWarnings("hiding") TNext _next_,
        @SuppressWarnings("hiding") PLtlform _ltlform_)
    {
        // Constructor
        setNext(_next_);

        setLtlform(_ltlform_);

    }

    @Override
    public Object clone()
    {
        return new ANextLtlform(
            cloneNode(this._next_),
            cloneNode(this._ltlform_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANextLtlform(this);
    }

    public TNext getNext()
    {
        return this._next_;
    }

    public void setNext(TNext node)
    {
        if(this._next_ != null)
        {
            this._next_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._next_ = node;
    }

    public PLtlform getLtlform()
    {
        return this._ltlform_;
    }

    public void setLtlform(PLtlform node)
    {
        if(this._ltlform_ != null)
        {
            this._ltlform_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ltlform_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._next_)
            + toString(this._ltlform_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._next_ == child)
        {
            this._next_ = null;
            return;
        }

        if(this._ltlform_ == child)
        {
            this._ltlform_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._next_ == oldChild)
        {
            setNext((TNext) newChild);
            return;
        }

        if(this._ltlform_ == oldChild)
        {
            setLtlform((PLtlform) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
