package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nxo1 extends f3m0 implements jce1 {
    public final kce1 f;

    public nxo1(lce1 lce1Var, Executor executor, ecp1 ecp1Var, kce1 kce1Var) {
        super(lce1Var, executor);
        this.f = kce1Var;
        ikj1 ikj1Var = new ikj1();
        ikj1Var.c = kce1Var.a() ? p0p1.TYPE_THICK : p0p1.TYPE_THIN;
        fqn1 fqn1Var = new fqn1((byte) 11);
        dmj1 dmj1Var = new dmj1((byte) 16);
        dmj1Var.b = e8p1.LATIN;
        fqn1Var.d = new g8p1(dmj1Var);
        ikj1Var.d = new t7p1(fqn1Var);
        lqn1.a(1, new hw9(ecp1Var, new jcp1(ikj1Var, 1), r0p1.ON_DEVICE_TEXT_CREATE, ecp1Var.c(), (byte) 18));
    }

    @Override // p.upq0
    public final pl10[] a() {
        return h5p1.I(this.f);
    }
}
