package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lfq0 implements h0r0 {
    public final qyj a;
    public final pfq0 b;
    public final smp0 c;
    public final n9r0 d;
    public final cbr0 e;

    public lfq0(qyj qyjVar, pfq0 pfq0Var, smp0 smp0Var, n9r0 n9r0Var) {
        this.a = qyjVar;
        this.b = pfq0Var;
        this.c = smp0Var;
        this.d = n9r0Var;
        yxe1 yxe1Var = new yxe1(new ehc1("Page Match onboarding"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH3 = yon1.h3();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarH3, oap1.i(pfq0Var.a()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-684791599, new nso0(this, (byte) 16), true));
    }
}
