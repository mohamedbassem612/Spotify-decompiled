package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gwd0 implements h0r0 {
    public final yuj a;
    public final ld80 b;
    public final mzr0 c;
    public final vzd0 d;
    public final yqg e;
    public final rzd0 f;
    public final lzn0 g;
    public final eh30 h;
    public final dqp i;
    public final eqp j;
    public final cbr0 k;

    public gwd0(yuj yujVar, ld80 ld80Var, vhc vhcVar, mzr0 mzr0Var, vzd0 vzd0Var, yqg yqgVar, rzd0 rzd0Var, lzn0 lzn0Var, eh30 eh30Var, dqp dqpVar, eqp eqpVar, eto0 eto0Var) {
        this.a = yujVar;
        this.b = ld80Var;
        this.c = mzr0Var;
        this.d = vzd0Var;
        this.e = yqgVar;
        this.f = rzd0Var;
        this.g = lzn0Var;
        this.h = eh30Var;
        this.i = dqpVar;
        this.j = eqpVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        pu00 pu00Var = new pu00(true);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarX2 = yon1.x2();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.k = new cbr0(new dbr0[]{yxe1Var, pu00Var, new bn70(p6r0VarX2, oap1.i(vzd0Var.b()), (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.k;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        vzd0 vzd0Var = this.d;
        return this.a.a(this.c.q(vzd0Var.b()), apo.j(-1193443746, new ewd0(this, (byte) 2), true), new n7e0(new fwd0(this), new ry90(this, (byte) 5), vhc.m(vzd0Var.a())), new xvj(mwi.b, (j2i) null, apo.j(1567581012, new ewd0(this, (byte) 3), true), false, 58));
    }
}
