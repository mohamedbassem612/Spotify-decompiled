package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ho5 implements h0r0 {
    public final em3 a;
    public final oo5 b;
    public final lo5 c;
    public final dva d;
    public final jo5 e;
    public final cbr0 f;

    public ho5(gx81 gx81Var, em3 em3Var, oo5 oo5Var, lo5 lo5Var, dva dvaVar, jo5 jo5Var) {
        this.a = em3Var;
        this.b = oo5Var;
        this.c = lo5Var;
        this.d = dvaVar;
        this.e = jo5Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131952377));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.Z4(), nik1.o4, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return gx81.a(new fo5(this, (byte) 0), new dx81(new go5(this), new fo5(this, (byte) 1), new w4b1(this, (byte) 24)));
    }
}
