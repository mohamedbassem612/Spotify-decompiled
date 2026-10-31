package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j191 implements ec10 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public gc10 f;
    public gtf1 g;

    public j191(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = (byte) 1;
            this.d = 0;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.f = gc10Var;
        gtf1 gtf1VarW = gc10Var.w(SemanticState.ReadOnly, 4);
        this.g = gtf1VarW;
        ge30 ge30Var = new ge30();
        String str = this.c;
        ge30Var.n = asj0.p(str);
        ge30Var.o = asj0.p(str);
        xvj1.q(ge30Var, gtf1VarW);
        this.f.s();
        this.f.c(new l191());
        this.e = (byte) 1;
    }

    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            bhn0.w();
            return 0;
        }
        gtf1 gtf1Var = this.g;
        gtf1Var.getClass();
        int iE = gtf1Var.e(fc10Var, SemanticState.ReadOnly, true);
        if (iE != -1) {
            this.d += iE;
            return 0;
        }
        this.e = (byte) 2;
        this.g.b(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        int i = this.b;
        int i2 = this.a;
        dm5.y((i2 == -1 || i == -1) ? false : true);
        izr0 izr0Var = new izr0(i);
        ((uyr) fc10Var).d(izr0Var.a, 0, i, false);
        return izr0Var.L() == i2;
    }

    @Override // p.ec10
    public final void release() {
    }
}
