package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s6f1 {
    public final c6f1 a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;

    public s6f1(c6f1 c6f1Var, String str, long j, String str2, long j2) {
        this.a = c6f1Var;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s6f1) {
            s6f1 s6f1Var = (s6f1) obj;
            if (this.a == s6f1Var.a && this.b.equals(s6f1Var.b)) {
                long j = s6f1Var.c;
                int i = u7h.l;
                if (z4h1.b(this.c, j) && this.d.equals(s6f1Var.d) && z4h1.b(this.e, s6f1Var.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = u7h.l;
        return Long.hashCode(this.e) + cy30.d(cy30.f(iD, this.c, 31), 31, this.d);
    }
}
