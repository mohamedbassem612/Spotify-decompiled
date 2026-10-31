package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c9d1 {
    public final w8d1 a;
    public final int b;
    public final String c;
    public final int d;

    public c9d1(w8d1 w8d1Var, int i, String str, int i2) {
        this.a = w8d1Var;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9d1)) {
            return false;
        }
        c9d1 c9d1Var = (c9d1) obj;
        return u890.j(this.a, c9d1Var.a) && this.b == c9d1Var.b && this.c.equals(c9d1Var.c) && this.d == c9d1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
