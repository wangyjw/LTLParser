/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.rwth.i2.attestor.generated.analysis;

import de.rwth.i2.attestor.generated.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStateformLtlform(AStateformLtlform node);
    void caseANextLtlform(ANextLtlform node);
    void caseATermLtlform(ATermLtlform node);
    void caseAUntilLtlform(AUntilLtlform node);
    void caseAReleaseLtlform(AReleaseLtlform node);
    void caseANegStateform(ANegStateform node);
    void caseAAndStateform(AAndStateform node);
    void caseAOrStateform(AOrStateform node);
    void caseATrueTerm(ATrueTerm node);
    void caseAFalseTerm(AFalseTerm node);
    void caseAAtomicpropTerm(AAtomicpropTerm node);

    void caseTAtomicprop(TAtomicprop node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTNeg(TNeg node);
    void caseTNext(TNext node);
    void caseTUntil(TUntil node);
    void caseTRelease(TRelease node);
    void caseTBlank(TBlank node);
    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
