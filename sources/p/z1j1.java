package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z1j1 implements h0r0 {
    public final yuj a;
    public final b2j1 b;
    public final u1j1 c;
    public final pvm0 d;
    public final kuq e;
    public final fgl0 f;
    public final ipe0 g;
    public final cbr0 h;

    public z1j1(yuj yujVar, b2j1 b2j1Var, u1j1 u1j1Var, pvm0 pvm0Var, kuq kuqVar, fgl0 fgl0Var, ipe0 ipe0Var) {
        this.a = yujVar;
        this.b = b2j1Var;
        this.c = u1j1Var;
        this.d = pvm0Var;
        this.e = kuqVar;
        this.f = fgl0Var;
        this.g = ipe0Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131963724));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.T2(), cfm0.i("spotify:multi-user-plan-verification:code:verify:", b2j1Var.a(), nik1.f0), (nar0) null), new pu00(true), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.g.a(yuj.b(this.a, f610.e(new p6e0[0], new l8t0(this, (lnm) null, (byte) 23)), apo.j(424251399, new zyf1(this, (byte) 14), true), new n7e0(new y1j1(this), new c1j1(this, (byte) 1), c4x0.W0, nvi1.Y)));
    }
}
