package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vd21 {
    public final tka0 a;
    public final int b;
    public final ebp1 c;

    public vd21(tka0 tka0Var, int i, ebp1 ebp1Var) {
        this.a = tka0Var;
        this.b = i;
        this.c = ebp1Var;
    }

    public final long a(long j) {
        ebp1 ebp1Var = this.c;
        if (ebp1Var instanceof vpe1) {
            return (long) (((vpe1) ebp1Var).c * 1000.0f);
        }
        if (ebp1Var instanceof upe1) {
            return j - ((long) (((upe1) ebp1Var).c * 1000.0f));
        }
        eg.o();
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd21)) {
            return false;
        }
        vd21 vd21Var = (vd21) obj;
        return u890.j(this.a, vd21Var.a) && this.b == vd21Var.b && this.c.equals(vd21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
