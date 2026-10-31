package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g791 {
    public final String a;
    public final int b;
    public final int c;

    public g791(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g791)) {
            return false;
        }
        g791 g791Var = (g791) obj;
        return u890.j(this.a, g791Var.a) && this.b == g791Var.b && this.c == g791Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
