package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bsa1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bsa1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsa1)) {
            return false;
        }
        bsa1 bsa1Var = (bsa1) obj;
        return this.a == bsa1Var.a && this.b == bsa1Var.b && this.c == bsa1Var.c && this.d == bsa1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
