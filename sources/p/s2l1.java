package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s2l1 implements h0r0 {
    public final a8e0 a;
    public final yuq b;
    public final ge8 c;
    public final q6e0 d;
    public final cbr0 e;

    public s2l1(a8e0 a8e0Var, yuq yuqVar, ge8 ge8Var, q6e0 q6e0Var, u2l1 u2l1Var) {
        this.a = a8e0Var;
        this.b = yuqVar;
        this.c = ge8Var;
        this.d = q6e0Var;
        qod1 qod1Var = new qod1(l1d.m("vtec-", u2l1Var.b()));
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{qod1Var, yxe1Var, new bn70(yon1.g6(), nik1.K1, (nar0) null), new hgr0(dgr0.a, 0, 2), new tc30(u2l1Var.a()), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(this.d, new r2l1(this, (byte) 0), new u7r0(a4p1.n(), null, new r2l1(this, (byte) 1), false, false, 122));
    }
}
