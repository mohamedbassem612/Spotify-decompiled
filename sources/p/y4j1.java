package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4j1 implements h0r0 {
    public final qyj a;
    public final ttq b;
    public final z4j1 c;
    public final cbr0 d;

    public y4j1(qyj qyjVar, ttq ttqVar, z4j1 z4j1Var) {
        this.a = qyjVar;
        this.b = ttqVar;
        this.c = z4j1Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.d6(), d5j1.b(), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1444161174, new muh1(this, (byte) 12), true));
    }
}
