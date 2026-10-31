package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uod extends j1h1 {
    public final /* synthetic */ byte b;
    public final j1h1 c;

    public /* synthetic */ uod(j1h1 j1h1Var, byte b) {
        this.b = b;
        this.c = j1h1Var;
    }

    @Override // p.j1h1
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // p.j1h1
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // p.j1h1
    public final fg5 c(fg5 fg5Var) {
        byte b = this.b;
        j1h1 j1h1Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return j1h1Var.c(fg5Var);
    }

    @Override // p.j1h1
    public final e1h1 d(a8b0 a8b0Var) {
        byte b = this.b;
        j1h1 j1h1Var = this.c;
        switch (b) {
            case 0:
                e1h1 e1h1VarD = j1h1Var.d(a8b0Var);
                if (e1h1VarD == null) {
                    return null;
                }
                jfg jfgVarS = a8b0Var.t0().s();
                return y2o1.s(e1h1VarD, jfgVarS instanceof y0h1 ? (y0h1) jfgVarS : null);
            default:
                return j1h1Var.d(a8b0Var);
        }
    }

    @Override // p.j1h1
    public final boolean e() {
        byte b = this.b;
        j1h1 j1h1Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return j1h1Var.e();
    }

    @Override // p.j1h1
    public final a8b0 f(int i, a8b0 a8b0Var) {
        byte b = this.b;
        j1h1 j1h1Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return j1h1Var.f(i, a8b0Var);
    }
}
