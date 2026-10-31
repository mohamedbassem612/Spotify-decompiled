package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cw91 extends cqb1 {
    public eps0 c;
    public int d;

    public cw91(long j, eps0 eps0Var) {
        super(j);
        this.c = eps0Var;
    }

    public final void a(cqb1 cqb1Var) {
        cw91 cw91Var = (cw91) cqb1Var;
        synchronized (oho1.a) {
            this.c = cw91Var.c;
            this.d = cw91Var.d;
        }
    }

    public final cqb1 b() {
        return new cw91(pv91.h().g(), this.c);
    }

    public final cqb1 c(long j) {
        return new cw91(j, this.c);
    }

    public final eps0 d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final void f(eps0 eps0Var) {
        this.c = eps0Var;
    }

    public final void g(int i) {
        this.d = i;
    }
}
