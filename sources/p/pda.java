package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pda implements h0r0 {
    public final qyj a;
    public final cbr0 b;

    static {
        cbr0 cbr0Var = cbr0.c;
    }

    public pda(qyj qyjVar) {
        this.a = qyjVar;
        yxe1 yxe1Var = new yxe1(new ehc1("baselineprofile_title"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.O1(), nik1.z0, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(d9i.a);
    }
}
