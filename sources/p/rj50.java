package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rj50 {
    public final add a;
    public final yhm b;
    public final i4q c;
    public final q8n d;
    public final ynb0 e;

    public rj50(add addVar, yhm yhmVar, i4q i4qVar, q8n q8nVar, ynb0 ynb0Var) {
        this.a = addVar;
        this.b = yhmVar;
        this.c = i4qVar;
        this.d = q8nVar;
        this.e = ynb0Var;
    }

    public final void a(String str, String str2, zks0 zks0Var, String str3, tv80 tv80Var) {
        sj50 sj50Var = new sj50(str, str2, zks0Var, str3);
        qf4 qf4Var = this.a.a;
        if (qf4Var.h() && qf4Var.u()) {
            this.b.a(sj50Var, tv80Var);
            return;
        }
        mfm mfmVarA = this.c.a(new lik1(str2));
        mr20 mr20VarR = o4p1.r(new m441(new rzu(this, sj50Var, null, (byte) 18)), this.d);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.d(mfmVarA, mr20VarR, yon1.s0(), (bjm) null, tv80Var, 20);
    }
}
