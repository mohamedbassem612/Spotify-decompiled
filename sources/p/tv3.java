package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tv3 implements h0r0 {
    public final yuj a;
    public final vv3 b;
    public final pv3 c;
    public final ro30 d;
    public final hyy0 e;
    public final cbr0 f;

    public tv3(yuj yujVar, vv3 vv3Var, pv3 pv3Var, ro30 ro30Var, hyy0 hyy0Var) {
        this.a = yujVar;
        this.b = vv3Var;
        this.c = pv3Var;
        this.d = ro30Var;
        this.e = hyy0Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.e4(), cfm0.i("spotify:internal:request-allocation:", vv3Var.a(), nik1.l0), (nar0) null), new kce0()}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(f610.e(new p6e0[]{new p6e0()}, new rv3(this, (lnm) null, (byte) 0)), f6i.a, new n7e0(new sv3(this), p83.b1, rbc.g), new xvj(f6i.b, (j2i) null, (j2i) null, false, 62));
    }
}
