package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t620 implements h0r0 {
    public final e720 a;
    public final qyj b;
    public final jhp c;
    public final cbr0 d;

    public t620(e720 e720Var, qyj qyjVar, jhp jhpVar) {
        this.a = e720Var;
        this.b = qyjVar;
        this.c = jhpVar;
        t1r0 t1r0Var = new t1r0(true);
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        s9h1 s9h1Var = new s9h1(14, true, false, false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{t1r0Var, yxe1Var, s9h1Var, new bn70(yon1.E1(), nik1.K1, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(1243609285, new rr10(this, (byte) 1), true));
    }
}
