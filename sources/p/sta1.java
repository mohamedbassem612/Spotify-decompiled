package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sta1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sta1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sta1)) {
            return false;
        }
        sta1 sta1Var = (sta1) obj;
        return this.a == sta1Var.a && this.b == sta1Var.b && this.c == sta1Var.c && this.d == sta1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
