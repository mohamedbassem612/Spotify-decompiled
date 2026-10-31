package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u8i1 implements h0r0 {
    public final qyj a;
    public final lzn0 b;
    public final e680 c;
    public final w8i1 d;
    public final z710 e;
    public final n9i1 f;
    public boolean g = true;
    public final cbr0 h;

    public u8i1(qyj qyjVar, los losVar, lzn0 lzn0Var, e680 e680Var, w8i1 w8i1Var, z710 z710Var, n9i1 n9i1Var) {
        this.a = qyjVar;
        this.b = lzn0Var;
        this.c = e680Var;
        this.d = w8i1Var;
        this.e = z710Var;
        this.f = n9i1Var;
        losVar.c(new ymg1(this, (byte) 21));
        yxe1 yxe1Var = new yxe1(new jx21(2131963553));
        bt21 bt21Var = new bt21();
        dbr0 nxbVar = new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, true, true, false, (nsm0) null, 3869);
        tc30 tc30Var = new tc30(1);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{yxe1Var, bt21Var, nxbVar, tc30Var, new bn70(yon1.i2(), nik1.I5, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1782236165, new t8i1(this, (byte) 1), true));
    }
}
