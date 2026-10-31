package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gle1 implements h0r0 {
    public final kly0 a;
    public final qyj b;
    public final ynb0 c;
    public final cbr0 d;

    public gle1(los losVar, tsq tsqVar, ile1 ile1Var, qyj qyjVar, ynb0 ynb0Var) {
        this.a = tsqVar;
        this.b = qyjVar;
        this.c = ynb0Var;
        losVar.c(new qwc1(this, (byte) 21));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarN4 = yon1.N4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) p6r0VarN4, oap1.i(ile1Var.getViewUri()), (v8h1) lm5.m(ile1Var.a())), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(-992944617, new gsc1(this, (byte) 20), true));
    }
}
