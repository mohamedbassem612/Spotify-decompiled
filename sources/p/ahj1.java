package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ahj1 {
    public final String a;
    public final String b;
    public final u771 c;
    public final long d;
    public final boolean e;
    public final jlw0 f;

    public ahj1(String str, String str2, u771 u771Var, long j, boolean z, jlw0 jlw0Var) {
        this.a = str;
        this.b = str2;
        this.c = u771Var;
        this.d = j;
        this.e = z;
        this.f = jlw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahj1)) {
            return false;
        }
        ahj1 ahj1Var = (ahj1) obj;
        return u890.j(this.a, ahj1Var.a) && u890.j(this.b, ahj1Var.b) && u890.j(this.c, ahj1Var.c) && vve1.a(this.d, ahj1Var.d) && this.e == ahj1Var.e && u890.j(this.f, ahj1Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(cfm0.g(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31), 31, this.e);
        jlw0 jlw0Var = this.f;
        return iG + (jlw0Var == null ? 0 : jlw0Var.hashCode());
    }
}
