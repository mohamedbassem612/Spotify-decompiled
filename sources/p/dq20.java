package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class dq20 extends gmh1 implements gq20 {
    public final qx81 b;
    public final qx81 c;

    public dq20(qx81 qx81Var, qx81 qx81Var2) {
        this.b = qx81Var;
        this.c = qx81Var2;
    }

    public qx81 A0() {
        return this.b;
    }

    public String B0(cht chtVar, cht chtVar2) {
        boolean zN = chtVar2.a.n();
        qx81 qx81Var = this.c;
        qx81 qx81Var2 = this.b;
        if (!zN) {
            return chtVar.C(chtVar.U(qx81Var2), chtVar.U(qx81Var), rzn1.s(this));
        }
        return "(" + chtVar.U(qx81Var2) + ".." + chtVar.U(qx81Var) + ')';
    }

    @Override // p.a8b0
    public zpi0 E() {
        return A0().E();
    }

    @Override // p.a8b0
    public final List r0() {
        return A0().r0();
    }

    @Override // p.a8b0
    public final e0h1 s0() {
        return A0().s0();
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return A0().t0();
    }

    public String toString() {
        return cht.e.U(this);
    }

    @Override // p.a8b0
    public final boolean u0() {
        return A0().u0();
    }
}
