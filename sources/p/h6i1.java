package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h6i1 implements i6i1 {
    public final long a;
    public final String b;
    public final z5i1 c;
    public final boolean d;

    public h6i1(long j, String str, z5i1 z5i1Var, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z5i1Var;
        this.d = z;
    }

    public static h6i1 b(h6i1 h6i1Var, y5i1 y5i1Var) {
        return new h6i1(h6i1Var.a, h6i1Var.b, y5i1Var, h6i1Var.d);
    }

    public final z5i1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6i1)) {
            return false;
        }
        h6i1 h6i1Var = (h6i1) obj;
        return this.a == h6i1Var.a && u890.j(this.b, h6i1Var.b) && this.c.equals(h6i1Var.c) && this.d == h6i1Var.d;
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
