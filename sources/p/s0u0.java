package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s0u0 extends b2p1 {
    public final String c;
    public final String d;
    public final long e;
    public final tv80 f;
    public final long g;
    public final long h;

    public s0u0(String str, String str2, long j, tv80 tv80Var, long j2, long j3) {
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = tv80Var;
        this.g = j2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0u0)) {
            return false;
        }
        s0u0 s0u0Var = (s0u0) obj;
        return this.c.equals(s0u0Var.c) && u890.j(this.d, s0u0Var.d) && this.e == s0u0Var.e && u890.j(this.f, s0u0Var.f) && this.g == s0u0Var.g && this.h == s0u0Var.h;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.d(this.c.hashCode() * 31, 31, this.d), this.e, 31);
        tv80 tv80Var = this.f;
        return Long.hashCode(this.h) + cy30.f((iF + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, this.g, 31);
    }
}
