package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g9d1 {
    public final c380 a;
    public final String b;
    public final int c;

    public g9d1(c9 c9Var, String str, int i) {
        this.a = c9Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9d1)) {
            return false;
        }
        g9d1 g9d1Var = (g9d1) obj;
        return this.a.equals(g9d1Var.a) && this.b.equals(g9d1Var.b) && this.c == g9d1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
