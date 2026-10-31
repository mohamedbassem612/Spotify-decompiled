package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fn91 implements h0r0 {
    public final qyj a;
    public final lzn0 b;
    public final cbr0 c;

    public fn91(qyj qyjVar, lzn0 lzn0Var) {
        this.a = qyjVar;
        this.b = lzn0Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131959817));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.q5(), nik1.L4, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1952882474, new wh91(this, (byte) 1), true));
    }
}
