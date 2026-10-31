package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g0k1 extends w5p1 {
    public final String c;
    public final boolean d;

    public g0k1(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0k1)) {
            return false;
        }
        g0k1 g0k1Var = (g0k1) obj;
        return this.c.equals(g0k1Var.c) && this.d == g0k1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
