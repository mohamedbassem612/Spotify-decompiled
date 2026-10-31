package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p8g1 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public p8g1(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8g1)) {
            return false;
        }
        p8g1 p8g1Var = (p8g1) obj;
        return u890.j(this.a, p8g1Var.a) && this.b == p8g1Var.b && this.c == p8g1Var.c && this.d == p8g1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
