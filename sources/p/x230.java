package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x230 implements h0r0 {
    public final qyj a;
    public final f330 b;
    public final z230 c;
    public final cbr0 d;

    public x230(qyj qyjVar, f330 f330Var, los losVar, z230 z230Var) {
        this.a = qyjVar;
        this.b = f330Var;
        this.c = z230Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.U2(), nik1.f7, (nar0) null), new nxb((Integer) null, (ixb) null, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4063), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-40258967, new rr10(this, (byte) 10), true));
    }
}
