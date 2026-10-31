package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jlg1 implements h0r0 {
    public final dlg1 a;
    public final kyj b;
    public final amg1 c;
    public final cmg1 d;

    public jlg1(dlg1 dlg1Var, kyj kyjVar, amg1 amg1Var, cmg1 cmg1Var) {
        this.a = dlg1Var;
        this.b = kyjVar;
        this.c = amg1Var;
        this.d = cmg1Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.o2(), nik1.N3, (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(-1621817797, new zyf1(this, (byte) 5), true), new dx81(new ilg1(this), new ibf1(this, (byte) 28), jcx0.U0, zdg1.O0));
    }
}
