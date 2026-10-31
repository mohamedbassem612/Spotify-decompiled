package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivb1 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    public ivb1(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivb1)) {
            return false;
        }
        ivb1 ivb1Var = (ivb1) obj;
        return this.a == ivb1Var.a && this.b == ivb1Var.b && this.c.equals(ivb1Var.c) && this.d == ivb1Var.d && this.e == ivb1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ab80.k(this.d, cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31);
    }
}
