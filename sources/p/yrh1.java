package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yrh1 implements h0r0 {
    public final kyj a;
    public final ash1 b;
    public final orh1 c;
    public final dlg1 d;

    public yrh1(kyj kyjVar, ash1 ash1Var, orh1 orh1Var, dlg1 dlg1Var) {
        this.a = kyjVar;
        this.b = ash1Var;
        this.c = orh1Var;
        this.d = dlg1Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.s3(), this.b.getViewUri(), (nar0) null), new hgr0(egr0.a, 0, 2), new ktl1(32)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-251808399, new zyf1(this, (byte) 8), true), new dx81(new xrh1(this), new hbz0(this, (byte) 25), l9x0.V0));
    }
}
