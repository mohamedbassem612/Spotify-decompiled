package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c111 implements h0r0 {
    public final sjw0 a;
    public final ieb0 b;
    public final cz01 c;
    public final cbr0 d;

    public c111(sjw0 sjw0Var, gx81 gx81Var, ieb0 ieb0Var, cz01 cz01Var) {
        this.a = sjw0Var;
        this.b = ieb0Var;
        this.c = cz01Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131962593));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.q5(), nik1.J4, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return gx81.a(new a111(this, (byte) 0), new dx81(new b111(this), new a111(this, (byte) 1), new hfb((byte) 22)));
    }
}
