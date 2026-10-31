package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mdc implements h0r0 {
    public final qyj a;
    public final cab b;
    public final cbr0 c;

    public mdc(qyj qyjVar, cab cabVar) {
        this.a = qyjVar;
        this.b = cabVar;
        yxe1 yxe1Var = new yxe1(new jx21(2131953040));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.a5(), nik1.R4, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1697850317, new cka(this, (byte) 15), true));
    }
}
