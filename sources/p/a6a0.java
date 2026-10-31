package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a6a0 {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final Long d;

    public a6a0(boolean z, boolean z2, Long l, Long l2) {
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6a0)) {
            return false;
        }
        a6a0 a6a0Var = (a6a0) obj;
        return this.a == a6a0Var.a && this.b == a6a0Var.b && u890.j(this.c, a6a0Var.c) && u890.j(this.d, a6a0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
