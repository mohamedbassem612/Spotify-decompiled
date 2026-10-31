package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u6a1 {
    public final String a;
    public final long b;
    public final zzq0 c;
    public final t6a1 d;

    public /* synthetic */ u6a1(String str, long j, t6a1 t6a1Var, int i) {
        this(str, j, uyn1.h(3, 0.0f, 0.0f), (i & 8) != 0 ? e2x0.Q0 : t6a1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6a1)) {
            return false;
        }
        u6a1 u6a1Var = (u6a1) obj;
        if (!u890.j(this.a, u6a1Var.a)) {
            return false;
        }
        long j = u6a1Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && u890.j(this.c, u6a1Var.c) && u890.j(this.d, u6a1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return this.d.hashCode() + ((this.c.hashCode() + cy30.f(iHashCode, this.b, 31)) * 31);
    }

    public u6a1(String str, long j, zzq0 zzq0Var, t6a1 t6a1Var) {
        this.a = str;
        this.b = j;
        this.c = zzq0Var;
        this.d = t6a1Var;
    }
}
