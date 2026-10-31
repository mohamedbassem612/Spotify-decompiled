package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tte {
    public final add a;
    public final yhm b;
    public final i4q c;
    public final q8n d;
    public final ynb0 e;

    public tte(add addVar, yhm yhmVar, i4q i4qVar, q8n q8nVar, ynb0 ynb0Var) {
        this.a = addVar;
        this.b = yhmVar;
        this.c = i4qVar;
        this.d = q8nVar;
        this.e = ynb0Var;
    }

    public final void a(String str, String str2, String str3, tv80 tv80Var, boolean z, boolean z2, boolean z3, boolean z4) {
        ute uteVar = new ute(str, str2, str3, z, z2, z3, z4);
        qf4 qf4Var = this.a.a;
        if (qf4Var.h() && qf4Var.j()) {
            this.b.a(uteVar, tv80Var);
            return;
        }
        mfm mfmVarA = this.c.a(new lik1(str3));
        mr20 mr20VarR = o4p1.r(new m441(new us0(this, uteVar, null, (byte) 15)), this.d);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.d(mfmVarA, mr20VarR, yon1.d1(), (bjm) null, tv80Var, 20);
    }
}
