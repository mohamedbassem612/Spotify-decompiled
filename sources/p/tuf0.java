package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tuf0 implements h0r0 {
    public final ix81 a;
    public final xuf0 b;
    public final cbr0 c;

    public tuf0(ix81 ix81Var, xuf0 xuf0Var) {
        this.a = ix81Var;
        this.b = xuf0Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131957997));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.D2(), nik1.B1, (nar0) null), new j0c0(mno1.H), new qod1("made-for-you-hub")}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(new e4f0(this, (byte) 12));
    }
}
