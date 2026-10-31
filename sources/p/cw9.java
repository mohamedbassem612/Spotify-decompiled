package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cw9 {
    public final long a;
    public final idn0 b;
    public final hw61 c;
    public final boolean d;
    public final boolean e;

    public cw9(long j, idn0 idn0Var, hw61 hw61Var, boolean z, boolean z2) {
        this.a = j;
        this.b = idn0Var;
        this.c = hw61Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw9)) {
            return false;
        }
        cw9 cw9Var = (cw9) obj;
        long j = cw9Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && u890.j(this.b, cw9Var.b) && this.c.equals(cw9Var.c) && this.d == cw9Var.d && this.e == cw9Var.e;
    }

    public final int hashCode() {
        int i = u7h.l;
        int iHashCode = Long.hashCode(this.a) * 31;
        idn0 idn0Var = this.b;
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + ((iHashCode + (idn0Var == null ? 0 : idn0Var.hashCode())) * 31)) * 31, 31, this.d);
    }
}
