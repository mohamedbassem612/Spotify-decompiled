package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hx70 implements h0r0 {
    public final qyj a;
    public final wmy b;
    public final cbr0 c;

    public hx70(qyj qyjVar, wmy wmyVar) {
        this.a = qyjVar;
        this.b = wmyVar;
        t1r0 t1r0Var = new t1r0(true);
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        bt21 bt21Var = new bt21();
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{t1r0Var, yxe1Var, bt21Var, s9h1Var, new bn70((n6r0) yon1.a2(), nik1.e3, (v8h1) i9p1.y(yon1.a2().c))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(219700758, new jb50(this, (byte) 16), true));
    }
}
