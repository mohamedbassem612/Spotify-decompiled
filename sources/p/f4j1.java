package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f4j1 implements h0r0 {
    public final qyj a;
    public final ttq b;
    public final cbr0 c;

    public f4j1(qyj qyjVar, ttq ttqVar) {
        this.a = qyjVar;
        this.b = ttqVar;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.d6(), d5j1.a(), (nar0) null), new q6b(3, false), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(81154034, new muh1(this, (byte) 11), true));
    }
}
