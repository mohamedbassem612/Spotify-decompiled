package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dug1 implements h0r0 {
    public final fug1 a;
    public final kyj b;
    public final los c;
    public final aug1 d;
    public final cbr0 e;

    public dug1(fug1 fug1Var, kyj kyjVar, los losVar, aug1 aug1Var) {
        this.a = fug1Var;
        this.b = kyjVar;
        this.c = losVar;
        this.d = aug1Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.e3(), nik1.L5.b(fug1Var.a().a()), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 3869)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(1390831833, new zyf1(this, (byte) 6), true), new dx81(new cug1(this), new ymg1(this, (byte) 7), new lfb((byte) 28)));
    }
}
