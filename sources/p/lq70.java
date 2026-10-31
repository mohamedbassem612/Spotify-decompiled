package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lq70 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public lq70(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq70)) {
            return false;
        }
        lq70 lq70Var = (lq70) obj;
        return this.a.equals(lq70Var.a) && this.b.equals(lq70Var.b) && this.c == lq70Var.c && this.d == lq70Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
