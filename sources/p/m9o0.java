package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m9o0 implements h0r0 {
    public final a8e0 a;
    public final hvp0 b;
    public final lo8 c;
    public final cbr0 d;

    public m9o0(a8e0 a8e0Var, hvp0 hvp0Var, lo8 lo8Var) {
        this.a = a8e0Var;
        this.b = hvp0Var;
        this.c = lo8Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131959111));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.k6(), nik1.x2, (nar0) null), new j0c0(mno1.p), new qod1("new_episodes")}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, this.b.h(), new y3o0(this, (byte) 2));
    }
}
