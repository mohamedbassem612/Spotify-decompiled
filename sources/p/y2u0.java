package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y2u0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public y2u0(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final boolean a(m4m m4mVar) {
        boolean z;
        if (!this.c) {
            int iOrdinal = m4mVar.ordinal();
            if (iOrdinal != 0) {
                z = iOrdinal != 1 ? false : this.a;
            } else {
                z = this.b;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2u0)) {
            return false;
        }
        y2u0 y2u0Var = (y2u0) obj;
        return this.a == y2u0Var.a && this.b == y2u0Var.b && this.c == y2u0Var.c && this.d == y2u0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
