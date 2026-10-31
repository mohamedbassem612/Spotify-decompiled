package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zgo0 extends z5t implements yro {
    public final qx81 b;

    public zgo0(qx81 qx81Var) {
        this.b = qx81Var;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        return z ? this.b.x0(true) : this;
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return new zgo0(this.b.z0(e0h1Var));
    }

    @Override // p.z5t
    public final qx81 C0() {
        return this.b;
    }

    @Override // p.yro
    public final gmh1 c0(a8b0 a8b0Var) {
        gmh1 gmh1VarW0 = a8b0Var.w0();
        if (!o1h1.f(gmh1VarW0) && !o1h1.e(gmh1VarW0)) {
            return gmh1VarW0;
        }
        if (gmh1VarW0 instanceof qx81) {
            qx81 qx81Var = (qx81) gmh1VarW0;
            qx81 qx81VarX0 = qx81Var.x0(false);
            return !o1h1.f(qx81Var) ? qx81VarX0 : new zgo0(qx81VarX0);
        }
        if (!(gmh1VarW0 instanceof dq20)) {
            eg.o();
            return null;
        }
        dq20 dq20Var = (dq20) gmh1VarW0;
        qx81 qx81Var2 = dq20Var.b;
        qx81 qx81VarX1 = qx81Var2.x0(false);
        if (o1h1.f(qx81Var2)) {
            qx81VarX1 = new zgo0(qx81VarX1);
        }
        qx81 qx81Var3 = dq20Var.c;
        qx81 qx81VarX2 = qx81Var3.x0(false);
        if (o1h1.f(qx81Var3)) {
            qx81VarX2 = new zgo0(qx81VarX2);
        }
        return vzn1.q(y3o1.Z(qx81VarX1, qx81VarX2), vzn1.l(gmh1VarW0));
    }

    @Override // p.yro
    public final boolean l0() {
        return true;
    }

    @Override // p.z5t, p.a8b0
    public final boolean u0() {
        return false;
    }

    @Override // p.gmh1
    public final gmh1 z0(e0h1 e0h1Var) {
        return new zgo0(this.b.z0(e0h1Var));
    }
}
