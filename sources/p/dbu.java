package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dbu implements ebr0 {
    public final a8e0 a;
    public final ytp0 b;
    public final bbp c;
    public final tzo d;
    public final lik1 e;

    public dbu(a8e0 a8e0Var, ytp0 ytp0Var, bbp bbpVar, tzo tzoVar, lik1 lik1Var) {
        this.a = a8e0Var;
        this.b = ytp0Var;
        this.c = bbpVar;
        this.d = tzoVar;
        this.e = lik1Var;
    }

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        tzo tzoVar = this.d;
        lik1 lik1Var = this.e;
        return new rau(this.a, this.b, this.c, (abu) parcelable, tzoVar, lik1Var);
    }
}
