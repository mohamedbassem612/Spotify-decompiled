package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nd80 implements gfh0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cqs0 b;
    public final /* synthetic */ ven0 c;

    public nd80(boolean z, cqs0 cqs0Var, ven0 ven0Var) {
        this.a = z;
        this.b = cqs0Var;
        this.c = ven0Var;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m248measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        afh0 afh0Var = (afh0) list.get(0);
        afh0 afh0Var2 = (afh0) list.get(1);
        q5t0 q5t0VarH = afh0Var.H(jjl.b(0, 0, 0, 0, 15));
        this.c.setValue(new yr80((((long) q5t0VarH.a) << 32) | (((long) q5t0VarH.b) & 4294967295L)));
        q5t0 q5t0VarH2 = afh0Var2.H(j);
        return ifh0Var.S(q5t0VarH2.a, q5t0VarH2.b, b7x.a, new nk6((this.a && this.b.isEmpty()) ? false : true, q5t0VarH2));
    }
}
