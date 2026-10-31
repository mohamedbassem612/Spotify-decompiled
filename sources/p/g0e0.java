package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g0e0 {
    public final String a;
    public final String b;
    public final ugf c;
    public final boolean d;
    public final d4f e;

    public g0e0(String str, String str2, d4f d4fVar, ugf ugfVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = ugfVar;
        this.d = z;
        this.e = d4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0e0)) {
            return false;
        }
        g0e0 g0e0Var = (g0e0) obj;
        return u890.j(this.a, g0e0Var.a) && this.b.equals(g0e0Var.b) && this.c == g0e0Var.c && this.d == g0e0Var.d && this.e.equals(g0e0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
