package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g691 {
    public final String a;
    public final int b;
    public final int c;

    public g691(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g691)) {
            return false;
        }
        g691 g691Var = (g691) obj;
        return this.a.equals(g691Var.a) && this.b == g691Var.b && this.c == g691Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
