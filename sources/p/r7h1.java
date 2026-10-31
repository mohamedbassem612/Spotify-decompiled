package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r7h1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public r7h1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7h1)) {
            return false;
        }
        r7h1 r7h1Var = (r7h1) obj;
        return this.a == r7h1Var.a && this.b == r7h1Var.b && this.c == r7h1Var.c && this.d == r7h1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
