package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tcz0 implements h0r0 {
    public final qyj a;
    public final vcz0 b;
    public final kly0 c;
    public final cbr0 d;

    public tcz0(qyj qyjVar, vcz0 vcz0Var, jxp jxpVar, los losVar) {
        this.a = qyjVar;
        this.b = vcz0Var;
        this.c = jxpVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.L5(), nik1.A6, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, true, (nsm0) null, 3613), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-199039664, new y6w0(this, (byte) 29), true));
    }
}
