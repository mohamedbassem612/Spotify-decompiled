package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yc1 implements h0r0 {
    public final yuj a;
    public final cd1 b;
    public final vc1 c;
    public final gj10 d;
    public final cbr0 e;

    public yc1(yuj yujVar, cd1 cd1Var, vc1 vc1Var, gj10 gj10Var) {
        this.a = yujVar;
        this.b = cd1Var;
        this.c = vc1Var;
        this.d = gj10Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131951909));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.y(), cfm0.i("spotify:internal:add-child-plan-member:", cd1Var.a(), nik1.c6), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.e;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.a, f610.e(new p6e0[]{new p6e0()}, new dt0(this, (lnm) null, (byte) 1)), z3i.a, new n7e0(new xc1(this), new ab(this, (byte) 19), new rdx0((byte) 27)));
    }
}
