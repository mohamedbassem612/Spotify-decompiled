package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y0p1 extends k9 {
    public final qok0 c;

    public y0p1(qok0 qok0Var) {
        super((byte) 9);
        this.c = qok0Var;
    }

    public final Object C0(Object obj) {
        kce1 kce1Var = (kce1) obj;
        ecp1 ecp1VarR = ucp1.r(kce1Var.b());
        Context contextB = this.c.b();
        mz40.b.getClass();
        return new lce1(ecp1VarR, (h450.b(contextB) >= 204700000 || kce1Var.a()) ? new txn1(contextB, kce1Var, ecp1VarR) : new wh41(contextB), kce1Var);
    }
}
