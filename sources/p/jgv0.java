package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jgv0 {
    public final ji0 a;
    public final int b;
    public final int c;
    public final String d;

    public jgv0(int i, int i2, String str, ji0 ji0Var) {
        this.a = ji0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgv0)) {
            return false;
        }
        jgv0 jgv0Var = (jgv0) obj;
        return u890.j(this.a, jgv0Var.a) && this.b == jgv0Var.b && this.c == jgv0Var.c && u890.j(this.d, jgv0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
