package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lhc0 {
    public final c380 a;
    public final float b;
    public final long c;
    public final s69 d;
    public final xu30 e;
    public final iu30 f;
    public final bpo g;

    public lhc0(c380 c380Var, float f, long j, s69 s69Var, xu30 xu30Var, iu30 iu30Var, bpo bpoVar) {
        this.a = c380Var;
        this.b = f;
        this.c = j;
        this.d = s69Var;
        this.e = xu30Var;
        this.f = iu30Var;
        this.g = bpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhc0)) {
            return false;
        }
        lhc0 lhc0Var = (lhc0) obj;
        if (!u890.j(this.a, lhc0Var.a) || Float.compare(this.b, lhc0Var.b) != 0) {
            return false;
        }
        long j = lhc0Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && u890.j(this.d, lhc0Var.d) && u890.j(this.e, lhc0Var.e) && u890.j(this.f, lhc0Var.f) && this.g == lhc0Var.g;
    }

    public final int hashCode() {
        c380 c380Var = this.a;
        int iF = x0d.f((c380Var == null ? 0 : c380Var.hashCode()) * 31, 31, this.b);
        int i = u7h.l;
        int iF2 = cy30.f(iF, this.c, 31);
        s69 s69Var = this.d;
        return this.g.hashCode() + ktd.g(this.f, (this.e.hashCode() + ((iF2 + (s69Var != null ? s69Var.hashCode() : 0)) * 31)) * 31, 31);
    }

    public lhc0(c380 c380Var, float f, long j, s69 s69Var, bpo bpoVar) {
        this(c380Var, f, j, s69Var, j830.X0, xdc0.T0, bpoVar);
    }
}
