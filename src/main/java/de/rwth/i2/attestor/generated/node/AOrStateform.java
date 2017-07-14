/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.rwth.i2.attestor.generated.node;

import de.rwth.i2.attestor.generated.analysis.*;

@SuppressWarnings("nls")
public final class AOrStateform extends PStateform
{
    private TLparen _lparen_;
    private PLtlform _leftform_;
    private TOr _or_;
    private PLtlform _rightform_;
    private TRparen _rparen_;

    public AOrStateform()
    {
        // Constructor
    }

    public AOrStateform(
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PLtlform _leftform_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PLtlform _rightform_,
        @SuppressWarnings("hiding") TRparen _rparen_)
    {
        // Constructor
        setLparen(_lparen_);

        setLeftform(_leftform_);

        setOr(_or_);

        setRightform(_rightform_);

        setRparen(_rparen_);

    }

    @Override
    public Object clone()
    {
        return new AOrStateform(
            cloneNode(this._lparen_),
            cloneNode(this._leftform_),
            cloneNode(this._or_),
            cloneNode(this._rightform_),
            cloneNode(this._rparen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrStateform(this);
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PLtlform getLeftform()
    {
        return this._leftform_;
    }

    public void setLeftform(PLtlform node)
    {
        if(this._leftform_ != null)
        {
            this._leftform_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftform_ = node;
    }

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    public PLtlform getRightform()
    {
        return this._rightform_;
    }

    public void setRightform(PLtlform node)
    {
        if(this._rightform_ != null)
        {
            this._rightform_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightform_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lparen_)
            + toString(this._leftform_)
            + toString(this._or_)
            + toString(this._rightform_)
            + toString(this._rparen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._leftform_ == child)
        {
            this._leftform_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        if(this._rightform_ == child)
        {
            this._rightform_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._leftform_ == oldChild)
        {
            setLeftform((PLtlform) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._rightform_ == oldChild)
        {
            setRightform((PLtlform) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}