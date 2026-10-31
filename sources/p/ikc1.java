package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ikc1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ikc1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikc1)) {
            return false;
        }
        ikc1 ikc1Var = (ikc1) obj;
        return this.a == ikc1Var.a && this.b == ikc1Var.b && this.c == ikc1Var.c && this.d == ikc1Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, ab80.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
