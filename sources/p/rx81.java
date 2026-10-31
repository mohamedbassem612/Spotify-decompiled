package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rx81 extends qx81 {
    public final h0h1 b;
    public final List c;
    public final boolean d;
    public final zpi0 e;
    public final iu30 f;

    public rx81(h0h1 h0h1Var, List list, boolean z, zpi0 zpi0Var, iu30 iu30Var) {
        this.b = h0h1Var;
        this.c = list;
        this.d = z;
        this.e = zpi0Var;
        this.f = iu30Var;
        if (!(zpi0Var instanceof wiz) || (zpi0Var instanceof ghe1)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + zpi0Var + '\n' + h0h1Var);
    }

    @Override // p.qx81, p.gmh1
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return z ? new ygo0(this, (byte) 1) : new ygo0(this, (byte) 0);
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return e0h1Var.isEmpty() ? this : new tx81(this, e0h1Var);
    }

    @Override // p.a8b0
    public final zpi0 E() {
        return this.e;
    }

    @Override // p.a8b0
    public final List r0() {
        return this.c;
    }

    @Override // p.a8b0
    public final e0h1 s0() {
        e0h1.b.getClass();
        return e0h1.c;
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return this.b;
    }

    @Override // p.a8b0
    public final boolean u0() {
        return this.d;
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        qx81 qx81Var = (qx81) this.f.invoke(g8b0Var);
        return qx81Var == null ? this : qx81Var;
    }

    @Override // p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        qx81 qx81Var = (qx81) this.f.invoke(g8b0Var);
        return qx81Var == null ? this : qx81Var;
    }
}
