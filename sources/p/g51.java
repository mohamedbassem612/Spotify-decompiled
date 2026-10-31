package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g51 extends x3p1 {
    public final String c;
    public final String d;
    public final boolean e;
    public final bk8 f;

    public g51(String str, String str2, bk8 bk8Var, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj;
        return u890.j(this.c, g51Var.c) && u890.j(this.d, g51Var.d) && this.e == g51Var.e && this.f == g51Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        bk8 bk8Var = this.f;
        return iG + (bk8Var == null ? 0 : bk8Var.hashCode());
    }

    public final String x() {
        return this.d;
    }

    public final String y() {
        return this.c;
    }
}
