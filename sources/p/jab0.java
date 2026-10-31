package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jab0 implements h0r0 {
    public final qyj a;
    public final sab0 b;
    public final glp c;
    public final lzn0 d;
    public final cbr0 e;

    public jab0(qyj qyjVar, sab0 sab0Var, glp glpVar, lzn0 lzn0Var, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = sab0Var;
        this.c = glpVar;
        this.d = lzn0Var;
        yxe1 yxe1Var = new yxe1(new ehc1("Page Match landing"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG3 = yon1.g3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarG3, oap1.i(sab0Var.a()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1200469415, new gs90(this, (byte) 20), true));
    }
}
