package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bmx0 implements h0r0 {
    public final qyj a;
    public final dz4 b;
    public final cbr0 c;

    public bmx0(qyj qyjVar, dz4 dz4Var) {
        this.a = qyjVar;
        this.b = dz4Var;
        t1r0 t1r0Var = new t1r0(true);
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, s9h1Var, new bn70(yon1.t4(), nik1.j3, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1564422660, new fc3(this, (byte) 19), true));
    }
}
