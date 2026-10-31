package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tc60 implements ez00 {
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public tc60(String str, int i, int i2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc60)) {
            return false;
        }
        tc60 tc60Var = (tc60) obj;
        return this.a == tc60Var.a && this.b.equals(tc60Var.b) && this.c == tc60Var.c && this.d == tc60Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
