package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ble1 implements h0r0 {
    public final dle1 a;
    public final qyj b;
    public final kly0 c;
    public final ynb0 d;
    public final cbr0 e;

    public ble1(los losVar, dle1 dle1Var, qyj qyjVar, tsq tsqVar, ynb0 ynb0Var) {
        this.a = dle1Var;
        this.b = qyjVar;
        this.c = tsqVar;
        this.d = ynb0Var;
        losVar.c(new qwc1(this, (byte) 20));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarM4 = yon1.M4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarM4, oap1.i(dle1Var.getViewUri()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 1, (mxb) null, losVar, false, false, true, (nsm0) null, 3797), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(815869389, new gsc1(this, (byte) 19), true));
    }
}
