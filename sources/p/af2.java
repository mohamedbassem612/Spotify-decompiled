package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af2 implements h0r0 {
    public final qyj a;
    public final ynb0 b;
    public final if2 c;
    public final f1n0 d;
    public final ov20 e;
    public final cbr0 f;

    public af2(qyj qyjVar, ynb0 ynb0Var, if2 if2Var, f1n0 f1n0Var, ov20 ov20Var) {
        this.a = qyjVar;
        this.b = ynb0Var;
        this.c = if2Var;
        this.d = f1n0Var;
        this.e = ov20Var;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG = yon1.G();
        lik1 lik1Var = jf2.b;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG, fae1.n(), (nar0) null), new q6b(2, if2Var.a()), new hgr0(egr0.a, 0, 2)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(480256774, new xb2(this, (byte) 2), true));
    }
}
