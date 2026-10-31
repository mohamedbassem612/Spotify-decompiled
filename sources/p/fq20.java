package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fq20 extends dq20 implements yro {
    @Override // p.yro
    public final gmh1 c0(a8b0 a8b0Var) {
        gmh1 gmh1VarZ;
        gmh1 gmh1VarW0 = a8b0Var.w0();
        if (gmh1VarW0 instanceof dq20) {
            gmh1VarZ = gmh1VarW0;
        } else {
            if (!(gmh1VarW0 instanceof qx81)) {
                eg.o();
                return null;
            }
            qx81 qx81Var = (qx81) gmh1VarW0;
            gmh1VarZ = y3o1.Z(qx81Var, qx81Var.x0(true));
        }
        return vzn1.q(gmh1VarZ, vzn1.l(gmh1VarW0));
    }

    @Override // p.yro
    public final boolean l0() {
        qx81 qx81Var = this.b;
        return (qx81Var.t0().s() instanceof y0h1) && u890.j(qx81Var.t0(), this.c.t0());
    }

    @Override // p.dq20
    public final String toString() {
        return "(" + this.b + ".." + this.c + ')';
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new fq20(this.b, this.c);
    }

    @Override // p.gmh1
    public final gmh1 x0(boolean z) {
        return y3o1.Z(this.b.x0(z), this.c.x0(z));
    }

    @Override // p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new fq20(this.b, this.c);
    }

    @Override // p.gmh1
    public final gmh1 z0(e0h1 e0h1Var) {
        return y3o1.Z(this.b.z0(e0h1Var), this.c.z0(e0h1Var));
    }
}
