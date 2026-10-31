package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rc80 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public rc80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc80)) {
            return false;
        }
        rc80 rc80Var = (rc80) obj;
        return this.a == rc80Var.a && this.b == rc80Var.b && this.c == rc80Var.c && this.d == rc80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
