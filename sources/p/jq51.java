package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jq51 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jq51(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq51)) {
            return false;
        }
        jq51 jq51Var = (jq51) obj;
        return this.a == jq51Var.a && this.b == jq51Var.b && this.c == jq51Var.c && this.d == jq51Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
